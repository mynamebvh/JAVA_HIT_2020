package Bai1;

public class RunMain {
    public static void main(String[] args) {
        Person person = new Employee("Chien", "bac giang", 1000);
        Person per2 = new Customer("hoangdz", "ha noi", 2000);
        person.display();
        per2.display();
    }
}
