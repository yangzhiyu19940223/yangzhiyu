package com.yzy;

import java.util.Scanner;

/**
 * 
 * ��ϰ3
 * 
 * @author ������
 * @version [V1.00, 2020��8��3��]
 * @see [�����/����]
 * @since V1.00
 */
public class Third
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�����������е��·ݣ�1~12");
        int month = scanner.nextInt();
        System.out.println("������ѡ��ͷ�Ȳջ��Ǿ��òգ�ͷ�Ȳ�����1�����ò�����2");
        int choose = scanner.nextInt();
        if (month >= 4 && month <= 10)
        {
            if (choose == 1)
            {
                System.out.println("���Ļ�Ʊ�۸�Ϊ��4500.0");
            }
            else
            {
                System.out.println("���Ļ�Ʊ�۸�Ϊ��3000.0");
            }
        }
        else
        {
            if (choose == 1)
            {
                System.out.println("���Ļ�Ʊ�۸�Ϊ��2500.0");
            }
            else
            {
                System.out.println("���Ļ�Ʊ�۸�Ϊ��2000.0");
            }
        }
        scanner.close();
    }
}
