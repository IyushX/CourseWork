#calling the following module to use the functions in the module  
import Get_Info
import Rent_Bill

#creating a function for if the customer has entered the valid id
def validation_of_id():
    file_info = Get_Info.get_file_info()
    main_data = Get_Info.get_dict_info(file_info)
    valid_input = False
    while valid_input == False:
        ExceptionLoop =True
        while  ExceptionLoop == True:
            try:
                sno = int(input("Costume ID needed: "))
                ExceptionLoop = False
            except:
                print("---------------------------------------")
                print("-------Error!!Invalid Input!!------")
                print("---------------------------------------")
                print()
        if sno>0 and sno<=len(main_data):
            if  int(main_data[sno][3]) == 0:
                print("---------------------------------------------------")
                print("This costume is out of Stock")
                print("----------------------------------------------------")
                print()
                valid_input = False
            else:
                print("---------------------------------------------------")
                print("Your costume are available to be rented.")
                print("----------------------------------------------------")
                print()
                valid_input = True
        else:
                print("---------------------------------------")
                print("-------Error!!Invalid Input!!------")
                print("---------------------------------------")
                print()
                valid_input = False
    return sno

#creating a function for if customer has entered valid quantity that they can rent
def validation_of_quantity(valid_id):
    file_info = Get_Info.get_file_info()
    main_data = Get_Info.get_dict_info(file_info)
    quantity = int(main_data[valid_id][3])
    valid_input = False
    while valid_input == False:
        ExceptionLoop =True
        while  ExceptionLoop == True:
            try:
                input_quantity = int(input("Amount you would like to Rent: "))
                ExceptionLoop =False
            except:
                print("---------------------------------------")
                print("-------Error!!Invalid Input!!------")
                print("---------------------------------------")
                print()
        if input_quantity >0 and input_quantity <=quantity:
            print("--------------------------------------------------")
            print("Costume has been Rented sucessfully!!")
            print("--------------------------------------------------")
            print()
            valid_input = True
        else:
            print("---------------------------------------")
            print("-------Error!!Invalid Input!!------")
            print("---------------------------------------")
            print()
    return input_quantity
    

 #main function that is used for renting the costumes
def Renting():
    grand_total = 0
    price  = 0
    rented_items = []
    continueLoop = True
    while continueLoop == True:
        Get_Info.costumes_info()
        print()
        validID = validation_of_id()
        available = validation_of_quantity(validID)
        file_info = Get_Info.get_file_info()
        main_data = Get_Info.get_dict_info(file_info)
        no = main_data[validID][2].replace("$","")
        #caluculating the total price of the rent made by the customer
        price = float(no)*int(available)
        grand_total += float(price)
        main_data[validID][3] = str(int(main_data[validID][3]) - available)

        #rewriting the values of in the txt file to update the count after rent
        file = open("costume.txt","w")
        for value in main_data.values():
            rewrite_data = value[0]+","+value[1]+","+value[2]+","+value[3]+"\n"
            file.write(rewrite_data)
        file.close()

        rented_items.append([validID,main_data[validID][0],available])
            
        x = False
        while x == False:
                repeat = input("Would you like to rent more: ")

                if repeat == "n":
                    print()
                    name = input("Enter your name: ")
                    contact = input ("Phone no: ")
                    print()
                    Rent_Bill.bill_for_rent(name,contact,grand_total,rented_items)
                    print()
                    Rent_Bill.generate_bill(name, contact,grand_total,rented_items)
                    continueLoop = False
                    x = True
                else:
                    continueLoop = True
                    x = True
