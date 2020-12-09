
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        String fileName="literacy.csv";
        ArrayList<String> reading = new ArrayList<>();
        try {
            Files.lines(Paths.get(fileName))
                   .forEach(line -> reading.add(line));                   
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        reading.stream().sorted((c1, c2) -> {
            String[] parts1 = c1.split(",");
            String[] parts2 = c2.split(",");
            return parts1[5].compareTo(parts2[5]);
        }).forEach((array) -> {
            String[] parts = array.split(",");
            for (String part:parts) {
                part.trim();
            }
            String[] sex=  parts[2].split(" ");
            System.out.println(parts[3]+" ("+parts[4]+"), "+sex[1]+", "+parts[5]);
        });
       
        
    }
}

