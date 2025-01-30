import java.io.*;
import java.util.*;
public class day2{
    public static void main (String args[]) throws FileNotFoundException{
        ArrayList <Integer> numbers = new ArrayList<>();
        ArrayList <Integer> diff = new ArrayList<>();
        int number = 0;
        int difference = 0;
        int safe = 0;
        try (Scanner f = new Scanner(new File("sample.txt"))) {
            while(f.hasNextLine()){
                numbers.clear();
                Scanner s = new Scanner(f.nextLine());
                while (s.hasNextInt()){
                    number = s.nextInt();
                    numbers.add(number);
                    boolean isSafe = true;
                    for (int i = 1; i < numbers.size(); i++) {
                        difference = Math.abs(numbers.get(i) - numbers.get(i-1));
                        diff.add(difference);
                        if (difference > 3) {
                            isSafe = false; 
                            break; 
                        }
                    }
                    if(isSafe){
                        safe++;
                    }
                }
                System.out.println(safe);
            }
            
            f.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Error: " + e.getMessage());
        }
        //System.out.println(numbers);
    }
}