public class Fib {

    public static double Fib(int n) {


        double Fib = 1 / Math.sqrt(5) * Math.pow(1 + Math.sqrt(5) / 2, n) - 1 / Math.pow(1 / Math.sqrt(5) / 2, n);
        return Fib;

    }

    public static void Wypisz() {
        for (int i = 0; i < 24; i++) {
            System.out.println("F" + i + " " + Fib(i));
            System.out.println("Wypisz:");
        }


    }

    public static void main(String[] args) {
        Wypisz();
    }

    public static void gamma()  {

        int x = 0 ;


    }

    public static void bravo() {

    }
    }




