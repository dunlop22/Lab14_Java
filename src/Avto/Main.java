package Avto;


import Avto.Obchee;
import java.util.Scanner;
import java.util.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int poisk(int number, ArrayList Massiv_Koles, int min, int max) 
    { 
        for (; number < Massiv_Koles.size(); number++) 
        { 
            Koleso Koleso_test = (Koleso)Massiv_Koles.get(number); 
            if (Koleso_test.diametr >= min && Koleso_test.diametr <= max) 
            {
                return number;
            } 
        } 
        return -1; 
    }
    
    public static class Summa<T extends Motor>
    {
        public Summa()
        {
        }
        public double Sum(T t1, T t2)
        {
            return (t1.Vsego(t2));
        }
    }
    
    
    public static class Sravnenie<T extends Koleso>
    {
        public Sravnenie()
        {
        }
        public int Bolshe(T t1, T t2)
        {
            if (t1.okrujnost() > t2.okrujnost())
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        public int Menshe(T t1, T t2)
        {
            if (t1.okrujnost() < t2.okrujnost())
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
    }
    
    public static void table_print(Koleso [][]Kol_Massiv)
    {
        for (int i = 0; i < 4; i++)
        {
                System.out.println("*************************************************");
                for (int j = 0; j < 4; j++)
                {
                        if (Kol_Massiv[i][j].diametr_info() != -1)
                        {
                                System.out.print("* " + Kol_Massiv[i][j].dannii() + " ");
                        }
                        else
                        {
                                System.out.print("*           ");
                        }
                }
                System.out.println("*");
        }
        System.out.println("*************************************************");
    }
    public static void main(String[] args) throws IOException
    {
        Scanner in1 = new Scanner(System.in);        //инициализация сканера
        
        Obchee obchie = new Obchee();
        Motor motorishe = new Motor();
        Korobka korobas = new Korobka();
        Koleso kolesiko = new Koleso();
        Avto Avtom = new Avto(); 
        
        int main_key = 9;
        char c;
        Scanner in = new Scanner(System.in);        //инициализация сканера
        do
	{
            System.out.println("1) Общее\n2) Двигатель\n3) Коробка\n4) Колеса\n5) Автомобиль\n6) Сравнение (Шаблон)\n7) Сумма (Шаблон)\n8) Сравнение (Контейнер)\n9) Поиск (Контейнер)\n0) Копирование");
            main_key = in1.nextInt();
            switch (main_key) {
                case 1:
                    int key = 9;
                    do {
                        System.out.println("1) Ввод собственных данных об общем\n2) Ввод данных по конструктору\n3) Просмотр информации\n\n0) - выход\n\n");
                        key = in1.nextInt();
                        switch (key) {
                        case 1:
                            obchie.new_obchee_info();
                            System.out.println("\nОбщая информация добавлена\n");
                            break;
                        case 2:
                            obchie.new_obchee("Subaru", "4WD", "Бензин", 5, 1500, 60, 8);
                            System.out.println("\nОбщая информация добавлена по конструктору\n");
                            break;
                        case 3:
                            if (obchie.massa >= 0)
                            {
                                obchie.prosmotr_obchee();
                            }
                            else
                            {
                                System.out.println("Общая информация не найдена\n\n");
                            }    
                            break;
                        }
                    } while (key != 0);
                    break;
                    
                case 2:
                    key = 9;
                    do {
                        System.out.println("1) Ввод собственных данных о двигателе\n2) Ввод данных по конструктору\n3) Просмотр информации\n\n0) - выход\n\n");
                        key = in1.nextInt();
                        switch (key) {
                        case 1:
                            motorishe.new_motor_info();
                            System.out.println("\nИнформация о двигателе добавлена\n");
                            break;
                        case 2:
                            motorishe.new_motor("FB20", 150, 4, 8, 4, 2);
                            System.out.println("\nИнформация о двигателе добавлена по конструктору\n");
                            break;
                        case 3:
                            if (motorishe.klapan >= 0)
                            {
                                System.out.printf("%s",motorishe.toString());
                                System.out.println();
                                //motorishe.prosmotr_motor();
                            }
                            else
                            {
                                System.out.println("Информация о двигателе не найдена\n\n");    
                            }
                            break;
                        }
                    } while (key != 0);
                    break;
                    
                case 3:
                    key = 9;
                    do {
                        System.out.println("1) Ввод собственных данных о коробке переключения передач\n2) Ввод данных по конструктору\n3) Просмотр информации\n\n0) - выход\n\n");
                        key = in1.nextInt();
                        switch (key) {
                        case 1:
                            korobas.new_korobka_info();
                            System.out.println("\nИнформация о коробке переключения передач добавлена\n");
                            break;
                        case 2:
                            korobas.new_korobka("АКПП", 5);
                            System.out.println("\nИнформация о коробке переключения передач добавлена по конструктору\n");
                            break;
                        case 3:
                            if (korobas.kolvo_peredach >= 0)
                            {
                                korobas.prosmotr_korobka();    
                            }
                            else
                            {
                                System.out.println("Информация о коробке переключения передач не найдена\n\n");    
                            }
                            break;
                        }
                    } while (key != 0);
                    break;
                    
                case 4:
                    key = 9;
                    Koleso_Zapaska Zapaska = new Koleso_Zapaska();
                    do {
                        System.out.println("Последний уникальный ID: " + Koleso.id_return() + "\n\n1) Ввод собственных данных о колесах\n2) Ввод данных по конструктору\n");
                        key = in1.nextInt();
                        switch (key) {
                        case 1:
                            kolesiko.new_koleso_info();
                            break;
                        case 2:
                            kolesiko.new_koleso(225, 17, 55, "Литье");
                            break;
                        }
                        System.out.print("Введите количество  проколов в шине: ");
                        int n;
                        n = in1.nextInt();
                        kolesiko.kolvo_prokolov = n;
                        Zapaska.kolvo_prokolov = n;
                        kolesiko.prosmotr_koleso();     
                        System.out.println("Введите тип запасного колеса\n\n1) Полноразмерное\n2) Докатка\n3) Отсутствует");    
                        key = in1.nextInt();
                        switch (key) {
                        case 1:
                            
                            Zapaska.set_new();
                            Zapaska.set_vid("Полноразмерное");
                            break;
                        case 2:
                            
                            Zapaska.new_koleso_info();
                            Zapaska.set_vid("Докатка");
                            break;
                        case 3:
                            Zapaska.set_vid("Отсутствует");
                            break;
                        } 
                        System.out.println();
                        kolesiko.prosmotr_koleso();
                        System.out.println();
                        Zapaska.print();
                    }while (key != 0);
                case 5:
                    key = 9;
                    do {
                        System.out.println("1) Создание автомобиля\n2) Просмотр информации\n\n0) - выход\n\n");
                        key = in1.nextInt();
                        switch (key) {
                        case 1:
                            Avtom.new_avto( motorishe, obchie, kolesiko, korobas);
                            break;
                        case 2:
                            Avtom.prosmotr_avto();
                            break;
                        }
                    } while (key != 0);
                    break;
                case 6:
                    key = 9;
                    /*Лабораторная работа 13*/
                    Koleso kol3 = new Koleso();
                    Koleso kol4 = new Koleso();
                    
                    
                    kol3.new_koleso(265, 18, 55, "Литье");
                    kol4.new_koleso(185, 13, 65, "Ковка");
                    
                    System.out.println("Двигатель №1:");
                    kol3.prosmotr_koleso();
                    System.out.println("\n\nДвигатель №2:");
                    kol4.prosmotr_koleso();
                    
                    Sravnenie<Koleso> Sravni = new Sravnenie<Koleso>();
                    System.out.println("\n\n\nКолесо с большей окружностью:\n");
                    if (Sravni.Bolshe(kol3, kol4) == 1)
                    {
                        kol3.prosmotr_koleso();
                    }
                    else
                    {
                        kol4.prosmotr_koleso();
                    }
                    System.out.println("\n\n\nКолесо с меньшей окружностью:\n");
                    if (Sravni.Menshe(kol3, kol4) == 1)
                    {
                        kol3.prosmotr_koleso();
                    }
                    else
                    {
                        kol4.prosmotr_koleso();
                    }
                    
                    /*
                    Koleso_Zapaska Zapaska1 = new Koleso_Zapaska();
                    Koleso Kol2 = new Koleso();
                    Kol2.new_koleso(265, 21, 35, "Литье");
                    Zapaska1.set1(17, 235, 60, "Литье", "Полноразмерное");
                    System.out.print("Конструктор без вызова конструктора базового класса\n");
                    Kol2.prosmotr_koleso();
                    System.out.println();
                    Zapaska1.print();
                    System.out.println();
                    System.out.print("\nКонструктор с вызовом конструктора базового класса\n");
                    Zapaska1.set2(20, 185, 65, "Литье", "Докатка");
                    System.out.println();
                    Kol2.new_koleso(265, 21, 35, "Литье");
                    System.out.println();
                    Kol2.prosmotr_koleso();
                    System.out.println();
                    Zapaska1.print();
                    System.out.println();
                    */
                    /*
                    Koleso kol1 = new Koleso();
                    Koleso kol2 = new Koleso(12);
                    System.out.println("Констуктор без параметров: \n");
                    kol1.prosmotr_koleso();
                    System.out.println("Констуктор с одним параметром: \n");
                    kol2.prosmotr_koleso();
                    */
                    /*
                    System.out.println("Введите количество коробок в массиве: ");
                    int n;
                    n = -1;
                    do
                    {
                        if (in.hasNextInt()){
                            
                            n = in.nextInt();
                        }
                        else
                        {
                            System.out.println("Количество введено неверно, повторите попытку: ");    
                            in.nextLine();
                        }
                    } while (n <= 0);
                    Korobka Kor = new Korobka();
                    Korobka Korobka_Massiv = new Korobka(); 
                    int i;
                    for (i = 0; i < n; i++)
                    {
                        Korobka_Massiv.Korobka_Mass(Kor);    
                    }
                    
                    Korobka_Massiv.Korobka_prosmotr();
                    
                    System.out.println("\n\n\n");    */
                    break;
                case 7:
                    key = 9;
                    
                    /*Лабораторная работа 13*/
                    Motor mot1 = new Motor();
                    Motor mot2 = new Motor();
                    mot1.new_motor("2GR-FE", 249, 4, 10, 6, 3.5);
                    mot2.new_motor("FB20", 150, 4, 8, 4, 2.0);
                    
                    Summa<Motor> Vsego = new Summa<Motor>();
                    System.out.println("\n\nДвигатель №1:\n");
                    mot1.prosmotr_motor();
                    System.out.println("\n\nДвигатель №2:\n");
                    mot2.prosmotr_motor();
                    System.out.print("\n\nОбщее количество лошадиных сил у 2-х двигателей: " + Vsego.Sum(mot1, mot2) + "\n\n");
                    /*Лабораторная работа 12*/
                    /*
                    Koleso_Zapaska Zapaska2 = new Koleso_Zapaska(235, 55, 17, "Литье", "Полноразмерное");
                    Zapaska2.print();*/
                    /*
                    Koleso Kol_mass[] = new Koleso[10];
                    Koleso temp = new Koleso();
                    int n;

                    System.out.print("Введите количество колес в массиве: ");
                    do
                    {
                        n = in.nextInt();
                    } while (n < 0);
                    for (int i = 0;i < n; i++)
                    {
                        
                        
                        temp.new_koleso(130.0 + i * 5, 13.0 + i * 2, 30 + i * 4, "Enkei №" + (i + 1) + " Japan");
                        Kol_mass[n] = temp;
                        Kol_mass[n].prosmotr_koleso();
                    }
                    */
                    /*
                    {
                        Kol_mass[i] = new Koleso(12);
                        System.out.println("\n");
                        Kol_mass[i].prosmotr_koleso();
                    }
                    
                    /*
                    Help schet = new Help();
                    Motor Mot1 = new Motor();
                    Motor Mot2 = new Motor();
                    Mot1.vsego_koni(schet);
                    System.out.println("Количество лошадей в двигателе №1: " + schet.vsego);    
                    Mot2.vsego_koni(schet);
                    System.out.println("Количество лошадей в двигателях (№1 + №2): " + schet.vsego + "\n\n\n\n");    
                    */
                    break;
                case 8:
                    key = 9;
                    
                    /*Лабораторная работа 14*/
                    ArrayList Massiv_Koles = new ArrayList(); 
                    Iterator MS = Massiv_Koles.iterator();
                    Koleso kol_1 = new Koleso();
                    Koleso kol_2 = new Koleso();
                    Koleso kol_3 = new Koleso();
                    Koleso_Zapaska zap1 = new Koleso_Zapaska();
                    Koleso_Zapaska zap2 = new Koleso_Zapaska();
                    Koleso_Zapaska zap3 = new Koleso_Zapaska();
                    kol_1.new_koleso(235, 17, 55, "Литье");
                    kol_2.new_koleso(285, 20, 55, "Литье");
                    kol_3.new_koleso(265, 17, 5, "Литье");
                    zap1.new_koleso(245, 18, 5, "Ковка");
                    zap2.new_koleso(185, 15, 55, "Ковка");
                    zap3.new_koleso(215, 18, 25, "Ковка");
                    Massiv_Koles.add(kol_3);
                    Massiv_Koles.add(kol_1);
                    Massiv_Koles.add(zap3);
                    Massiv_Koles.add(zap1);
                    Massiv_Koles.add(kol_2);
                    Massiv_Koles.add(zap3);
                    
                    
                    System.out.printf("Сортировка колес по возрастанию окружности колеса:\n"); 
                    for (int i = 0; i < Massiv_Koles.size(); i++) 
                    { 
                        Koleso Koleso_test = new Koleso();
                        Koleso_test = (Koleso)Massiv_Koles.get(i);
                        Koleso_test.prosmotr_koleso();
                        System.out.printf("\nОкружность колеса: " + Koleso_test.perimetr() + "\n"); 
                    } 
                    
                    Collections.sort(Massiv_Koles);
                    System.out.printf("\n\n\nСписок колес после сортировки по возрастанию окружности колеса:\n"); 
                    for (int i = 0; i < Massiv_Koles.size(); i++) 
                    { 
                        Koleso Koleso_test = (Koleso)Massiv_Koles.get(i);
                        Koleso_test.prosmotr_koleso();
                        System.out.printf("\nОкружность колеса: " + Koleso_test.perimetr() + "\n"); 
                    }
                    
                    
                    /*Лабораторная работа 12*/
                    /*
                    Koleso info = new Koleso(18, 265, 45, "Литье");
                    System.out.printf("Объем колеса: " + info.obem()+ "м^3\n\n");
                    System.out.printf("Периметр колеса: " + info.perimetr()+ "мм\n\n");
                    */
                    /*
                    Koleso[][] Kol_mass_ = new Koleso[4][4];
                    Koleso temp1 = new Koleso();
                    
                    for (int i = 0;i < 4; i++)
                    {
                        for (int j = 0;j < 4; j++)    
                        {
                            Kol_mass_[i][j] = new Koleso(-1);
                        }
                    }
                    int podmenu;
                    do
                    {
                        temp1.new_koleso_info();
                        table_print(Kol_mass_);
                        int m, k;
                        System.out.print("Введите номер строки: ");
                        do
                        {
                            m = in.nextInt();
                        } while (m < 1 || m > 4);
                        System.out.print("Введите номер стобца: ");
                        do
                        {
                            k = in.nextInt();
                        } while (k < 1 || k > 4);

                        Kol_mass_[m-1][k-1] = temp1;
                        table_print(Kol_mass_);
                        System.out.print("0) Выход в меню\nЛюбая клавиша - продолжение заполнения массива");
                        podmenu = in.nextInt();
                    } while (podmenu != 0);
                    */
                    /*System.out.println("Введите количество коробок в массиве: ");
                    int m;
                    m = -1;
                    do
                    {
                        if (in.hasNextInt()){
                            
                            m = in.nextInt();
                        }
                        else
                        {
                            System.out.println("Количество введено неверно, повторите попытку: ");    
                            in.nextLine();
                        }
                    } while (m <= 0);
                    Korobka Kor1 = new Korobka();
                    List<Korobka> Korobka_Massiv1 = new ArrayList<>();
                    Korobka Kor2 = new Korobka();
                    //Korobka Korobka_Massiv1 = new Korobka(); 
                    int j;
                    String name = " Aisin";
                    for (j = 0; j < m; j++)
                    {
                        Kor1.new_korobka("АКПП №" + (j + 1) + name, 5 + j * 1);
                        Korobka_Massiv1.add(Kor1);
                        //Korobka_Massiv1.Korobka_Mass(Kor1);
                        Kor2 = Korobka_Massiv1.get(0);
                        Kor2.prosmotr_korobka();
                        System.out.println("\n");    
                    }
                    System.out.println("\n\n\n");
                        */
                    break;
                case 9:
                    key = 9;
                    /*Лабораторная работа 14*/
                    
                    ArrayList Massiv_Koles1 = new ArrayList(); 
                    Iterator MS1 = Massiv_Koles1.iterator();
                    Koleso kol_11 = new Koleso();
                    Koleso kol_21 = new Koleso();
                    Koleso kol_31 = new Koleso();
                    Koleso_Zapaska zap11 = new Koleso_Zapaska();
                    Koleso_Zapaska zap21 = new Koleso_Zapaska();
                    Koleso_Zapaska zap31 = new Koleso_Zapaska();
                    kol_11.new_koleso(235, 17, 55, "Литье");
                    kol_21.new_koleso(285, 20, 55, "Литье");
                    kol_31.new_koleso(265, 17, 5, "Литье");
                    zap11.new_koleso(245, 18, 5, "Ковка");
                    zap21.new_koleso(185, 15, 55, "Ковка");
                    zap31.new_koleso(215, 18, 25, "Ковка");
                    Massiv_Koles1.add(kol_31);
                    Massiv_Koles1.add(kol_11);
                    Massiv_Koles1.add(zap31);
                    Massiv_Koles1.add(zap11);
                    Massiv_Koles1.add(kol_21);
                    Massiv_Koles1.add(zap31);
                    
                    for (int i = 0; i < Massiv_Koles1.size(); i++) 
                    { 
                        Koleso Koleso_test = new Koleso(); 
                        Koleso_test = (Koleso)Massiv_Koles1.get(i); 
                        Koleso_test.prosmotr_koleso();
                        System.out.printf("\n"); 
                    } 
                    
                    int min, max;
                    System.out.printf("\n\nВведите минимальное значение диаметра колеса для поиска: ");
                    do
                    {
                        min = in1.nextInt();
                        if (min < 0)
                        {
                            System.out.printf("Данное значение недопустимо.\nПовторите ввод: ");
                        }
                    } while (min < 0);

                    System.out.printf("Введите максимальное значение диаметра колеса для поиска: ");
                    do
                    {
                        max = in1.nextInt();
                        if (max < min)
                        {
                            System.out.printf("Данное значение недопустимо.\nПовторите ввод: ");
                        }
                    } while (max < 0 && max < min);

                    System.out.printf("\n\n\nКолеса, удовлетворяющие запросу:\n\n\n"); 
                    for(int i = 0; i < Massiv_Koles1.size(); i++)
                    { 
                        int number; 
                        number = poisk(i,Massiv_Koles1, min, max); 
                        if (number != -1) //найден удовлетворяющий элемент
                        { 
                            Koleso Koleso_test = (Koleso)Massiv_Koles1.get(number); 
                            Koleso_test.prosmotr_koleso();
                            i = number; 
                        } 
                    } 
                    /*Лабораторная работа 12*/
                    /*
                    Motor Motorik = new Motor();
                    Motor Motorik1 = new Motor();
                    Motorik.new_motor("FB20", 150, 4, 8, 4, 2.0);
                    Motorik1.new_motor("2GR-FE", 249, 4, 10, 6, 3.5);
                    
                    System.out.println("Двигатель №1\n\nМаксимальное значение мощности в кВТ: " + Math.round(Motorik.Max_KWT()));
                    System.out.println("Текущее значение мощности в кВТ: " + Math.round(Motorik.KWT()));

                    System.out.println("\n\nДвигатель №2\n\nМаксимальное значение мощности в кВТ: " + Math.round(Motorik1.Max_KWT()));
                    System.out.println("Текущее значение мощности в кВТ: " + Math.round(Motorik1.KWT()));
                    */
                    break;
                case 0:
                    key = 9;
                    /*Лабораторная работа 12*/
                    /*Koleso kol1 = new Koleso();
                    Koleso kol2 = new Koleso();
                    Koleso kol3 = new Koleso();
                    Koleso kol4 = new Koleso();
                    System.out.println("До мелкого копирования:");
                    kol1.prosmotr_koleso();
                    System.out.println();
                    kol2.prosmotr_koleso();
                    
                    kol2 = kol1;
                    kol2.new_koleso(235, 18, 20, "Ковка");
                    
                    System.out.println("\n\nПосле мелкого копирования:");
                    kol1.prosmotr_koleso();
                    System.out.println();
                    kol2.prosmotr_koleso();
                    System.out.println();
                    
                    
                    
                    
                    System.out.println("\n\n\nДо глубокого копирования:");
                    kol3.prosmotr_koleso();
                    System.out.println();
                    kol4.prosmotr_koleso();
                    kol4=(Koleso)kol3.clone();
                    kol4.new_koleso(285, 21, 66, "Литье Japan");
                    System.out.println("\n\nПосле глубокого копирования:");
                    kol3.prosmotr_koleso();
                    System.out.println();
                    kol4.prosmotr_koleso();
                    System.out.println();
                    */
                    break;
            }
        } while (true);
    }
}
