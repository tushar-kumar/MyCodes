import tabula
df = tabula.read_pdf('R2.pdf',pages = "all")
print(len(df),"tables found")
for i in range(0,len(df)):
    print(df[i])
    print("\n")
