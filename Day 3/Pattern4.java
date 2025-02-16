import java.util.Scanner;

class Pattern4{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n=s.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) { // Even row: print in increasing order
                int num = i + 1;
                for (int j = 0; j < n - i; j++) {
                    System.out.print(num++ + " ");
                }
            } else { // Odd row: print in decreasing order
                int num = n;
                for (int j = 0; j < n - i; j++) {
                    System.out.print(num-- + " ");
                }
            }
            System.out.println(); // Move to the next line
     }
 }
}