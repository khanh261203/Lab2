
package bt;

import java.util.Scanner;


public class bai11 
{
    public static void main(String[] arg)
    {
        int m ,n;
        System.out.println(" vui long nhap so dinh ");
        Scanner s = new Scanner(System.in);
        m=n=s.nextInt();
        int [][] matran = new int[n][m];
        nhaptrongso(matran,n,m);
        inmatran(matran,n,m);
 
    }
    private static void inmatran(int[][] matran ,int n,int m )
    {
      for (int i=0; i<n; i++)
      {
          for (int j=0;j < m; j++)
          {
             System.out.print(matran[i][j]+" ");
          }
           System.out.println("");
      }
    
     
    }
    private static void nhaptrongso(int[][]matran,int n,int m)
    {
        Scanner c= new Scanner(System.in);
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
              System.out.printf(" nhap vao trong so tu dinh %d den %d ",(i+1),(j+1));
              matran[i][j]= matran[j][i]= c.nextInt();
            }
        }
    }
    
    
    
    
}
