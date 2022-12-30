import tabula
df = tabula.read_pdf('R2.pdf',pages = "all")
print(len(df),"tables found")
print(df[0])
print(df[1])
