package reflect;

public class MyClass01 {
    public String name;
    public String surname;

    public MyClass01() {
    }

    public MyClass01(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public String doSomething(String param) {
        return "doing something " + param;
    }
}
