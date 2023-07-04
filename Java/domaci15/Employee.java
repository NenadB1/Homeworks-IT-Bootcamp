package domaci15;

public class Employee {

    String name;

    String surname;

    int yearOfEmployment;

    public Employee(String name, String surname, int yearOfEmployment){

        this.name = name;
        this.surname = surname;
        this.yearOfEmployment = yearOfEmployment;
    }

    public boolean employmentVerification(){

        if((2023 - this.yearOfEmployment) > 10){
            return true;
        } else {
            return false;
        }
    }
}
