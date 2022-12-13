package geometria2D;

public class triangulo {
    double lTri, baseTri, alturaTri;

    public triangulo(double lTri, double baseTri, double alturaTri) {
        this.lTri = lTri;
        this.baseTri = baseTri;
        this.alturaTri = alturaTri;
    }

    public double getlTri() {
        return lTri;
    }

    public void setlTri(double lTri) {
        this.lTri = lTri;
    }

    public double getBaseTri() {
        return baseTri;
    }

    public void setBaseTri(double baseTri) {
        this.baseTri = baseTri;
    }

    public double getAlturaTri() {
        return alturaTri;
    }

    public void setAlturaTri(double alturaTri) {
        this.alturaTri = alturaTri;
    }
}
