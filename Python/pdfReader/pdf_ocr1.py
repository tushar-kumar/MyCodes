from PIL import Image
import pytesseract
pytesseract.pytesseract.tesseract_cmd = r'C:\Users\KIYO\AppData\Local\Tesseract-OCR\tesseract.exe'

# file = Image.open("samplepdfimage-0.jpg")
# str = pytesseract.image_to_string(file, lang='eng')

import fitz
doc = fitz.open('sample.pdf')
for page in doc:
    pix = page.get_pixmap(matrix=fitz.Identity, dpi=100,
                          colorspace=fitz.csGRAY, clip=None, alpha=True, annots=True)
    str = pytesseract.image_to_string(pix, lang='eng')
    print(str)
    # pix.save("samplepdfimage-%i.jpg" % page.number)