package main

import (
	"fmt"
	"database/sql"
	
	_ "github.com/lib/pq"
)

const (
	host     = "localhost"
	port     = 5432
	user     = "postgres"
	password = "1234"
	dbname   = "my_db"
)

func main() {
	psqlconn := fmt.Sprintf("host=%s port=%d user=%s password=%s dbname=%s sslmode=disable", host, port, user, password, dbname)

	db, err := sql.Open("postgres", psqlconn)
	CheckError(err)

	defer db.Close()

	insertdata := `insert into "Employee" ("Name","EmpID") values('Raman',22)`
	_, e := db.Exec(insertdata)
	CheckError(e)

	insertdataDynamic := `insert into "Employee" ("Name","EmpID") values($1, $2)`
	_, e = db.Exec(insertdataDynamic, "Shubh", 56)
	CheckError(e)

}

func CheckError(err error) {
	if err != nil {
		panic(err)
	}
}
