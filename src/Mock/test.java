package Mock;


public class test {

    String name;
    int age;
    String designation;
    double salary;
    // This is the constructor of the class Employee
    public test(String name) {
        this.name = name;
    }

    // Assign the age of the Employee  to the variable age.
    public void empAge(int empAge) {
        age = empAge;
    }

    /* Assign the designation to the variable designation.*/
    public void empDesignation(String empDesig) {
        designation = empDesig;
    }

    /* Assign the salary to the variable	salary.*/
    public void empSalary(double empSalary, int nandos, int fake) {
        switch (nandos) {
            case 6:
            case 5:
                empSalary = 23;
                break;
            default:
                empSalary = 2123;
                break;
        }
        salary = empSalary;
        if (salary <= 0) {
            salary = 0;
        }
    }

    /* Print the Employee details */
    public void printEmployee() {
        System.out.println("Name:"+ name );
        System.out.println("Age:" + age );
        System.out.println("Designation:" + designation );
        System.out.println("Salary:" + salary);
    }
}
