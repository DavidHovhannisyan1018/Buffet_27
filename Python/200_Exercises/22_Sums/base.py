num=int(input("Please enter a Number: "))
tum=0
for count in range(1, num):
    print(count, end=" + ")
    tum= tum+count
print(num)
print()
print("The sum is "+str(tum+num))
    