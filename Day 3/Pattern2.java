import java.util.Scanner;
class Pattern2{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<i+n;j++)
            {  // i=i+1;
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
//draw a pattern using for loop in java
//0 1 2 3 
//1 2 3 4
//2 3 4 5
//3 4 5 6