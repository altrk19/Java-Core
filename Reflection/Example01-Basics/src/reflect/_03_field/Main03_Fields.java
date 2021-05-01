package reflect._03_field;

import reflect.MyClass01;
import reflect.MyClass02PrivateMembers;

import java.lang.reflect.Field;

public class Main03_Fields {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        getFields();

        getField();

        getFieldName();

        getFieldType();

        getFieldValues();

        setFieldValues();

        getPrivateFields();
    }

    private static void getFields() {
        Field[] fields = MyClass01.class.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }

    private static void getField() throws NoSuchFieldException {
        Field field = MyClass01.class.getField("name");
        System.out.println(field);
    }

    private static void getFieldName() throws NoSuchFieldException {
        Field field = MyClass01.class.getField("name");
        System.out.println(field.getName());
        //name
    }

    private static void getFieldType() throws NoSuchFieldException {
        Field field = MyClass01.class.getField("name");
        System.out.println(field.getType());
        //class java.lang.String
    }

    private static void getFieldValues() throws NoSuchFieldException, IllegalAccessException {
        MyClass01 obj = new MyClass01("ali", "turk");
        Field field = MyClass01.class.getField("name");
        String value = (String) field.get(obj);
        System.out.println(value);
        //ali
    }

    private static void setFieldValues() throws NoSuchFieldException, IllegalAccessException {
        MyClass01 obj = new MyClass01("ali", "turk");
        Field field = MyClass01.class.getField("surname");
        field.set(obj, "turk2");
        System.out.println(obj);
        //MyClass{name='ali', surname='turk2'}
    }

    public static void getPrivateFields() throws NoSuchFieldException, IllegalAccessException {
        Field privateField = MyClass02PrivateMembers.class.getDeclaredField("name");
        privateField.setAccessible(true);

        String fieldValue = (String) privateField.get(new MyClass02PrivateMembers("ali","turk"));
        System.out.println("fieldValue = " + fieldValue);
        //fieldValue = ali
    }
}
