import java.util.Scanner;

public class Switch_Case {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Eter a number from 1 to 3 :  ");
        int n = scan.nextInt();
        switch (n) {
            case 1:
                System.out.println("1.The number entered is " + n);
                break;
            case 2:
                System.out.println("2.The number entered is " + n);
                break;
            case 3:
                System.out.println("3.The number entered is " + n);
                break;
        
            default:
                break;
        }
        scan.close();
        }
}
