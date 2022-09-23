package main

import (
	"database/sql"

	"fmt"
	"log"
	"net/http"

	_ "github.com/lib/pq"
)

var db *sql.DB
var err error

type sandbox struct {
	id        int
	Firstname string
	Lastname  string
	Age       int
}

func init() {
	connStr := "postgres://postgres:1234@localhost/postgres?sslmode=disable"
	db, err = sql.Open("postgres", connStr)
	if err != nil {
		panic(err)
	}
	if err = db.Ping(); err != nil {
		panic(err)
	}
	fmt.Println("Now we are connected to POSTGRESQL DATABASE.")

}

func main() {

	// defer db.Close()

	// db.Query("insert into newTable (Firstname,Lastname,Age) values('Raman','Singh',22)")
	// insertdata := `insert into "newTable" ("Firstname","Lastname","Age") values('Raman','Singh',22)`
	// _, e := db.Exec(insertdata)
	// CheckError(e)

	// insertdataDynamic := `insert into "newTable" ("Firstname","Lastname","Age") values($1, $2, $3)`
	// _, e = db.Exec(insertdataDynamic, "Shubh", "Nauti", 20)
	// CheckError(e)

	// fmt.Println("Data Inserted to DB" + e.Error())

	http.HandleFunc("/data", dataRecord)
	http.ListenAndServe(":8080", nil)
}

// func CheckError(err error) {
// 	if err != nil {
// 		panic(err)
// 	}
// }

func dataRecord(w http.ResponseWriter, r *http.Request) {
	fmt.Fprintf(w, "Great Now we are connected to browser\n")
	if r.Method != "GET" {
		http.Error(w, http.StatusText(404), http.StatusMethodNotAllowed)
		return
	}
	rows, err := db.Query("SELECT * FROM newTable")

	if err != nil {
		http.Error(w, http.StatusText(500), http.StatusInternalServerError)
		return
	}
	defer rows.Close()

	snbs := make([]sandbox, 0)

	for rows.Next() {
		snb := sandbox{}
		err := rows.Scan(&snb.id, &snb.Firstname, &snb.Lastname, &snb.Age)
		if err != nil {
			log.Println(err)
			http.Error(w, http.StatusText(500), 500)
			return
		}
		snbs = append(snbs, snb)
	}
	for _, snb := range snbs {
		fmt.Fprintf(w, "%d  %s %s %d\n", snb.id, snb.Firstname, snb.Lastname, snb.Age)
	}
}
