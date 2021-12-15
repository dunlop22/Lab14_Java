package Avto;
public class Koleso_Zapaska extends Koleso
{
    public Koleso_Zapaska()
    {
        vid = "Литье";
    }
    public Koleso_Zapaska(double shirina, double diametr, double visota, String tip_diska, String vid)
    {
        super(diametr, shirina, visota, tip_diska);
        this.vid = vid;
    }
    
    public void print()
    {
        System.out.print("Вид запасного колеса: " + vid + "\n");
        super.prosmotr_koleso();
    }
    
    public void set_vid(String vid)
    {
        this.vid = vid;
    }
            
    public void set_new()
    {
        this.visota = super.visota;
        this.diametr = super.diametr;
        this.shirina = super.shirina;
        this.tip_diska = super.tip_diska;
    }
    
    public void set1(double diametr, double shirina, double visota, String tip_diska, String vid)
    {
        this.diametr = diametr;
        this.visota = visota;
        this.shirina = shirina;
        this.tip_diska = tip_diska;
        this.vid = vid;
    }
    public void set2(double diametr, double shirina, double visota, String tip_diska, String vid)
    {
        this.vid = vid;
        super.new_koleso(shirina, diametr, visota, tip_diska);
    }
    
    private String vid;
    
    
}
