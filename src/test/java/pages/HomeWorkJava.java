package pages;

public class HomeWorkJava {
    public static void main(String[] args) {

        //Арифметичеслкие операторы
        int a = 10;
        int b = 20;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));

        //Логические операторы

        String nameCat = "Sem";
        int age = 8;

        System.out.println(nameCat.equals("Kotik") && age == 34); //оба параметра должны совпасть // false
        System.out.println(nameCat.equals("Kotik") || age == 8); //может совпасть только один //true


        //Переполнение


        short value1 = 32767;
        short value2 = 100;

        System.out.println("value : " + (short)(value1+value2));


        //Вычисления комбинаций типов данных
         int c = 5;
         double d = 2.5;

        System.out.println("c * d = " + (c * d));
        System.out.println("c / d = " + (c / d));
        System.out.println("c >= d = " + (c >= d));


    }
}
