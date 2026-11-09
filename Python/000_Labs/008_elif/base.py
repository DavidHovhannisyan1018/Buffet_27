sigma=int(input("Please enter the first number: "))
fanum=int(input("Please enter the second number: "))
Op= input("Please enter an operation: ")
if Op=="+":
    print(str(sigma)+" + "+str(fanum)+" = "+str(sigma+fanum))
elif Op=="*":
     print(str(sigma)+" * "+str(fanum)+" = "+str(sigma*fanum))
elif Op=="-":
    print(str(sigma)+" - "+str(fanum)+" = "+str(sigma-fanum))
elif Op=="/":
    print(str(sigma)+" / "+str(fanum)+" = "+str(sigma/fanum))        
   