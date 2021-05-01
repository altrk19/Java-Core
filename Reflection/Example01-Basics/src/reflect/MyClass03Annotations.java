package reflect;

import reflect._05_annotations.MyAnnotation;

@MyAnnotation(weight = "10", height = "15")
public class MyClass03Annotations {
    @MyAnnotation(weight = "30", height = "35")
    public String name;
    public String surname;

    public MyClass03Annotations() {
    }

    public MyClass03Annotations(String name, String surname) {
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

    @MyAnnotation(weight = "20", height = "25")
    public String doSomething(String param) {
        return "doing something " + param;
    }

    public String doSomethingElse(@MyAnnotation(weight = "40", height = "45") String param) {
        return "doing something " + param;
    }

}
