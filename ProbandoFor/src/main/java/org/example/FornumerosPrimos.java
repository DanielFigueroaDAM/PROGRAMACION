import java.util.Scanner;
public class FornumerosPrimos {
    public static void main(String[] args) {
        int n;
        boolean primo=true;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for (int i=2; i<=n; i++)
        {
            for(int j=2; j<i; j++)
            {
                if (i%j==0) {
                    primo=false;
                }
            }
            if(primo==true)
            {System.out.println(i);}
            primo=true;
        }
    }
}