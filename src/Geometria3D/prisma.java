package Geometria3D;

public class prisma {
    double perimetroBase, alturaPri, areaBase, areaPri, volumenPri;

    public prisma(double perimetroBase, double alturaPri, double areaBase, double areaPri, double volumenPri) {
        this.perimetroBase = perimetroBase;
        this.alturaPri = alturaPri;
        this.areaBase = areaBase;
        this.areaPri = areaPri;
        this.volumenPri = volumenPri;
    }

    public double getPerimetroBase() {
        return perimetroBase;
    }

    public void setPerimetroBase(double perimetroBase) {
        this.perimetroBase = perimetroBase;
    }

    public double getAlturaPri() {
        return alturaPri;
    }

    public void setAlturaPri(double alturaPri) {
        this.alturaPri = alturaPri;
    }

    public double getAreaBase() {
        return areaBase;
    }

    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }

    public double getAreaPri() {
        return areaPri;
    }

    public void setAreaPri(double areaPri) {
        this.areaPri = areaPri;
    }

    public double getVolumenPri() {
        return volumenPri;
    }

    public void setVolumenPri(double volumenPri) {
        this.volumenPri = volumenPri;
    }
}
