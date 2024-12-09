import java.util.Scanner;

public class Study{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        int age=sc.nextInt();
        int group=sc.nextInt();
        String gender=sc.nextLine();
        String country=sc.nextLine();
        sc.nextLine();
        int fees=sc.nextInt();
        long rollno=sc.nextLong();

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Group: "+group);
        System.out.println("Country: "+country);
        System.out.println("Fees: "+fees);
        System.out.println("RollNo: "+rollno);
        sc.close();
    }
}