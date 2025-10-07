package Sprint1.Inlämning1;

public class KottAtande extends Vaxt{  //arv
    public KottAtande(String namn,double hojd){
        super(namn,hojd);
    }
    @Override
    public double vatskaPerDag(){
        return 0.1 + 0.2 * getHojd();
    }
    @Override
    public Vatsketyp getVatsketyp(){  //Enum
        return Vatsketyp.PROTEINDRYCK;
    }
}
