import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors01 {

    private final static String ROCK = "Rock";
    private final static String PAPER = "Paper";
    private final static String SCISSORS = "Scissors";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");
        String playerMove = scanner.nextLine();
        String computerChoice = "";
        int countPlayer = 0;
        int countComp = 0;

        if (playerMove.equals("r") || playerMove.equals("Rock")) {
            playerMove = ROCK;
        } else if (playerMove.equals("p") || playerMove.equals("Paper")) {
            playerMove = PAPER;
        } else if (playerMove.equals("s") || playerMove.equals("Scissors")) {
            playerMove = SCISSORS;
        } else {
            System.out.println("This is an invalid input. Try again please...");
            return;
        }
        System.out.printf("Your choice: %s.%n ", playerMove);

        Random random = new Random();
        int computerRandomNumber = random.nextInt(3);

        switch (computerRandomNumber) {
            case 0:
                computerChoice = "Rock";
                break;
            case 1:
                computerChoice = "Paper";
                break;
            case 2:
                computerChoice = "Scissors";
                break;
        }
        System.out.printf("Computer's choice: %s.%n", computerChoice);

        if ((playerMove.equals(ROCK) && computerChoice.equals(SCISSORS)) ||
                (playerMove.equals(PAPER) && computerChoice.equals(ROCK)) ||
                (playerMove.equals(SCISSORS) && computerChoice.equals(PAPER))) {
            countPlayer++;
            System.out.println("You win.");

        } else if ((playerMove.equals(SCISSORS) && computerChoice.equals(ROCK)) ||
                (playerMove.equals(PAPER) && computerChoice.equals(SCISSORS)) ||
                (playerMove.equals(ROCK) && computerChoice.equals(PAPER))) {
            countComp++;
            System.out.println("You loose.");


        } else {
            System.out.println("This game is a draw.");
        }
        System.out.printf("The score is: %d:%d.%n", countPlayer, countComp);
        }
        }

