import java.util.Scanner;

public class MagicSquare {
    private int[][] square;
    private int size;

    public MagicSquare(int n) {
        setSize(n);
        square = new int[size][size];
    }


    public void setSize(int n) {
        if (n > 0) {
            this.size = n;
            square = new int[size][size];
        } else {
            throw new IllegalArgumentException("Size must be greater than 0");
        }
    }

    public int getSize() {
        return size;
    }

    public void readSquare() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the magic square (" + size + "x" + size + "):");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                //System.out.print("Element [" + i + "][" + j + "]: ");
                square[i][j] = scanner.nextInt();
            }
        }
    }

    public boolean isMagicSquare(int size) {
        int magicSum = 0;

        
        for (int j = 0; j < size; j++) {
            magicSum += square[0][j];
        }

        int realMagicSum = (size * ((size * size) + 1)) / 2;

        if (magicSum == realMagicSum){
            return true;
        }
        else{
            return false;
        }
    }
}
