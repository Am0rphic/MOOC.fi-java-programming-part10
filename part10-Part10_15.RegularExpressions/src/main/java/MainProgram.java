

public class MainProgram {

    public static void main(String[] args) {
        String one = "tue";
        Checker check = new Checker();
        if (check.isDayOfWeek(one)) {
            System.out.println("good");
        }
    }
}
