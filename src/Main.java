public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int money = 0;
        int month = 0;
        while (money<2_459_000){
            money=money+15000;
            month=month+1;
            System.out.println("Месяц " + month+ ", сумма накоплений равна "+money+"рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while(i<10){
            i=i+1;
            System.out.print(i+ " ");
        }
        System.out.println();
        for (;i>0;i--){
            System.out.print(i+ " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int total = 12_000_000;
        int life = 17;
        int dead = 8;
        for (int i=1;i<=10;i++){
            total = total + (total/1000*life)-(total/1000*dead);
            System.out.println("Год "+ i+", численность населения составляет "+ total);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int invest= 15000;
        for (int i =1; invest<12_000_000;i++){
            invest= invest+invest*7/100;
            System.out.println("Месяц "+ i + " Накоплений: "+ invest);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int invest= 15000;
        for (int i =1; invest<12_000_000;i++){
            invest= invest+invest*7/100;
            if(i%6==0){
                System.out.println("Месяц "+ i + " Накоплений: "+ invest);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int invest= 15000;
        int years= 9;
        int months= years*12;
        for (int i =1; i<=months;i++){
            invest= invest+invest*7/100;
            if(i%6==0){
                System.out.println("Месяц "+ i + " Накоплений: "+ invest);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int day = 5;
        while (day<=31){
            System.out.println("Сегодня пятница, "+day+"-е число. Необходимо подготовить отчет.");
            day=day+7;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int yearNow= 2023;
        int yearStart= yearNow -200;
        int yearFinish= yearNow + 100;
        for (int i=0;i<=yearFinish;i=i+79){
            if (yearStart<=i && i<=yearFinish){
                System.out.println(i);
            }
        }
    }
}