import java.util.Scanner;

public class ForProd {
    public static void main(String[] args) {
        Scanner now= new Scanner(System.in);
        System.out.println("enter numbers");
        int first = now.nextInt();
        int second=now.nextInt();

        System.out.println("Press 1 if you wanna add number\n"+"Press 2 if u wanna minus number");
        int N= now.nextInt();
        switch (N){
            case 1:
                System.out.println(first+second);
                break;
                case 2:
                    System.out.println(first-second);
            default:
                System.out.println("number is wrong");
        }

    }
}
