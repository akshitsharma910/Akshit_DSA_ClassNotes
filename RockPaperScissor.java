import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Choice {Rock,Paper,Scissor}: ");
        String HumanChoice=sc.nextLine();
        String ComputerChoice="";
        int Random=(int)(Math.random()*3);


        if(Random==0){
            ComputerChoice+="Rock";
        }
        else if(Random==1){
            ComputerChoice+="Paper";
        }

        else if(Random==2){
            ComputerChoice+="Scissor";
        }

        

        if (HumanChoice.equals("Rock") && ComputerChoice.equals("Paper")) {
            System.out.println("Computer Wins");
        } else if (HumanChoice.equals("Paper") && ComputerChoice.equals("Scissor")) {
            System.out.println("Computer Wins");
        } else if (HumanChoice.equals("Scissor") && ComputerChoice.equals("Rock")) {
            System.out.println("Computer Wins");
        } else if (HumanChoice.equals("Rock") && ComputerChoice.equals("Scissor")) {
            System.out.println("Human Wins");
        } else if (HumanChoice.equals("Paper") && ComputerChoice.equals("Rock")) {
            System.out.println("Human Wins");
        } else if (HumanChoice.equals("Scissor") && ComputerChoice.equals("Paper")) {
            System.out.println("Human Wins");
        } else {
            System.out.println("Draw");
        }

        sc.close();

    }
}
