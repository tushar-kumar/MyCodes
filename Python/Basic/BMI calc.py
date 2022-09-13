print('\t BMI Calculator')
print('\t By Atul Bhai')
print('\n Hello, this is a BMI Calculator!')

w = float(input('please enter your weight in Kg: '))
h = float(input('please enter your height in meters: '))
BMI = w/(h**2)
print("\n Your BMI is",BMI)

if BMI<18.5:
    print("\n Your BMI is \"Underweight\"")
elif 45>BMI>18.5:
    print("\n Your BMI is \"Normal\"")
elif BMI>45:
    print("\n Your BMI is \"overweight\"")

print = input('\n \t Please press Enter to exit')
