package geometria2D;
public class circulo {
    double PI = 3.1416, radioCir, perimetroCir, areaCir;

    public circulo(double radioCir, double perimetroCir, double areaCir) {
        this.radioCir = radioCir;
        this.perimetroCir = perimetroCir;
        this.areaCir = areaCir;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public double getRadioCir() {
        return radioCir;
    }

    public void setRadioCir(double radioCir) {
        this.radioCir = radioCir;
    }

    public double getPerimetroCir() {
        return perimetroCir;
    }

    public void setPerimetroCir(double perimetroCir) {
        this.perimetroCir = perimetroCir;
    }

    public double getAreaCir() {
        return areaCir;
    }

    public void setAreaCir(double areaCir) {
        this.areaCir = areaCir;
    }
}

