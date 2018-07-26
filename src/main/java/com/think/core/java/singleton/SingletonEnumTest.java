package com.think.core.java.singleton;

/**
 * Created by esha on 16/05/18.
 */
public class SingletonEnumTest {
    public static void main(String[] args) throws Exception {
        SingletonEnum isntance = SingletonEnum.INSTANCE;
        System.out.println(isntance.hashCode());

        //not allowed below will throw NoSuchMethodException
       /* Constructor cloned = isntance.getClass().getDeclaredConstructor(new Class[0]);
        cloned.setAccessible(true);
        Singleton singleton1 = (Singleton) cloned.newInstance();
        System.out.println(singleton1.hashCode());*/
    }
}
