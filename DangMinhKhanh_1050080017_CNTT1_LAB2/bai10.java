package bt;

import java.util.Arrays;
import java.util.Scanner;

public class bai10 
{
    public static void main (String[] arg)
    {
        int mang[]= new int[4];
        Scanner sc = new Scanner(System.in);
        for (int i =0 ;i<mang.length;i++)
        {
          System.out.printf("nhap phan tu thu %d :",(i+1));
          mang[i] = sc.nextInt();
        }
        System.out.println("phan tu mang " +Arrays.toString(mang));
        Arrays.sort(mang);
        System.out.println("mang sau khi duoc sap xep lai"+Arrays.toString(mang));
        System.out.println("nhap so can xoa ");
        int scx = sc.nextInt();
        int vtcx = timphantu(mang,scx);
        if (vtcx == -1)
        {
         System.out.println("ko co trong mang ");
        
        }
        else
        {
          mang = xoa(mang,vtcx);
          
        }
        for(int i=0;i<mang.length;i++)
        {
            System.out.print(mang[i]+" ");
        }
    }
    static int timphantu(int[]mang,int pt)
    {
     int vt = -1;
     for(int i=0;i<mang.length;i++)
     {
       if (mang[i] == pt)   
       {
           vt = i;
       }
     }
     return vt;
    }
    static int[]  xoa( int[]mang, int vt)    
    {
     int mangmoi[] = new int[mang.length-1 ];
     for (int i = 0 ;i<vt ;i++)
     {
      mangmoi[i] = mang[i];
     }
     for (int i = vt+1 ;i<mang.length; i++)
     {
     mangmoi[i-1] = mang[i];
     }
     System.out.println(" mang sau khi xoa ");
     return mangmoi;
    }
    
   
    
}
