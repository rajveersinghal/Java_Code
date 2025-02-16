import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n=s.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
