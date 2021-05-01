package memory;

public class Main03_PassByValueObject {
    public static void main(String[] args) {
        Person person = new Person("Ali");
        System.out.println("1- Person: " + person);
        changePersonName(person);
        System.out.println("3- Person: " + person);

    }

    private static void changePersonName(Person person) {
        person.setName("Umut");
        System.out.println("2- Person: " + person);
    }
}
