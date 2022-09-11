import mysql.connector as str

mycon = str.connect(host = "localhost", user = "root", passwd="atulbhai", database="school")

if mycon.is_connected()==False:
    print("Error")

cursor = mycon.cursor()

st = "insert into student(code,item,company,qty,city,price) values({},'{}','{}',{},'{}',{})".format(111,'Apple','No',75,'HP',29)

cursor.execute(st)

mycon.commit()
