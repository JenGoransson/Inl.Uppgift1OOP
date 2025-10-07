package Sprint1.Inlämning1;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class GreenestHotel {
    public GreenestHotel() {
        ArrayList <Vaxt> vaxter = new ArrayList<>();   //Polymorfism.
        vaxter.add(new Palm("Olof", 1));
        vaxter.add(new Palm("Laura", 5));
        vaxter.add(new Kaktus("Igge", 0.2));
        vaxter.add(new KottAtande("Meatloaf", 0.7));

        while (true) {
            String meddelande = JOptionPane.showInputDialog(null, "Vilken växt ska få vätska?");
            if (meddelande == null) {
                break;
            }

            boolean hittad = false;
            for (Vaxt v : vaxter) {
                if (v.getNamn().equalsIgnoreCase(meddelande)) { //polymorfism och dynamisk bindning
                    v.visaMeddelande();
                    hittad = true;
                    break;
                }
            }
            if (!hittad) {
                    JOptionPane.showMessageDialog(null, "Kunde inte hitta någon växt med det namnet.");
                }
            }
        }

        public static void main (String[]args){

        GreenestHotel start = new GreenestHotel();
        }
    }
