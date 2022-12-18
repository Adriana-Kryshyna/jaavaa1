import java.util.Scanner;

public class newckass {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("enter number");
        int number = num.nextInt();

        if(number<=100){
            System.out.println("great");
            number++;
            System.out.println(number);
        }else {
            System.out.println("Well");
            number--;
            System.out.println(number);
        }
    }
}
