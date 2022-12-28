import fitz
doc = fitz.open('sample.pdf')
for page in doc:
    pix = page.get_pixmap(matrix=fitz.Identity, dpi=None,
                          colorspace=fitz.csRGB, clip=None, alpha=True, annots=True)
    pix.save("samplepdfimage-%i.jpg" % page.number)