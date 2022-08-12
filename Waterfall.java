public class Waterfall {

    private int wysokosc;
    private int szerokosc;

    public double getPole() {
        return pole;
    }

    private double pole;

    Waterfall(int wysokosc, int szerokosc) {
        if (wysokosc <= 0) {
            throw new IllegalArgumentException("pojeaĹ‚o cie chcemy na plusie");
        }
        this.wysokosc = wysokosc;

        this.szerokosc = szerokosc;
        this.pole = wysokosc * szerokosc;
    }

    Waterfall(double wysokosc, int szerokosc) {
        if (wysokosc <= 0) {
            throw new IllegalArgumentException("pojeaĹ‚o cie chcemy na plusie");
        }

    }
    Waterfall(Waterfall other) {
        this.wysokosc = other.wysokosc;
        this.szerokosc = other.szerokosc;
        this.pole = other.pole;
    }
    //metoda wytwĂłrcza - Create to moja nazwa ,moĹĽe daÄ‡ innÄ…
    public static Waterfall Create(int wysokosc, int szerokosc) {
        return new Waterfall(wysokosc, szerokosc);
    }

    public String jakiStrumien() {
        return ((Integer) (szerokosc * wysokosc / 5)).toString();
    }
}
