import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = s.nextInt();
        int c=0;
        int i=2;
        for (; i < num ; i++) {
            if (num %i == 0) {
                System.out.println("IS NOT A PRIME NUMBER");
                break;
            }
        }
        if(i>=num){
            System.out.println("IS PRIME NUMBER");
        }
}
}