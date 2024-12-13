import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean prime=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                prime=false;
            }
        }

        if(prime || num==0 || num==1){
            System.out.println("Prime");
        }
        
        else{
            System.out.println("Not Prime");
        }

        sc.close();
    }
}



