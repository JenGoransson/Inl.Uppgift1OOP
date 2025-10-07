package Sprint1.Inlämning1;

public class Palm extends Vaxt {  //arv
    public Palm(String namn, double hojd){
        super(namn,hojd);
    }
    @Override
    public double vatskaPerDag(){
        return 0.5 * getHojd();
    }
    @Override
    public Vatsketyp getVatsketyp(){  //Enum
        return Vatsketyp.KRANVATTEN;
    }
}
