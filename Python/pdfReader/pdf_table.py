import tabula
df = tabula.read_pdf('R1.pdf',pages = "all")
print(df[1])
print(type(df))
print(type(df[0]))