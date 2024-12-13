import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int rn=1;rn<=n;rn++){
        for(int sp=1;sp<=n-rn;sp++){
            System.out.println(" ");
        }

        for(int st=1;st<=2*(n-rn)+1;st++){  
            System.out.println("*");
        }

        
    }
    System.out.println("\n");
    }
}
