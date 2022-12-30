from PyPDF2 import PdfReader

reader = PdfReader("sample.pdf")
for page in reader.pages:
    for image in page.images:
        with open(image.name, "wb") as fp:
            fp.write(image.data)
            file = Image.open("Image17.jpg")