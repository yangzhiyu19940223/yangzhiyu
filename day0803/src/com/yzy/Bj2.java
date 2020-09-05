package com.yzy;

import java.util.Scanner;

/**
 * 
 * 接受输入的月份，输入该月的天数
 *  
 * @author  杨治宇
 * @version  [V1.00, 2020年8月4日]
 * @see  [相关类/方法]
 * @since V1.00
 */


public class Bj2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        switch (month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 2:
                System.out.println(28);
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(31);
                break;
            default:
                System.out.println("错误的月份");
        }
        scanner.close();
    }
}
