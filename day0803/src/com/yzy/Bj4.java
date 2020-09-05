package com.yzy;

import java.util.Scanner;

/**
 * 
 * <һ�仰���ܼ���>
 * whileѭ����� 
 * @author  ������
 * @version  [V1.00, 2020��8��3��]
 * @see  [�����/����]
 * @since V1.00
 */
public class Bj4
{
 public static void main(String[] args)
{
     Scanner scanner = new Scanner(System.in);

    //int i=1;
    //while (i<=100)
    //{
  //     
   // System.out.println("第"+i+"次写好好学习，天天向上");
   // i++;
//}   
    //System.out.println("写完结束");
    //System.out.println("=========");
    boolean pass;
    do {
    System.out.println("检查作业是否合格");
        pass=scanner.nextBoolean();
        if (!pass)
        {
            System.out.println("上午学习理论");
            System.out.println("下午上级学习代码");
        }

    } while (!pass);
    
    scanner.close();
}
}
