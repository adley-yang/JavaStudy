/**
 * Project Name:java
 * Package Name:com.study.classloader
 * Date:14-12-25 下午12:23
 * Copyright (c) 2014, adleyyang.cn@gmail.com All Rights Reserved.
 */
public class TestLoad {

    private int num;
    private String str;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public TestLoad() {
        System.out.println("newInstance TestLoad");
    }
    public static void main(String[] args) {
        System.out.println("Hello TestLoad");
    }

    public void testMethod(){
        System.out.println("testMethod");
    }

    public void testMethod(String param){
        System.out.println("testMethod ,param:"+param);
    }

}
