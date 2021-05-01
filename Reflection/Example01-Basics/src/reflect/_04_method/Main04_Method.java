package reflect._04_method;

import reflect.MyClass01;
import reflect.MyClass02PrivateMembers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main04_Method {
    public static void main(String[] args)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        getMethods();

        getMethod();

        getParameterTypes();

        getReturnType();

        invokeMethod();

        getPrivateMethods();
    }

    private static void getMethods() {
        Method[] methods = MyClass01.class.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        //public java.lang.String reflect.MyClass.toString()
        //public void reflect.MyClass.doSomething()
        //public final void java.lang.Object.wait() throws java.lang.InterruptedException
        //public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
        //public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
        //public boolean java.lang.Object.equals(java.lang.Object)
        //public native int java.lang.Object.hashCode()
        //public final native java.lang.Class java.lang.Object.getClass()
        //public final native void java.lang.Object.notify()
        //public final native void java.lang.Object.notifyAll()
    }

    private static void getMethod() throws NoSuchMethodException {
        Method method = MyClass01.class.getMethod("doSomething", String.class);
        System.out.println(method);
        //public void reflect.MyClass.doSomething(java.lang.String)
    }

    private static void getParameterTypes() throws NoSuchMethodException {
        Method method = MyClass01.class.getMethod("doSomething", String.class);
        Class[] parameterTypes = method.getParameterTypes();
        for (Class parameter : parameterTypes) {
            System.out.println(parameter);
        }
        //class java.lang.String
    }

    private static void getReturnType() throws NoSuchMethodException {
        Method method = MyClass01.class.getMethod("doSomething", String.class);
        Class returnType = method.getReturnType();
        System.out.println(returnType);
        //class java.lang.String
    }

    private static void invokeMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = MyClass01.class.getMethod("doSomething", String.class);
        String result = (String) method.invoke(new MyClass01(), "parameter-invoked-method");
        System.out.println(result);
        //doing something parameter-invoked-method
    }

    private static void getPrivateMethods()
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method privateMethod = MyClass02PrivateMembers.class.getDeclaredMethod("doSomething", String.class);
        privateMethod.setAccessible(true);

        String returnValue =
                (String) privateMethod.invoke(new MyClass02PrivateMembers("ali", "turk"), "private-method-pameter");
        System.out.println("returnValue = " + returnValue);
        //returnValue = doing something private-method-pameter
    }

}
