public class Person {
    String name, address, phoneNumber, email;

    Person(String n) {
        name = n;
    }

    public String toString() {
        return "Person " + name;
    }

    public static void main(String args[]) {
        Person person = new Person(": Tushar Kumar"), student = new Student(": Atul Kumar"),
                employee = new Employee(": Tushar Kumar"), faculty = new Faculty(": Random Person"),
                staff = new Staff(": Nobody Here"), people[] = { person, student, employee, faculty, staff };
        for (Person p : people)
            System.out.println(p);
    }

    static class Student extends Person {
        Student(String n) {
            super(n);
        }

        enum Status {
            freshman, sophomore, junior, senior
        }

        Status classStatus;

        @Override
        public String toString() {
            return "Student " + name;
        }
    }

    static class Employee extends Person {
        Employee(String n) {
            super(n);
        }

        String office, hireDate;
        double salary;

        public String toString() {
            return "Employee " + name;
        }
    }

    static class Faculty extends Employee {
        Faculty(String n) {
            super(n);
        }

        String officeHours, rank;

        public String toString() {
            return "Faculty " + name;
        }
    }

    static class Staff extends Employee {
        Staff(String n) {
            super(n);   
        }

        String title;

        public String toString() {
            return "Staff " + name;
        }
    }
}
