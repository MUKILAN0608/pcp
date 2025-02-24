import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dice1 = {1, 2, 3, 4, 5, 6};
        int[] dice2 = {1, 2, 3, 4, 5, 6};
        int i = 0;
        System.out.print("Enter the guessed number (2 to 12): ");
        int guess = sc.nextInt();


        Random rand = new Random();
        int roll1 = dice1[rand.nextInt(6)];
        int roll2 = dice2[rand.nextInt(6)];
        int sum = roll1 + roll2;

        System.out.println("Dice rolled: " + roll1 + " and " + roll2);
        System.out.println("Total sum: " + sum);

        while (i < 5) {
            if (guess == sum) {
                System.out.println("Congratulations! Your guess was correct.");
                break;
            } else if(guess>sum) {
                System.out.println("TO HIGH");
                break;
            }
            else{
                System.out.println("TO LOW");
                break;
            }
            i=i+1;

        }
        if(i==5){
            System.out.println("GAME OVER!");
        }
        sc.close();
    }
}
