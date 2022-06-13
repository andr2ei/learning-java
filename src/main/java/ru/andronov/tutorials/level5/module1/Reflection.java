package ru.andronov.tutorials.level5.module1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException,
            NoSuchFieldException, NoSuchMethodException,
            InvocationTargetException, InstantiationException {
        User user = new User("name1", 1);
        Class<? extends User> cl1 = user.getClass();
        Class<User> cl2 = User.class;
        Class<User> cl3 = (Class<User>)Class.forName("ru.andronov.tutorials.level5.module1.User");

        Field age = cl1.getDeclaredField("age");
        age.setAccessible(true);
        age.setInt(user, 22);
        System.out.println("user = " + user);

        MyAnnotation annotation = cl2.getAnnotation(MyAnnotation.class);
        System.out.println("annotation = " + annotation);

        Constructor<User> constructor = cl3.getConstructor(String.class, Integer.TYPE);
        User user2 = constructor.newInstance("name2", 23);
        System.out.println("user2 = " + user2);

        Method getName = cl3.getMethod("getName");
        String name2 = (String)getName.invoke(user2);
        System.out.println("name2 = " + name2);
    }
}
