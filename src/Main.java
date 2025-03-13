import java.util.Scanner;

public class Main {

    //This function taking power of number entering by user. Function continues to call itself until pow would be 0.
    public static int taking_power(int num, int pow){
        if (pow==0){
            return 1;
        }
        return num*taking_power(num, pow-1);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Taking the base number from user.
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        //Taking the power number from user.
        System.out.println("Enter the power: ");
        int power = scanner.nextInt();

        //Using function taking_power and put the base and power number inside the function.
        int result = taking_power(number,power);

        //Showing result.
        System.out.println(number + "^" + power + " = " + result);

    }

}