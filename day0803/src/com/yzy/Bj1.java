package com.yzy;

import java.util.Scanner;

/**
 * 
 * switch���
 *  
 * @author  ������
 * @version  [V1.00, 2020��8��4��]
 * @see  [�����/����]
 * @since V1.00
 */
public class Bj1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("����������");
        int rank = scanner.nextInt();
        switch (rank)
        {
            case 1:
                System.out.println("����Ӫ");
                break;
            case 2:
                System.out.println("�ʼǱ�����");
                break;
            case 3:
                System.out.println("�ƶ�Ӳ��");
                break;
            
            default:
                System.out.println("�޽���");
                break;
        }
        scanner.close();
    }
}
