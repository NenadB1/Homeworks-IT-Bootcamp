package domaci15;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Marko", "Markovic", 2018);
        Employee employee2 = new Employee("Stefan", "Maksimilovic", 2012);
        Employee employee3 = new Employee("Milica", "Arsic", 2013);


        System.out.println("The first employee has been employed for more than 10 years :" + employee1.employmentVerification());
        System.out.println("The second employee has been employed for more than 10 years :" + employee2.employmentVerification());
        System.out.println("The third employee has been employed for more than 10 years :" + employee3.employmentVerification());
    }
}
