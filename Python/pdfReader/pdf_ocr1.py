from PIL import Image
import pytesseract

pytesseract.pytesseract.tesseract_cmd = r'C:\Users\KIYO\AppData\Local\Tesseract-OCR\tesseract.exe'

import fitz

doc = fitz.open('sample.pdf')
for page in doc:
    pix = page.get_pixmap(matrix=fitz.Identity, dpi=200,
                          colorspace=fitz.csGRAY, clip=None, alpha=True, annots=True)
    pix.save("samplepdfimage-%i.jpg" % page.number)
    file = Image.open("samplepdfimage-%i.jpg" % page.number)
    str = pytesseract.image_to_string(file, lang='eng')
    print(str)
    print("\n<---------------Next Page------------------->\n")