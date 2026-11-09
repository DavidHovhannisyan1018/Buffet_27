day = 365.2422
year = int(input("Please enter a Year that u wanna check: "))
if year%4!=0:
    print(+" is not a leap year")
elif year%100==0 and year %400!=0:
    print(str(year)+" is not a leap year")
else:
    print(str(year)+" is a leap year")    