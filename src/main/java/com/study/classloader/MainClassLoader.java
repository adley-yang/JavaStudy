package com.study.classloader;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Project Name:java
 * Package Name:com.study.classloader
 * Date:14-12-25 上午11:51
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class MainClassLoader {
    public static void main(String[] args) {
        try {
            MyClassLoader tc = new MyClassLoader("C:\\");
            Class class1 = tc.findClass("TestLoad");

            //取得父类名称
            Class<?>  superClass = class1.getSuperclass();
            System.out.println("加载自定义类的父类名:" + superClass.getName());

            System.out.println("===============================================");


            Field[] fields = class1.getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                System.out.println("类中的成员: " + fields[i]);
            }
            System.out.println("===============================================");


            //取得类方法
            Method[] methods = class1.getDeclaredMethods();
            for (int i = 0; i < methods.length; i++) {
                System.out.println("获取自定义类的方法:");
                System.out.println("函数名:" + methods[i].getName());
                System.out.println("函数返回类型:" + methods[i].getReturnType());
                System.out.println("函数访问修饰符:" + Modifier.toString(methods[i].getModifiers()));
                System.out.println("函数代码写法:" + methods[i]);
            }

            System.out.println("===============================================");

            //取得类实现的接口,因为接口类也属于Class,所以得到接口中的方法也是一样的方法得到哈
            Class<?> interfaces[] = class1.getInterfaces();
            for (int i = 0; i < interfaces.length; i++) {
                System.out.println("实现的接口类名: " + interfaces[i].getName() );
            }

            System.out.println("=================获取自定义类的成员变量=============================");
            Object obj = class1.newInstance();
            Field personNameField = class1.getDeclaredField("num");
            personNameField.setAccessible(true);
            System.out.println("修改属性之前得到属性变量的值:" + personNameField.get(obj));
            personNameField.set(obj, 11);
            System.out.println("修改属性之后得到属性变量的值:" + personNameField.get(obj));


            System.out.println("=================调用自定义类的方法=============================");
            Method method = class1.getMethod("testMethod");
            method.invoke(class1.newInstance());

            method = class1.getMethod("testMethod",String.class);
            method.invoke(class1.newInstance(),"参数");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }catch ( NoSuchMethodException e){
            e.printStackTrace();
        }catch (InvocationTargetException e){
            e.printStackTrace();
        }catch (NoSuchFieldException e){
            e.printStackTrace();
        }

    }
}
