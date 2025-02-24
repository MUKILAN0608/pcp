import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();


        String[] names = a.split("\\s+");

        for (int i = 0; i < names.length; i++) {

            if (i == 0) {
                names[i] = names[i].substring(0, 1).toUpperCase() + names[i].substring(1).toLowerCase();
            } else {
                names[i] = names[i].toLowerCase();
            }


            for (int j = 0; j < names[i].length(); j++) {
                char c = names[i].charAt(j);
                System.out.print(c + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
