package reflect._05_annotations;

import reflect.MyClass03Annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main05_Annotations {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {
        getClassAnnotations();

        getClassAnnotation();

        getMethodAnnotations();

        getMethodAnnotation();

        getFieldAnnotations();

        getFieldAnnotation();

        getParameterAnnotations();
    }


    private static void getClassAnnotations() {
        Annotation[] annotations = MyClass03Annotations.class.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof MyAnnotation) {
                MyAnnotation myAnnotation = (MyAnnotation) annotation;
                System.out.println("weight: " + myAnnotation.weight());
                System.out.println("height: " + myAnnotation.height());
                //weight: 10
                //height: 15
            }
        }
    }

    private static void getClassAnnotation() {
        Annotation annotation = MyClass03Annotations.class.getAnnotation(MyAnnotation.class);
        if (annotation instanceof MyAnnotation) {
            MyAnnotation myAnnotation = (MyAnnotation) annotation;
            System.out.println("weight: " + myAnnotation.weight());
            System.out.println("height: " + myAnnotation.height());
            //weight: 10
            //height: 15
        }
    }

    private static void getMethodAnnotations() throws NoSuchMethodException {
        Method method = MyClass03Annotations.class.getMethod("doSomething", String.class);
        Annotation[] annotations = method.getDeclaredAnnotations();

        for (Annotation annotation : annotations) {
            if (annotation instanceof MyAnnotation) {
                MyAnnotation myAnnotation = (MyAnnotation) annotation;
                System.out.println("weight: " + myAnnotation.weight());
                System.out.println("height: " + myAnnotation.height());
                //weight: 20
                //height: 25
            }
        }
    }

    private static void getMethodAnnotation() throws NoSuchMethodException {
        Method method = MyClass03Annotations.class.getMethod("doSomething", String.class);
        Annotation annotation = method.getAnnotation(MyAnnotation.class);

        if (annotation != null) {
            MyAnnotation myAnnotation = (MyAnnotation) annotation;
            System.out.println("weight: " + myAnnotation.weight());
            System.out.println("height: " + myAnnotation.height());
            //weight: 20
            //height: 25
        }
    }

    private static void getFieldAnnotations() throws NoSuchFieldException {
        Field field = MyClass03Annotations.class.getField("name");
        Annotation[] annotations = field.getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof MyAnnotation) {
                MyAnnotation myAnnotation = (MyAnnotation) annotation;
                System.out.println("weight: " + myAnnotation.weight());
                System.out.println("height: " + myAnnotation.height());
                //weight: 30
                //height: 35
            }
        }
    }

    private static void getFieldAnnotation() throws NoSuchFieldException {
        Field field = MyClass03Annotations.class.getField("name");
        Annotation annotation = field.getDeclaredAnnotation(MyAnnotation.class);
        if (annotation != null) {
            MyAnnotation myAnnotation = (MyAnnotation) annotation;
            System.out.println("weight: " + myAnnotation.weight());
            System.out.println("height: " + myAnnotation.height());
            //weight: 30
            //height: 35
        }
    }

    private static void getParameterAnnotations() throws NoSuchMethodException {
        Method method = MyClass03Annotations.class.getMethod("doSomethingElse", String.class);
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        Class[] parameterTypes = method.getParameterTypes();

        int i=0;
        for(Annotation[] annotations : parameterAnnotations){
            Class parameterType = parameterTypes[i++];

            for(Annotation annotation : annotations){
                if(annotation instanceof MyAnnotation){
                    MyAnnotation myAnnotation = (MyAnnotation) annotation;
                    System.out.println("param: " + parameterType.getName());
                    System.out.println("weight : " + myAnnotation.weight());
                    System.out.println("height: " + myAnnotation.height());
                    //param: java.lang.String
                    //weight : 40
                    //height: 45
                }
            }
        }

    }


}
