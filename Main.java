import java.util.Scanner;


public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your Age: ");
    int age=sc.nextInt();
    System.out.println("Your age is "+age);
    sc.close();
  }
}