package Avto;

abstract class Koleso_inf {
    public Koleso_inf()
    {    }
    public Koleso_inf(double diametr, double shirina, double visota, String tip_diska)
    {
        this.diametr = diametr;
        this.shirina = shirina;
        this.visota = visota;
        this.tip_diska = tip_diska;
    }
    public abstract double perimetr();
    public abstract double obem();
    protected double shirina;
    protected double visota;
    protected double diametr;
    protected String tip_diska;
}
