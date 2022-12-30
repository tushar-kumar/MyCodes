from PIL import Image
import pytesseract
pytesseract.pytesseract.tesseract_cmd = r'C:\Users\KIYO\AppData\Local\Tesseract-OCR\tesseract.exe'

file = Image.open("Image17.jpg")
str = pytesseract.image_to_string(file, lang='eng')

print(str)