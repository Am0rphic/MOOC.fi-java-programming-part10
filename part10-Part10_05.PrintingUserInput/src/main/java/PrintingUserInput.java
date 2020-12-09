
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        ArrayList<String> asd = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String read = scanner.nextLine();
            if (read.equals("")) {
                break;
            }
            asd.add(read);
        }
        asd.stream()
                .forEach(asdd -> System.out.println(asdd));
    }
}
