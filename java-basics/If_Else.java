import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        System.out.println("Enter two Numbers :");
        Scanner scan = new Scanner(System.in);
        int x,y;
        x=scan.nextInt();
        y=scan.nextInt();
        scan.close();
        if(x>y)
        {
            System.out.printf("%d is greater than %d",x,y);
        }
        else if(y>x)
        {
            System.err.printf("%d is greater than %d",y,x);
        }
        else
        {
            System.out.println("Both numbers are equal ");
        }

    }
}
