package reflect;

public class MyClass02PrivateMembers {
    private String name;
    private String surname;

    public MyClass02PrivateMembers() {
    }

    public MyClass02PrivateMembers(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    private String doSomething(String param) {
        return "doing something " + param;
    }
}
