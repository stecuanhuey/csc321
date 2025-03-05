# Santiago Tecuanhuey Garcia
# Lab 8 - Python 

x = 0
y = 4
myNum = 8

print("Welcome to the guessing game :) ")
val = int(input("Guess a value from 0 - 9: "))

if val < myNum:
    print("Your number is too low :( Unfortunately, you lose.")
elif val > myNum:
    print("Your number is too high :( Unfortunately, you lose.")
else:
    print("Your number matches my number! You win :) ")

for i in range(y):
    print(" Life is like a box of chocolates. ")

while x < 7:
    print(" Chicken Alfredo Pasta.")
    x = x + 1




