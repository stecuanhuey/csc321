# Santiago Tecuanhuey Garcia

# Lab 12 - Python

def calcArea(base, height):
    area = base * height
    return area


userHeight = int(input("Enter the height of your rectangle: "))
userBase = int(input("Enter the base of your rectangle: "))

totalAreaRectangle = calcArea(userBase, userHeight)
print("The area of your rectangle is: ", totalAreaRectangle)

def calcCircle(radius):
    area = 3.14 * (radius * radius)
    return area

userRadius = int(input("Enter the radius of your circle: "))
totalAreaCircle = calcCircle(userRadius)

print("The area of your circle is: ", totalAreaCircle)


