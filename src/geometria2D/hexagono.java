package geometria2D;

public class hexagono {
    double lHex, perimetroHex, apotemaHex;

    public hexagono(double lHex, double perimetroHex, double apotemaHex) {
        this.lHex = lHex;
        this.perimetroHex = perimetroHex;
        this.apotemaHex = apotemaHex;
    }

    public double getlHex() {
        return lHex;
    }

    public void setlHex(double lHex) {
        this.lHex = lHex;
    }

    public double getPerimetroHex() {
        return perimetroHex;
    }

    public void setPerimetroHex(double perimetroHex) {
        this.perimetroHex = perimetroHex;
    }

    public double getApotemaHex() {
        return apotemaHex;
    }

    public void setApotemaHex(double apotemaHex) {
        this.apotemaHex = apotemaHex;
    }
}
