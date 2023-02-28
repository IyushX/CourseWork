#calling the module to use the function in the module for Bill and costume info
import Get_Info
import Return_Bill

#creating a function for if the customer has entered the valid id
def get_valid_id():
    file_info = Get_Info.get_file_info()
    main_data = Get_Info.get_dict_info(file_info)
    valid_input = False
    while valid_input == False:
        ExceptionLoop = True
        while ExceptionLoop == True:
            try:
                sno = int(input("Costume ID needed: "))
                ExceptionLoop = False
            except:
                print("---------------------------------------")
                print("-------Error!!Invalid Input!!------")
                print("---------------------------------------")
                print()
        if sno>0 and sno<=len(main_data):
            print("-------------------------------------------")
            print("Your costume are available to be yet to be returned")
            print("-------------------------------------------")
            print()
            valid_input = True
        else:
            print("---------------------------------------")
            print("-------Error!!Invalid Input!!------")
            print("---------------------------------------")
            print()
    return sno

def get_valid_quantity(valid_id):
    file_info = Get_Info.get_file_info()
    main_data = Get_Info.get_dict_info(file_info)
    quantity = int(main_data[valid_id][3])
    valid_input = False
    while valid_input == False:
        ExceptionLoop = True
        while ExceptionLoop == True:
            try:
                input_quantity = int(input("Amount you would like to Return: "))
                ExceptionLoop = False
            except:
                print("---------------------------------------")
                print("-------Error!!Invalid Input!!------")
                print("---------------------------------------")
                print()
        if input_quantity >0 :
            print("--------------------------------------------------")
            print("Costume has been Returned sucessfully!!")
            print("--------------------------------------------------")
            print()
            valid_input = True
        else:
            print("---------------------------------------")
            print("-------Error!!Invalid Input!!------")
            print("---------------------------------------")
            print()
    return input_quantity

#this fucntion checks the amount of days the costume was rented and give appropriate messages
def Days_Checker():
    y = True
    while y == True:
        rented_days = int(input("How many days since Rented: "))
        if rented_days > 5:
            print("--------------------------------------------------")
            print("You will be Fined for Returning Late")
            print("--------------------------------------------------")
            print()
            y = False
        else:
            print("--------------------------------------------------")
            print("Thank you for Returning in time")
            print("--------------------------------------------------")
            print()
            y = False
        return rented_days

#creating a function for returning the costumes using the above functions
returned_items = []
def Returning():
    fine = 0.25
    total_fine = 0
    
    continueLoop = True
    while continueLoop == True:
        Get_Info.costumes_info()
        print()
        validID = get_valid_id()
        available = get_valid_quantity(validID)
        days = Days_Checker()
        file_info = Get_Info.get_file_info()
        main_data = Get_Info.get_dict_info(file_info)
        #calculating the fine of the customer id returned late
        total_fine = total_fine*((days-5)*fine)
        total_fine += available
        
        no = main_data[validID][2].replace("$","")
        
            
        main_data[validID][3] = str(int(main_data[validID][3]) + available)

        #caluculating the total price of the return made by the customer
        file = open("costume.txt","w")
        for value in main_data.values():
            rewrite_data = value[0]+","+value[1]+","+value[2]+","+value[3]+"\n"
            file.write(rewrite_data)
        file.close()

        returned_items.append([validID,main_data[validID][0],available])
        
        x = False
        while x == False:
            ExceptionLoop =True
            while ExceptionLoop == True:
                try:
                    repeat = input("Would you like to return more: ")
                    ExceptionLoop = False
                except:
                    print()
                    print("---------------------------------------")
                    print("-------Error!!Invalid Input!!------")
                    print("---------------------------------------")

                if repeat == "n":
                    print()
                    name = input("Enter your name: ")
                    contact = input("Phone no: ")
                    print()
                    Return_Bill.bill_for_return(name,contact,total_fine,returned_items)
                    print()
                    Return_Bill.generate_bill(name, contact,total_fine ,returned_items)
                    continueLoop = False
                    x = True
                else:
                    continueLoop = True
                    x = True
