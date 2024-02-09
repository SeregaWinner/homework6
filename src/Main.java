public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++){
            System.out.println("Итерация цикла " + i);}

        System.out.println("Задание 2");
        for (int x = 10; x >= 1; x--){
            System.out.println("Итерация цикла " + x);}

        System.out.println("Задание 3");
        for (int l = 0; l <= 17;l = l + 2){
            System.out.println("Итерация цикла " + l);}

        System.out.println("Задание 4");
        for (int x = 10; x >= -10 ; x  --){
            System.out.println("Итерация цикла " + x);}

        System.out.println("Задание 5");
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год являеться високосным." );}

        System.out.println("Задание 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);}

        System.out.println("Задание 7");
        for (int k = 1; k <= 512; k = k * 2) {
            System.out.println(k);
            }

        System.out.println("Здание 8");
        int postponed = 29000;
        int accumulation = 0;
        for (int month = 1; month <= 12;  month ++) {
            accumulation = accumulation + postponed;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + accumulation + " рублей");}

        System.out.println("Здание 9");
        int bank = 29000;
        int bankAccumulation = 0;
        for (int i = 0; i <= 12;  i ++) {
            bankAccumulation = bankAccumulation + bankAccumulation/100;
            bankAccumulation = bankAccumulation + bank;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + bankAccumulation + " рублей");}

        System.out.println("Здание 10");
        for (int i = 0; i <= 10; i ++ ) {
            System.out.println("2*" + i + "=" + 2*i);
        }


    }

}