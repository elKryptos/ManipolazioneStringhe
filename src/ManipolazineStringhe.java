import java.util.Scanner;

public class ManipolazineStringhe {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digita una frase: ");
        String txt = scanner.nextLine();

        int lunghezza = txt.length();
        String maiuscolo = txt.toUpperCase();
        String minuscolo = txt.toLowerCase();
        String primaCap = Character.toUpperCase(txt.charAt(0)) + txt.substring(1);
        String ultDue = txt.substring(lunghezza -2);

        System.out.println("La lunghezza della tua stringa è: " + lunghezza );
        System.out.println("La tua stringa in maiuscolo: " + maiuscolo );
        System.out.println("La tua stringa in minuscolo: " + minuscolo );
        System.out.println("La tua stringa coma la prima lettera in maiuscolo: " + primaCap);
        System.out.println("Gli ultimi 2 digiti della tua stringa sono: " +ultDue);
    }

    public static int lunghezza (String txt){
        return + txt.length();   
    }

    public static String maiuscolo (String txt){
        return + txt.toUpperCase();   
    }

    public static String minuscolo (String txt){
        return + txt.toLowerCase();   
    }

    public static String primaCap (String txt){
        return + Character.toUpperCase(txt.charAt(0)) + txt.substring(1);   
    }

       public static String ultDue (String txt){
        return +txt.substring(lunghezza - 2);   
    }
}