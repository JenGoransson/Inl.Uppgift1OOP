package Sprint2.Inlämning2;

import java.util.ArrayList;
import java.util.Scanner;

public class GymSystem {
    private final ArrayList<Member> members;

    public GymSystem(ArrayList<Member> members) {
        this.members = members;
    }

    private Member findMember(String input) {
        for (Member m : members) {
            if (m.getName().equalsIgnoreCase(input) || m.getPersonalNumber().equals(input)) {
                return m;
            }
        }
        return null;
    }
    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ange namn eller personnummer: ");
        String input = sc.nextLine().trim();

        Member member = findMember(input);
        if (member != null) {
            member.printStatus();  // all logik ligger i Member
        } else {
            System.out.println(input + " är ej medlem");
        }
        sc.close();
    }
}





