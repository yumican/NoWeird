import java.util.Scanner;

public class Weird2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int ilk;
        int bos = 0;

    do {
        System.out.print("Enter number: ");
        ilk = keyboard.nextInt();
        if (ilk % 4 == 0) {
            bos += ilk;
        }
    }
    while (ilk % 2 == 0);
        System.out.println("Total: " + bos);




















    }
}
