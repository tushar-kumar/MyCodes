import io
from PIL import Image
import pytesseract
from wand.image import Image as wi

pdfFile = wi(filename = "sample.pdf", resolution = 300)
image = pdfFile.convert('jpeg')

imageBlobs = []

for img in image.sequence:
	imgPage = wi(image = img)
	imageBlobs.append(imgPage.make_blob('jpeg'))

extract = []

for imgBlob in imageBlobs:
	image = Image.open(io.BytesIO(imgBlob))
	text = pytesseract.image_to_string(image, lang = 'eng')
	extract.append(text)

print(extract)
