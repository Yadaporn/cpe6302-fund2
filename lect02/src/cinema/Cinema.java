//3 Collaborators:
//1. 6330300208 : Yadaporn Ajmontri
//2. 6330300461 Terapat Malaob
//3. 6330300879 Supanut Klakerdpol
package cinema;
import java.util.Scanner;
public class Cinema {
    final static Scanner sn = new Scanner(System.in);
    static void soldTickets() {
        int nr,sr;
        System.out.println("จำนวนแถวที่นั่ง :");
        System.out.print(">");
        nr = sn.nextInt();
        System.out.println("จำนวนที่นั่งในแต่ละแถว :");
        System.out.print(">");
        sr = sn.nextInt();
        int ns = nr*sr;
        int price;
        if  (ns<60){
            price = ns*100;
        }
        else{
            int front = nr/2;
            int back = nr-front;

            price=(front*sr*100)+(back*sr*80);
        }
        System.out.println("รายได้จากการจำหน่ายตั๋ว :");
        System.out.println(price+" บาท");

    }

    static void showSeats(int nr, int nc) {
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int i=1; i<=nc;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        char [][] seat= new char[nr][nc];
        for (int i=0; i<nr;i++)
        {for(int j=0;j<nc;j++)
        {
            seat[i][j]='S';
        }
        }
        for(int i =0;i<nr;i++)
        {
            System.out.print(i+1+" ");
            for(int j=0;j<nc;j++)
            {
                System.out.print(seat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        showSeats( 7, 8);
        soldTickets();

    }
}
