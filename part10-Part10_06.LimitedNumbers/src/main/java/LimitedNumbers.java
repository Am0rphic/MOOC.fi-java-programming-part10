
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            String read = scanner.nextLine();
            if (Integer.valueOf(read)==-1) {
                break;
            }
            numbers.add(Integer.valueOf(read));
        }
        
        ArrayList num = numbers.stream()
                .filter(n -> n>=1 && n<=5)
                .collect(Collectors.toCollection(ArrayList::new));
        num.stream()
                .forEach(n -> System.out.println(n));
    }
}
