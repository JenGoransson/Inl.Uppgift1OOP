package Sprint1.Inlämning1;

public enum Vatsketyp {
    MINERALVATTEN ("mineralvatten"),
    PROTEINDRYCK ("proteindryck"),
    KRANVATTEN ("kranvatten");

    public final String vatska;

    Vatsketyp(String vatska) {
        this.vatska = vatska;
    }
}
