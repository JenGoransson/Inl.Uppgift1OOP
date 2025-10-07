package Sprint1.Inlämning1;

import javax.swing.JOptionPane;

public abstract class Vaxt implements VatskeBehov { //Interface.
    protected String namn;
    protected double hojd;

    public Vaxt(){}
    public Vaxt(String namn, double hojd){
        this.namn=namn;
        this.hojd=hojd;
    }
    public String getNamn(){
        return namn;
    }
    public double getHojd(){
        return hojd;
    }

    public void visaMeddelande(){  //Metod med interfacet + enum
        String meddelande = namn + " ska ha " + vatskaPerDag() + " liter " + getVatsketyp().vatska +" per dag.";
        JOptionPane.showMessageDialog(null, meddelande);
    }
}
