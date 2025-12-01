import java.util.Scanner;

public class Score {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Enter Your Name: ");
            String name = input.nextLine();

            System.out.print("Enter Your Score (0-100): ");
            int score = input.nextInt();

            //determine student exam score
            String gred;
            if (score >= 80 && score <= 100){
                gred = "A";
            }
            else if (score >= 60){
                gred = "B";
            }
            else if (score >= 40){
                gred = "C";
            }
            else if (score >= 0){
                gred = "Fail";
            }
            else {
                System.out.println("Invalid Input");
                continue;
            }
            //System.out.println("Your Score is: " + score);
            System.out.println(name+"\n "+score+"\n "+gred);
            //
            System.out.println("check another student (yes/no): ");
            String again = input.nextLine().toLowerCase();

            if (!again.equals("yes")){
                break;
            }
        }
        System.out.println("Thanks for checking your Score!");
    }
}
