package reflect._01_class;

import java.io.Serializable;
import java.lang.reflect.Modifier;

public class Main01_Class implements Serializable {

    public static void main(String[] args) throws ClassNotFoundException {
        getClass1();

        getClass2();

        getClassName1();

        getClassName2();

        getModifier();

        getPackage();

        getSuperClazz();

        getInterfaces();


    }

    /**
     * If we know the name of the class at compile time we can use .class
     */
    private static void getClass1() {
        System.out.println(Main01_Class.class);
        //class reflect._01_class.Main01_Class
    }

    /**
     * If we do not know the name of the class at compile time we can use Class.forName
     */
    private static void getClass2() throws ClassNotFoundException {
        System.out.println(Class.forName("reflect._01_class.Main01_Class"));
        //class reflect._01_class.Main01_Class
    }

    /**
     * returns with package name
     */
    private static void getClassName1() {
        Class clazz = Main01_Class.class;
        System.out.println(clazz.getName());
        //reflect._01_class.Main01_Class
    }

    /**
     * returns without package name
     */
    private static void getClassName2() {
        Class clazz = Main01_Class.class;
        System.out.println(clazz.getSimpleName());
        //Main01_Class
    }

    private static void getModifier() {
        Class clazz = Main01_Class.class;
        int modifier = clazz.getModifiers();
        System.out.println(modifier);
        //1
        System.out.println("Class Modifier = " + Modifier.toString(modifier));
        //Class Modifier = public
    }

    private static void getPackage() {
        Class clazz = Main01_Class.class;
        System.out.println(clazz.getPackage().getName());
        //reflect._01_class
    }

    private static void getSuperClazz() {
        Class clazz = Main01_Class.class;
        System.out.println(clazz.getSuperclass());
        //class java.lang.Object
    }

    private static void getInterfaces() {
        Class clazz = Main01_Class.class;
        for (Class interf : clazz.getInterfaces()) {
            System.out.println(interf);
        }
        //interface java.io.Serializable
    }
}
