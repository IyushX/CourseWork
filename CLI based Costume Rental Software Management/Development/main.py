#calling the modules for renting and retunring
import Rent_Validation
import Return_Validation

#Creating a function to display the choice the csutomers have
def options():
    print('Choose your desired task')
    print('1) || Press 1 to rent a costume.')
    print('2) || Press 2 to return a costume.')
    print('3) || Press 3 to exit.')
    print()

#Excpetion loop handling
ExceptionLoop = True
while  ExceptionLoop == True:
    try:
        continueLoop  = True
        while continueLoop == True:
            print('+++++++++++++++++++++++++++++++++++++++++++++++++\n                 Welcome to Costume Rental Shop\n+++++++++++++++++++++++++++++++++++++++++++++++++')
            options()
            choice = int(input("Enter your choice: "))
            if choice == 1:
                #calling the function of renting if chosen
                Rent_Validation.Renting()
        
            elif choice == 2:
                #calling the function of returning if chosen
                Return_Validation.Returning()

            elif choice == 3:
                #ending program if chosen
                continueLoop = False
                print()
                print("*****************************************")
                print("   ||Thank You for Visiting our Store||")
                print("*****************************************")
                print()
                
            else:
                print("---------------------------------------")
                print("    Enter the available options")
                print("---------------------------------------")
                print()
            ExceptionLoop = False
    except:
        print()
        print("---------------------------------------")
        print("-------Error!!Invalid Input!!------")
        print("---------------------------------------")
        print()
    
    
