public class Getraenk {

    private String name;
    private double preis;
    private int vorhanden;

    public Getraenk (String name, double preis, int vorhanden) {
        this.name=name;
        this.preis=preis;
        this.vorhanden=vorhanden;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getVorhanden() {
        return vorhanden;
    }

    public void setVorhanden(int vorhanden) {
        this.vorhanden = vorhanden;
    }
}
