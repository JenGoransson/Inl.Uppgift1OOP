package Sprint2.Inlämning2;

import java.util.ArrayList;

public class MainProg {
    public static void main(String[] args) {
        MemberLoader loader =  new MemberLoader();  //Skapar memberloader-objekt som läser in medlemsdata från fil
        ArrayList<Member> members = loader.loadMembers("src/Sprint2/Inlämning2/MembersList.txt");
        GymSystem system =  new GymSystem(members);
        system.run();
    }
}
