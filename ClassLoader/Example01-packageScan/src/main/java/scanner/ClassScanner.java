package scanner;

import annotation.MyAnnotation;
import com.google.common.collect.ImmutableSet;
import com.google.common.reflect.ClassPath;
import com.google.common.reflect.ClassPath.ClassInfo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClassScanner {
    public void getClassesWithGuava1(String packageName) throws IOException {
        List<String> classes = new ArrayList<String>();
        System.out.println("Class loading started");
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        ClassPath classPath = ClassPath.from(classLoader);
        ImmutableSet<ClassInfo> classSet = classPath.getTopLevelClassesRecursive(packageName);
        if (classSet == null || classSet.isEmpty()) {
            System.out.println("Cannot find and handler");
        } else {
            for (ClassInfo classInfo : classPath.getTopLevelClassesRecursive(packageName)) {
                classes.add(classInfo.getName());
            }
        }
        System.out.println("Class loading finished");
        for (String clazzName : classes) {
            try {
                Class<?> clazz = Class.forName(clazzName);
//                System.out.println("Scanned class " + clazz.getName());
                if (clazz.isAnnotationPresent(MyAnnotation.class)) {
                    System.out.println("@MyAnnotation is used in the " + clazz.getName());
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void getClassesWithGuava2(String packageName) throws IOException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        for (final ClassPath.ClassInfo info : ClassPath.from(classLoader).getTopLevelClasses()) {
            if (info.getName().startsWith(packageName)) {
                final Class<?> clazz = info.load();
                if (clazz.isAnnotationPresent(MyAnnotation.class)) {
                    System.out.println("@MyAnnotation is used in the " + clazz.getName());
                }
            }
        }
    }
}
