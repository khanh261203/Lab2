
package com.mycompany.lab2.bai3;


import java.util.Scanner;

public class bai3 
{

  public static void tinhtiendien()
  {
   float sodien,sotien;
   Scanner sc = new Scanner(System.in);
   System.out.println("nhap so dien : ");
   sodien = sc.nextFloat();
   if ( sodien < 50)
   {
       sotien = sodien*1000;
   }
   else 
   {
       sotien = 50*1000+(sodien-50)*1200;
   }
   System.out.println("so tien dien can phai tra la: " +tien);
  }
   public static void main(String[] arg)
   {
       tinhtiendien();
   }
}
