
def merge_dictionaries(a, b):
   return {**a, **b}
  

def merge_dictionaries(a, b):
    c = a.copy()   # make a copy of a 
    c.update(b)    # modify keys and values of a with the b ones
    return c

a = { 'x': 1, 'y': 2}
b = { 'y': 3, 'z': 4}
print(merge_dictionaries(a, b)) 		