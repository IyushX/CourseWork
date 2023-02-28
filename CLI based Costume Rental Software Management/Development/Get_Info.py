#Creating a function get the information from the text file 
def get_file_info():
    file = open("costume.txt","r")
    data = file.readlines()
    file.close()
    return data

#Getting the information from above and putting the values and keys in the dictionary
def get_dict_info(file_info):
    data_dict = {}
    for index in range(len(file_info)):
        data_dict[index+1] = file_info[index].replace("\n","").split(",")
    return data_dict

#getting the information from the dictionary and the text file to show the data in a tabular format
def costumes_info():    
    file_info = get_file_info()
    main_data = get_dict_info(file_info)
    print("++++++++++++++++++++++++++++++++++++++++++++++++++++++")
    print("ID","    ","Name","\t","  ","Brand","\t","                ","Price","\t","Quantity")
    print("---------------------------------------------------------------------------------------")
    for key,value in main_data.items():
        print(key,"      ",value[0],"\t","  ",value[1],"\t",value[2],"\t","  ",value[3])
        print("---------------------------------------------------------------------------------------")
    print("++++++++++++++++++++++++++++++++++++++++++++++++++++++++")
