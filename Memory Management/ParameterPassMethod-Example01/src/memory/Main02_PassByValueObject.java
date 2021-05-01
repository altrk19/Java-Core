package memory;

public class Main02_PassByValueObject {
    public static void main(String[] args) {
        Person person = new Person("Ali");
        System.out.println("1- Person: " + person);
        changePerson(person);
        System.out.println("3- Person: " + person);

    }

    private static void changePerson(Person person) {
        person = new Person("Umut");
        System.out.println("2- Person: " + person);
    }
}
