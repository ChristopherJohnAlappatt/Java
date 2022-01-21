import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args) {
        int a=10;
        while (a>0) {
            System.out.println("Have a nice day ");
            a--;
        }
        System.out.println("Enter a number : ");
        Scanner scan = new Scanner(System.in);
        int b= scan.nextInt();
        scan.close();
        a++;
        while (a<=10) {
            System.out.printf("%d X %d = %d \n",b,a,b*a);
            a++;
        }

    }
}
