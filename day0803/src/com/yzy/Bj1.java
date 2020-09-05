package com.yzy;

import java.util.Scanner;

/**
 * 
 * switch语句
 *  
 * @author  杨治宇
 * @version  [V1.00, 2020年8月4日]
 * @see  [相关类/方法]
 * @since V1.00
 */
public class Bj1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名次");
        int rank = scanner.nextInt();
        switch (rank)
        {
            case 1:
                System.out.println("夏令营");
                break;
            case 2:
                System.out.println("笔记本电脑");
                break;
            case 3:
                System.out.println("移动硬盘");
                break;
            
            default:
                System.out.println("无奖励");
                break;
        }
        scanner.close();
    }
}
