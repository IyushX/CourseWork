#importing the following modules to get information needed for the bill
import Date_Time
import Get_Info

#creating a function to print the bill after the transcation had been made by the customer
def bill_for_return(name,contact,total_fine,returned_items):
    print("----------------------------------------------------------------------")
    print("                             Your Return Bill                                          ")
    print("----------------------------------------------------------------------")
    print("Customer Name: ", name)
    print("Contact: ", contact)
    print("Returned Date: ", Date_Time.dates())
    print("List of Items Returned: ")
    for items in returned_items:
        print(items)
    print("------- ---------------------------------------------------------------")
    print("Fine: $",total_fine)
    print("----------------------------------------------------------------------")

#Creating a function that generates a bill in differnt text file  in a tabular forma after the transcation has been made by the customer
def generate_bill(name, contact,total_fine ,returned_items):
    file_info = Get_Info.get_file_info()
    main_data = Get_Info.get_dict_info(file_info)
    
    file = open("Return"+"_"+Date_Time.get_datetime()+"_"+name+".txt","w")
    file.write("________________________________________________________________________"+"\n")
    file.write("                       Costume Returned Bill                                         "+"\n")
    file.write("________________________________________________________________________"+"\n")
    file.write("Customer name: "+name+"\n")
    file.write("Contact: "+contact+"\n")
    file.write("Rented Date: "+Date_Time.dates()+"\n")
    file.write("------------------------------------------------------------------------"+"\n")
    file.write("ID"+"    "+"Name"+"\t"+"            "+"Brand"+"\t"+"       "+"Price"+"\t"+"    "+"Quantity"+"\n")
    file.write("------------------------------------------------------------------------"+"\n")
    for index in range(len(returned_items)):
        r_sno = int(returned_items[index][0])
        r_quantity = int(returned_items[index][2])
        r_name = main_data[r_sno][0]
        r_brand = main_data[r_sno][1]
        r_price = float(main_data[r_sno][2].replace("$","")) * r_quantity
        file.write(str(index+1)+"\t"+r_name+"\t"+r_brand+"\t"+"  "+str(r_price)+"\t"+"       "+str(r_quantity)+"\n")
        file.write("------------------------------------------------------------------------"+"\n")
    file.write("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+"\n")
    file.write("Fine: $"+str(total_fine)+"\n")
    file.write("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+"\n")
    file.close()
