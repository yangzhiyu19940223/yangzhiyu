 package com.yzy;

public class Bj5
{
    public static void main(String[] args)
    {
        char ch='a';
        int num=23;
        float pi=3.1415926f;
        boolean flag=true;
        String name ="mike";
        System.out.printf("ch=%d,num=%x,pi=%10.2f"
        +"flag=%b,name=%-10s",
        (int)ch,num,pi,flag,name);
        System.out.format("num(10)=%1$d");
    }
}
