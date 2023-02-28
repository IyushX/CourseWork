import datetime
#Getting the the date time minute second for the use of naming the file later on
def get_datetime():
    year = str(datetime.datetime.now().year)
    month = str(datetime.datetime.now().month)
    day = str(datetime.datetime.now().day)
    hour = str(datetime.datetime.now().hour)
    minute = str(datetime.datetime.now().minute)
    second = str(datetime.datetime.now().second)

    date_time = year+month+day+hour+minute+second
    return date_time

#Getting date time for the bill after purchasing or returning
def dates():
    year = str(datetime.datetime.now().year)
    month = str(datetime.datetime.now().month)
    day = str(datetime.datetime.now().day)

    date_only = day+"/"+month+"/"+year
    return date_only
