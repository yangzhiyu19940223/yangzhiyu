package com.yzy;

import java.util.Scanner;

/**
 * 
 * <一句话功能简述>
 * 
 * @author 杨治宇
 * @version [V1.00, 2020年8月4日]
 * @see [相关类/方法]
 * @since V1.00
 */

public class First
{
    public static void main(String[] args)
    {
        int max = 1;
        int sum = 0;
        int min = 1;
        float average = 0;
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数（输入0时结束）");
        int numb = scanner.nextInt();
        if (numb == 0)
        {
            System.out.println("未输入数字");
        }
        else// numb不等于0
        {
            do
            {
                if (i == 0)// 第一个数
                {
                    max = numb;
                    min = numb;
                    sum = numb;
                    average = numb;
                }
                else
                {
                    max = numb > max ? numb : max;
                    min = numb < min ? numb : min;
                    sum = sum + numb;
                    average = (float)(sum * 1.0 / (i + 1));
                }
                System.out.print("请输入一个整数（输入0时结束）");
                numb = scanner.nextInt();
                i++;
            } while (numb != 0);
            System.out.printf("sum=%d,max=%d,min=%d,average=%.2f", sum, max, min, average);
            
            scanner.close();
        }
    }
}
