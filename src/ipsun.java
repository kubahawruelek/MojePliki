/*
nazwa funkcji: palindrom
autorzy: Filip Górecki i Jakub Hawrus 2pp
zwracana wartosc: ilosc słow: , true/false
*/
import java.util.Random;
import java.util.Scanner;
public class ipsun {

    public static void main(String[] args) {
        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer dignissim, nulla quis egestas gravida, eros lectus iaculis massa, nec congue tortor metus ut ex. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed facilisis consequat arcu ut condimentum. Maecenas faucibus purus id finibus varius. Quisque at metus dui. Sed volutpat tincidunt vulputate. Nam pulvinar, mauris sed laoreet molestie, dolor justo posuere turpis, in volutpat enim ipsum quis eros. Etiam pharetra euismod nibh quis tempor. Nam sit amet sapien eget turpis rutrum commodo.\n"
                +
                "\n" +
                "Praesent feugiat, urna non elementum porttitor, mauris velit aliquam risus, et condimentum ante mi sit amet augue. Mauris laoreet laoreet augue vitae mollis. Mauris quam dui, sagittis sit amet tempus nec, maximus eget ligula. Mauris sem nibh, convallis et dignissim vitae, aliquam eget magna. Donec nec lorem id urna suscipit dapibus. Vivamus vitae viverra velit. Mauris ullamcorper laoreet magna, ut maximus arcu mollis sit amet.";
        String[] words = s.trim().split("\\s+");

        System.out.println("liczba slow = " + (words.length));

        System.out.println("Wprowadź słowo.");
        Scanner word = new Scanner(System.in);

        String X = word.nextLine();
        String R = String.valueOf(palindrom(X));

        System.out.println();
        System.out.println( X);
        System.out.println(  R);


    }


    public static boolean palindrom(String word) {
        int t = word.length() - 1;
        int r = 0;


        if (word.charAt(t) == word.charAt(r)) {
            return true;
        } else
            return false;
    }
    /*
    String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    int losowaliczba = 0;
    int losowapozycja = (int) (Math.random() * 10 + 1);
    int losowalitera = alfabet.charAt(1);



      for (int i = 0; i < 10; i++) {
        losowaliczba = r.nextInt(alfabet.length());
        System.out.print(alfabet.charAt(Integer.parseInt("losowaLiczba")));
        alfabet.replace(losowapozycja, losowapozycja + 1, losowalitera );
    }
    System.out.println("\n");;

    Random r = new Random();

     */
}













