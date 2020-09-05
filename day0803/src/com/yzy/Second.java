package com.yzy;

import java.util.Scanner;

/**
 * 
 * 作业 2
 * 
 * 
 * @author 杨治宇
 * @version [V1.00, 2020年8月4日]
 * @see [相关类/方法]
 * @since V1.00
 */
public class Second
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int day;
        do
        {
            System.out.print("请输入数字1-7（输入0结束）");
            day = scanner.nextInt();
            switch (day)
            {
                case 1:
                    System.out.println("今天是MON");
                    break;
                case 2:
                    System.out.println("今天是TUE");
                    break;
                case 3:
                    System.out.println("今天是WED");
                    break;
                case 4:
                    System.out.println("今天是THU");
                    break;
                case 5:
                    System.out.println("今天是FRI");
                    break;
                case 6:
                    System.out.println("今天是SAT");
                    break;
                case 7:
                    System.out.println("今天是SUN");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("请重新输入");
            }
        } while (day != 0);
        System.out.println("程序结束");
        scanner.close();
    }
}
