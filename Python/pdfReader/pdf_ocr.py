from PIL import Image
import pytesseract
pytesseract.pytesseract.tesseract_cmd = r'C:\Users\KIYO\AppData\Local\Tesseract-OCR\tesseract.exe'

file = Image.open("samplepdfimage-0.jpg")
str = pytesseract.image_to_string(file, lang='eng')

print(str)