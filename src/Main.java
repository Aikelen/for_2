public class Main {
    public static void main(String[] args) {
        // 1 Задача
        for(int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        // 2 - Задача
        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }

        //3 - задача
        for (int i = 0; i < 18; i +=2){
            System.out.println(i);
        }


        //4 - задача
        for (int i = 10; i > -11; i-- ){
            System.out.println(i);
        }

        //5 - задача
        for (int i = 1904;i<2096;i+=4){
            System.out.println(i);}

        //6
        for (int i = 7; i<99;i+=7){
            System.out.println(i);
        }
        //7
        for (int i = 1; i<513;i*=2){
            System.out.println(i);
        }
        //8
        for (int i = 1;i<13;i++){
            int Nakoplenia = 29000;
            System.out.println("Месяц "+ i + " Сумма накоплений рвана "+ Nakoplenia * i+" рублей");

        }
        double Nakoplenia = 29000;
        for (int i = 1;i<13;i++){
            Nakoplenia += Nakoplenia * 0.01;
            System.out.println("Месяц "+ i + " Сумма накоплений рвана "+  Nakoplenia +" рублей");
        }
        for (int i = 1; i<11;i++){
            System.out.println(2 + " * " + i + " = " + (2 * i));
        }

    }
}