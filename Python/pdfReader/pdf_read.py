import PyPDF2

pdfFileObj = open('R1.pdf', 'rb')

pdfReader = PyPDF2.PdfReader(pdfFileObj)

print(len(pdfReader.pages))

pageObj = pdfReader.pages[0]

print(pageObj.extract_text())

pdfFileObj.close()