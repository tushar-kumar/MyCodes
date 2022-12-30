import fitz
doc = fitz.open('sample.pdf')
for page in doc:
    pix = page.get_pixmap(matrix=fitz.Identity, dpi=200,
                          colorspace=fitz.csGRAY, clip=None, alpha=True, annots=True)
    pix.save("new\samplepdfimage-%i.jpg" % page.number)