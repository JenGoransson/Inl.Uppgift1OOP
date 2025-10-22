package Sprint2.Inlämning2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class MemberLoader {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public ArrayList<Member> loadMembers(String filePath) {
        ArrayList<Member> members = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");
                if (data.length < 7) continue; // Hoppa över rader som inte har tillräckligt med data

                String name = data[0].trim();  //Hämtar information från rätt ställe i Arrayen
                String personalNumber = data[3].trim();
                LocalDate lastPayment = LocalDate.parse(data[5].trim(), dtf);
                String membershipType = data[6].trim();

                Member m = new Member(name, personalNumber, lastPayment, membershipType);
                members.add(m);
            }

        } catch (IOException e) {
            System.out.println("Fel vid läsning av fil: " + e.getMessage());
        }

        return members;
    }
}
