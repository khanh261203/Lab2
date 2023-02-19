package com.mycompany.lab2;
import com.mycompany.lab2.bai3.bai3;
import com.mycompany.lab2.bai2.bai2;
import com.mycompany.lab2.bai1.bai1;
import java.util.Scanner;

public class bai4
{
    public static void menu ()
    {
       System.out.println("1. phuong trinh bac 1");
       System.out.println("2. phuong trinh bac 2");
       System.out.println("3. tinh tien dien");
       System.out.println("4. ket thuc");
       Scanner sc = new Scanner(System.in);
       int chon = sc.nextInt();


       switch(chon)
       {
           case 1: bai1.ptb1();
           break;
           case 2: bai2.ptb2();
           break;
           case 3:bai3.tinhtiendien();
           break;
           case 4: break;
           default:  
               System.out.println("nhap sai ");
       }
    }
     public static void main(String[] arg)
   {
       menu();
   }
}