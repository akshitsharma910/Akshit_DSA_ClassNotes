import java.util.Scanner;

public class nMultiplesOf5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int i=1;
        for(;;){
            System.out.println(n*i);
            i++;
        }
    }
}
