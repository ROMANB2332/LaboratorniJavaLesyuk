import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String stroka;
        String zmina;
        Scanner sc = new Scanner(System.in);
        Scanner cont = new Scanner(System.in);

        System.out.println("Цей калькулятор обраховує дроби будь-якої величини... ");
        System.out.println("Введіть дроби через [/] та оберіть дію між ними [+-*%]");
        do {
            System.out.print("->");
            stroka = sc.nextLine();
            System.out.println(stroka);
            CalcString ob = new CalcString();
            System.out.println(ob.Calculate_str(new StringBuilder(stroka)));
            zmina = cont.next();
        }while(zmina != "q");

    }
}
