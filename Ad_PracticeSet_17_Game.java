import java.util.Scanner;

class game{
    private int secretNumber;

    public game(){
        secretNumber = (int) (Math.random())* 100 + 1;
    }

    public boolean isCorrect(int guess){
        return guess == secretNumber;
    }
}



public class Ad_PracticeSet_17_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        game number = new game();

        System.out.println("Welcome in the game.");
        System.out.println("Try to guess the number between 1 to 100");

        boolean isGuessed = false;

        while (!isGuessed){
            System.out.print("Enter your guess number : ");
            int userGuess = sc.nextInt();

            if(number.isCorrect(userGuess)){
                System.out.println("Congratulations! You won the match.");
            }
            else{
                System.out.println("Wrong Guess. Please try again");
            }
        }

    }

}
