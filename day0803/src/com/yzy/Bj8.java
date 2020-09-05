package com.yzy;

import java.util.Scanner;

/**
 * 
 * ��ϰ
 *  
 * @author  ������
 * @version  [V1.00, 2020��8��3��]
 * @see  [�����/����]
 * @since V1.00
 */
public class Bj8
{
    public static void main(String[] args)
    {
        final int COURSE_COUNT=5;
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        for (int i = 1; i <=5; i++)
        {
            System.out.printf("请输入第%d课的成绩",i);
            sum+=scanner.nextInt();
        }
        System.out.println("总分:"+sum);
        System.out.printf("均分：%.2f",sum*1.0/COURSE_COUNT);
        scanner.close();

    }
}
