public enum Getraenk {

    COCA_COLA ("Coca Cola"),
    COCA_COLA_ZERO ("Coca Cola Zero"),
    CAPRI_SUN ("Capri Sun"),
    MONSTER_ENERGY ("Monster Energy"),
    WASSER ("Wasser"),
    WASSER_STILL ("Stilles Wasser"),
    FANTA ("Fanta"),
    SPRITE ("Sprite");


    private final String GetraenkeBezeichnung;

    private Getraenk (String GetraenkeBezeichnung) {this.GetraenkeBezeichnung = GetraenkeBezeichnung; }

    public String toString() {return this.GetraenkeBezeichnung;}

    public double getPreis() {  // Preis des jeweiligen Getränks

        switch (this) {

            case COCA_COLA:
            case COCA_COLA_ZERO:
                return 1.20;
            case FANTA:
            case SPRITE:
                return 1.00;
            case CAPRI_SUN:
                return 0.80;
            case WASSER:
            case WASSER_STILL:
                return 0.70;
            case MONSTER_ENERGY:
                return 1.45;
        }

        return 0;

    }



}