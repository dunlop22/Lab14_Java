package Avto;


import java.util.Scanner;

public class Obchee {
    String name;
    String tip_privoda;
    String tip_topliva;
    double massa;
    double obem_benzobaka;
    double kolvo_mest;
    double razgon_do_100;
    
    public void new_obchee_info()
    {
        Scanner in = new Scanner(System.in);        //инициализация сканера
        
        System.out.println("Введите название: ");
        do
        {
            if (in.hasNextLine()){
                this.name = in.nextLine();
            }
            else
            {
                System.out.println("Название введено неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.name == "");
        
        
        System.out.println("Введите тип привода: ");
        do
        {
            if (in.hasNextLine()){
                this.tip_privoda = in.nextLine();
            }
            else
            {
                System.out.println("Тип привода введен неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.tip_privoda == "");
        
        System.out.println("Введите тип топлива: ");
        do
        {
            if (in.hasNextLine()){
                this.tip_topliva = in.nextLine();
            }
            else
            {
                System.out.println("Тип топлива введен неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.tip_topliva == "");
        
        System.out.println("Введите массу: ");
        do
        {
            if (in.hasNextDouble()){
                this.massa = in.nextDouble();
            }
            else
            {
                System.out.println("Масса введена неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.massa < 0);
        
        
        System.out.println("Введите объем бензобака: ");
        do
        {
            if (in.hasNextDouble()){
                this.obem_benzobaka = in.nextDouble();
            }
            else
            {
                System.out.println("Объем бензобака введен неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.obem_benzobaka < 0);
        
        
        System.out.println("Введите количество мест: ");
        do
        {
            if (in.hasNextDouble()){
                this.kolvo_mest = in.nextDouble();
            }
            else
            {
                System.out.println("Количество мест введено неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.kolvo_mest < 0);
        
        System.out.println("Введите разгон до 100км/ч: ");
        do
        {
            if (in.hasNextDouble()){
                this.razgon_do_100 = in.nextDouble();
            }
            else
            {
                System.out.println("Разгон до 100км/ч введен неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.razgon_do_100 < 0);
    }
    
    
    public void new_obchee(String name, String tip_privoda, String tip_topliva, double kolvo_mest, double massa, double obem_benzobaka, double razgon_do_100)       //конструктор с параметрами
    {
        this.kolvo_mest = kolvo_mest;
        this.massa = massa;
        this.name= name;
        this.obem_benzobaka = obem_benzobaka;
        this.tip_privoda = tip_privoda;
        this.tip_topliva = tip_topliva;
        this.razgon_do_100 = razgon_do_100;
    }
    
    public void prosmotr_obchee()
    {
        System.out.println("Название: " + this.name); 
        System.out.println("Масса: " + this.massa); 
        System.out.println("Тип топлива: " + this.tip_topliva); 
        System.out.println("Тип привода: " + this.tip_privoda); 
        System.out.println("Количество мест: " + this.kolvo_mest); 
        System.out.println("Объем бензобака: " + this.obem_benzobaka); 
        System.out.println("Разгон до 100км/ч: " + this.razgon_do_100); 
    }
    
    public Obchee()     //конструктор без параметров
    {
        this.name = "";
        this.massa = -1;
        this.kolvo_mest = -1;
        this.obem_benzobaka = -1;
        this.razgon_do_100 = -1;
        this.tip_privoda = "";
        this.tip_topliva = "";
    }
}
