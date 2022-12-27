from PIL import Image
import pytesseract

file = Image.open("/home/user/sample.png")
str = pytesseract.image_to_string(file, lang='eng')

print(str)