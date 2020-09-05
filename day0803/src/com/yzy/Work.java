package com.yzy;

import java.util.Scanner;

/**
 * 作业订正
 * @author  杨治宇
 * @version  [V1.00, 2020年8月3日]
 * @see  [相关类/方法]
 * @since V1.00
 */
public class Work
{
   public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入一个整数");
    int numb=scanner.nextInt();
    if (numb<=0)
    {
        System.out.println("不是正数");
    }
    else if (numb>=1000||numb<100)
    {
        System.out.println("不是三位数");;
    }
    else {
        int a=numb%10;
        int b=numb/10%10;  
        int c =numb/100;
        if (numb%3==0||a==0||b==0||c==0)
        {
            System.out.println("和3有关");
        }
        else {
            System.out.println("和3无关");
        }
    }
    scanner.close();

} 
}
