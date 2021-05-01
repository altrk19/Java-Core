package reflect._02_constructor;

import reflect.MyClass01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main02_Constructor {

    public static void main(String[] args)
            throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        getConstructors();

        getConstructor();

        getConstructorParameters();

        instantiateObject();

    }

    private static void getConstructors() {
        Constructor[] constructors = MyClass01.class.getConstructors();
        for(Constructor constructor: constructors){
            System.out.println(constructor);
        }
        //public reflect.MyClass()
        //public reflect.MyClass(java.lang.String,java.lang.String)
    }

    private static void getConstructor() throws NoSuchMethodException {
        Class clazz =  MyClass01.class;
        Constructor constructor = clazz.getConstructor();
        System.out.println(constructor);
        //public reflect.MyClass()

        Constructor constructor2 = clazz.getConstructor(String.class, String.class);
        System.out.println(constructor2);
        //public reflect.MyClass(java.lang.String,java.lang.String)

        //Constructor exception = clazz.getConstructor(String.class);
    }

    private static void getConstructorParameters() throws NoSuchMethodException {
        Constructor constructor = MyClass01.class.getConstructor(String.class, String.class);
        Class[] parameterTypes = constructor.getParameterTypes();
        for(Class clazz2:parameterTypes){
            System.out.println(clazz2);
        }
        //class java.lang.String
        //class java.lang.String
    }

    private static void instantiateObject()
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor constructor = MyClass01.class.getConstructor(String.class, String.class);
        MyClass01 myClass01 = (MyClass01) constructor.newInstance("name1","surname1");
        System.out.println(myClass01);
        //MyClass{name='name1', surname='surname1'}
    }
}
