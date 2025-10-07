package Sprint1.Inlämning1;

public class Kaktus extends Vaxt {  //arv
    public Kaktus(String namn,double hojd){
        super(namn,hojd);
    }
    @Override
    public double vatskaPerDag() {
        return 0.02;
    }
    @Override
    public Vatsketyp getVatsketyp() {  //Enum
        return Vatsketyp.MINERALVATTEN;
    }
}
