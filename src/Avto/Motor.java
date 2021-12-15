package Avto;


import java.util.Scanner;

interface KWT
{
        double Max_KWT();
        double KWT();
}

class Motor implements KWT {
    String name;
    double rab_obem;
    double koni;
    double rasxod;
    double kol_vo_cilindr;
    double klapan;
    
    public double Max_KWT()	//вывод максимально возможной мощности (в квтч) после апгрейда
        {
            if (this.rab_obem > 2.0)
            {
                return (this.koni * 1.2 / 1.3596);
            }
            else
            {
                return (this.koni * 1.1 / 1.3596);
            }
        }

    
    public double Vsego(Motor Motorik)
    {
        return (this.koni + Motorik.koni);  
    }
    
    
    public double KWT()	//вывод текущей мощности (в квтч)
    {
        return (this.koni / 1.3596);
    }
                
    public void vsego_koni(Help he)
        {
            he.vsego += this.koni;
        }     

    public String toString()
    {
        return("Маркировка: " + this.name + "\nРабочий объем: " + this.rab_obem + "\nКоличество клапанов: " + this.klapan + "\nКоличество цилиндров: " + this.kol_vo_cilindr + "\nРасход: " + this.rasxod + "\nКоличество лошадиных сил: " + this.koni );
    }
    
    public void new_motor_info()
    {
        Scanner in = new Scanner(System.in);        //инициализация сканера
        
        System.out.println("Введите маркировку: ");
        do
        {
            if (in.hasNextLine()){
                this.name = in.nextLine();
            }
            else
            {
                System.out.println("Маркировка введена неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.name == "");
        
        System.out.println("Введите рабочий объем: ");
        do
        {
            if (in.hasNextDouble()){
                this.rab_obem = in.nextDouble();
            }
            else
            {
                System.out.println("Рабочий объем введен неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.rab_obem < 0);
        
        System.out.println("Введите количество лошадиных сил: ");
        do
        {
            if (in.hasNextDouble()){
                this.koni = in.nextDouble();
            }
            else
            {
                System.out.println("Количество лошадиных сил введено неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.koni < 0);
        
        System.out.println("Введите расход: ");
        do
        {
            if (in.hasNextDouble()){
                this.rasxod = in.nextDouble();
            }
            else
            {
                System.out.println("Расход введен неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.rasxod < 0);
        
        System.out.println("Введите количество цилиндров: ");
        do
        {
            if (in.hasNextDouble()){
                this.kol_vo_cilindr = in.nextDouble();
            }
            else
            {
                System.out.println("Количество цилиндров введено неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.kol_vo_cilindr < 0);
        
        System.out.println("Введите количество клапанов на 1 цилиндр: ");
        do
        {
            if (in.hasNextDouble()){
                this.klapan = in.nextDouble();
            }
            else
            {
                System.out.println("Количество клапанов введено неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.klapan < 0);
    }
    
    public void new_motor(String name, double koni, double klapan, double rasxod, double kol_vo_cilindr, double rab_obem)
    {
        if (name != "")
        {
            this.name = name;
        }
        
        if (klapan != 0)
        {
            this.klapan = klapan;
        }
        
        if (kol_vo_cilindr != 0)
        {
            this.kol_vo_cilindr = kol_vo_cilindr;
        }
        
        if (koni != 0)
        {
            this.koni = koni;
        }
        
        if (rab_obem != 0)
        {
            this.rab_obem = rab_obem;
        }
        
        if (rasxod != 0)
        {
            this.rasxod = rasxod;
        }
    }
    
    public void prosmotr_motor()
    {
        System.out.println("Маркировка: " + this.name); 
        System.out.println("Рабочий объем: " + this.rab_obem); 
        System.out.println("Количество клапанов: " + this.klapan); 
        System.out.println("Количество цилиндров: " + this.kol_vo_cilindr); 
        System.out.println("Расход: " + this.rasxod); 
        System.out.println("Количество лошадиных сил: " + this.koni); 
    }
    
    public Motor()
    {
        this.name = "";
        this.klapan = -1;
        this.kol_vo_cilindr = -1;
        this.koni = 150;
        this.rab_obem = -1;
        this.rasxod = -1;
    }
}
