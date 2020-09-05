package com.yzy;

import java.util.Scanner;

/**
 * 
 * 练习3
 * 
 * @author 杨治宇
 * @version [V1.00, 2020年8月3日]
 * @see [相关类/方法]
 * @since V1.00
 */
public class Third
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您出行的月份：1~12");
        int month = scanner.nextInt();
        System.out.println("请问您选择头等舱还是经济舱？头等舱输入1，经济舱输入2");
        int choose = scanner.nextInt();
        if (month >= 4 && month <= 10)
        {
            if (choose == 1)
            {
                System.out.println("您的机票价格为：4500.0");
            }
            else
            {
                System.out.println("您的机票价格为：3000.0");
            }
        }
        else
        {
            if (choose == 1)
            {
                System.out.println("您的机票价格为：2500.0");
            }
            else
            {
                System.out.println("您的机票价格为：2000.0");
            }
        }
        scanner.close();
    }
}
