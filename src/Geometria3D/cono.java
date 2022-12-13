package Geometria3D;
public class cono {
    double radioCo, generatrizCO, areaCo,volumenCo;

    public cono(double radioCo, double generatrizCO, double areaCo, double volumenCo) {
        this.radioCo = radioCo;
        this.generatrizCO = generatrizCO;
        this.areaCo = 3.1416 * (areaCo*areaCo)+3.1416*radioCo*generatrizCO;
        this.volumenCo = (3.1416*(radioCo*areaCo))/2;
    }

    public double getRadioCo() {
        return radioCo;
    }

    public void setRadioCo(double radioCo) {
        this.radioCo = radioCo;
    }

    public double getGeneratrizCO() {
        return generatrizCO;
    }

    public void setGeneratrizCO(double generatrizCO) {
        this.generatrizCO = generatrizCO;
    }

    public double getAreaCo() {
        return areaCo;
    }

    public void setAreaCo(double areaCo) {
        this.areaCo = areaCo;
    }

    public double getVolumenCo() {
        return volumenCo;
    }

    public void setVolumenCo(double volumenCo) {
        this.volumenCo = volumenCo;
    }

}
