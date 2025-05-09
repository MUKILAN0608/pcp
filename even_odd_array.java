import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;


        String[] input = sc.nextLine().split(" ");
        int[] number = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            number[i] = Integer.parseInt(input[i]);
        }


        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int num : number) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
            sum += num;
        }


        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

    }
}
