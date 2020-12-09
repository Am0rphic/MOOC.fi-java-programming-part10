
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> numbers = new ArrayList<>();
        while (true) {
            String read = scanner.nextLine();
            if (read.equals("end")) {
                break;
            }
            numbers.add(read);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String r = scanner.nextLine();
        if (r.equals("n")) {
            double average = numbers.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number<0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: "+average);

        }   else if (r.equals("p")) {
            double average = numbers.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number>0)
                    .average()
                    .getAsDouble();   
            System.out.println("Average of the positive numbers: "+average);
        }
     
    }
}
