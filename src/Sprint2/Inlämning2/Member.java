package Sprint2.Inlämning2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Member {
    protected String name;
    protected String personalNumber;
    protected LocalDate lastPayment;
    protected String membershipType;


    public Member(String name, String personalNumber, LocalDate lastPayment, String membershipType) {
        this.name = name;
        this.personalNumber = personalNumber;
        this.lastPayment = lastPayment;
        this.membershipType = membershipType;
    }

    public String getName() { return name; }
    public String getPersonalNumber() { return personalNumber; }
    public String getMembershipType() { return membershipType; }

    // Kollar om medlemmen är aktiv
    public boolean isActive() {
        return lastPayment.isAfter(LocalDate.now().minusYears(1));
    }

    // Registrerar ett gymbesök
    public void saveVisit() {
        LocalDate today = LocalDate.now();
        String line = name + ";" + personalNumber + ";" + today;
        String fileVisitCounter = "Visit-count-" + name + ".txt";

        //Skapar/öppnar upp en textfil med namned. True gör att det läggs till text, skrivs ej över
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileVisitCounter, true))) {
            writer.write(line);
            writer.newLine(); //Gör att nästa reggade besök skrivs på egen rad.
            System.out.println("Besök registrerat för " + name + ".");
        } catch (IOException e) {
            System.err.println("Kunde inte registrera besök i filen: " + fileVisitCounter);
            System.err.println("Felorsak: " + e.getMessage());
        }
    }

    // Skriver ut medlemsstatus och sparar besök om aktiv
    public void printStatus() {
        if (isActive()) {
            System.out.println(name + " är nuvarande medlem (" + membershipType + ")");
            saveVisit();
        } else {
            System.out.println(name + " är före detta medlem");
        }
    }
}


