import java.util.Scanner;
public class testMagicSquare{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the magic square (n): ");
        int n = scanner.nextInt();

        MagicSquare magicSquare = new MagicSquare(n);
        magicSquare.readSquare();

        if (magicSquare.isMagicSquare(n)) {
            System.out.println("The square is a magic square.");
        } else {
            System.out.println("The square is not a magic square.");
        }
    }
}
