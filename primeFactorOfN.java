import java.util.Scanner;

public class primeFactorOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if((n%2000!=0 && n%400==0) || n%4==0 || n%100!=0){
            System.out.println("LeapYear");
        }
        else{
            System.out.println("Not LeapYear");
        }

    }
}
