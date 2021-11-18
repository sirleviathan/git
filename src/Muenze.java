public enum Muenze {

    TEN_CENT ("10 Cent"),
    TWENTY_CENT ("20 Cent"),
    FIFTY_CENT ("50 Cent"),
    ONE_EURO ("1 Euro"),
    TWO_EURO ("2 Euro");

    private final String MuenzenBezeichnung;

    private Muenze (String MuenzenBezeichnung) {this.MuenzenBezeichnung = MuenzenBezeichnung; }

    public String toString() {return this.MuenzenBezeichnung;}

    public double getWert() {  // Wert der jeweiligen Muenze

        switch (this) {

            case TEN_CENT:
                return 0.10;
            case TWENTY_CENT:
                return 0.20;
            case FIFTY_CENT:
                return 0.50;
            case ONE_EURO:
                return 1.00;
            case TWO_EURO:
                return 2.00;
        }

        return 0;

    }

    public int getVerfügbareAnzahl() { // Verfügbare Anzahl der Getränke

        switch (this) {

            case TEN_CENT:
            case TWENTY_CENT:
                return 20;
            case FIFTY_CENT:
                return 2;
            case ONE_EURO:
                return 1;
            case TWO_EURO:
                return 0;

        }
        return 0;
    }

}
