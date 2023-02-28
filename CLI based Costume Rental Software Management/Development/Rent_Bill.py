#importing the following modules to get information needed for the bill
import Date_Time
import Get_Info

#creating a function to print the bill after the transcation had been made by the customer
def bill_for_rent(name,contact,grand_total,rented_items):
    print("----------------------------------------------------------------------")
    print("                                   Your Rent Bill                                                ")
    print("----------------------------------------------------------------------")
    print("Customer Name: ", name)
    print("Contact : ",contact)
    print("Rented Date: ", Date_Time.dates())
    print("Your Items:")
    for items in rented_items:
        print(items)
    print("------- ---------------------------------------------------------------")
    print("Grand total: $",grand_total)
    print("----------------------------------------------------------------------")

#Creating a function that generates a bill in differnt text file in a tabular format after the transcation has been made by the customer
def generate_bill(name, contact, grand_total,rented_items):
    file_info = Get_Info.get_file_info()
    main_data = Get_Info.get_dict_info(file_info)
    
    file = open("Rent"+"_"+Date_Time.get_datetime()+"_"+name+".txt","w")
    file.write("________________________________________________________________________"+"\n")
    file.write("                       Costume Rental Bill                                         "+"\n")
    file.write("________________________________________________________________________"+"\n")
    file.write("Customer name: "+name+"\n")
    file.write("Contact : "+contact+"\n")
    file.write("Rented Date: "+Date_Time.dates()+"\n")
    file.write("------------------------------------------------------------------------"+"\n")
    file.write("ID"+"    "+"Name"+"\t"+"            "+"Brand"+"\t"+"       "+"Price"+"\t"+"    "+"Quantity"+"\n")
    file.write("------------------------------------------------------------------------"+"\n")
    for index in range(len(rented_items)):
        c_sno = int(rented_items[index][0])
        c_quantity = int(rented_items[index][2])
        c_name = main_data[c_sno][0]
        c_brand = main_data[c_sno][1]
        c_price = float(main_data[c_sno][2].replace("$","")) * c_quantity
        file.write(str(index+1)+"\t"+c_name+"\t"+c_brand+"\t"+"  "+str(c_price)+"\t"+"       "+str(c_quantity)+"\n")
        file.write("------------------------------------------------------------------------"+"\n")
    file.write("________________________________________________________________________"+"\n")
    file.write("Grand total: $"+str(grand_total)+"\n")
    file.write("________________________________________________________________________"+"\n")
    file.close()
