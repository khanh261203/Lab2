package com.mycompany.lab2.bai1;

import java.util.Scanner;


public class bai1 {

    public static void ptb1()
    {
        float a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap gt a va b");
        a = sc.nextFloat();
        b = sc.nextFloat();
        if (a==0)
        {
            if (b==0)
            {
                System.out.println("phuong trinh vo so nghiem");
            }
            else 
            {
               System.out.println(" phuong trinh vo nghiem ");
            }
        }
        else
        {
            float x = (float) -b/a;
            System.out.println("phuoeng trinh co nghiem la: " + x);
        }
        
    }package com.mycompany.lab2.bai1;

import java.util.Scanner;


public class bai1 {

    public static void ptb1()
    {
        float a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a b");
        a = sc.nextFloat();
        b = sc.nextFloat();
        if (a==0)
        {
            if (b==0)
            {
                System.out.println("phuong trinh vo so nghiem");
            }
            else 
            {
               System.out.println(" phuong trinh vo nghiem ");
            }
        }
        else
        {
            float x = (float) -b/a;
            System.out.println("phuoeng trinh co nghiem la: " + x);
        }
        
    }
    
    public static void main(String[] arg)
   {
       ptb1();
   }
}
    
    public static void main(String[] arg)
   {
       ptb1();
   }
}