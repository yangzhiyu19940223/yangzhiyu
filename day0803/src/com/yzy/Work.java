package com.yzy;

import java.util.Scanner;

/**
 * ��ҵ����
 * @author  ������
 * @version  [V1.00, 2020��8��3��]
 * @see  [�����/����]
 * @since V1.00
 */
public class Work
{
   public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("������һ������");
    int numb=scanner.nextInt();
    if (numb<=0)
    {
        System.out.println("��������");
    }
    else if (numb>=1000||numb<100)
    {
        System.out.println("������λ��");;
    }
    else {
        int a=numb%10;
        int b=numb/10%10;  
        int c =numb/100;
        if (numb%3==0||a==0||b==0||c==0)
        {
            System.out.println("��3�й�");
        }
        else {
            System.out.println("��3�޹�");
        }
    }
    scanner.close();

} 
}
