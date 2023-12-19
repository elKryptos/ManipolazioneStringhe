import java.util.Scanner;

public class ManipolazineStringhe {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digita una frase: ");
        String txt = scanner.nextLine();

        int lunghezza = txt.length();
        String maiuscolo = txt.toUpperCase();
        String minuscolo = txt.toLowerCase();

        System.out.println("La lunghezza della tua stringa è: " + lunghezza );
        System.out.println("La tua stringa in maiuscolo: " + maiuscolo );
        System.out.println("La tua stringa in minuscolo: " + minuscolo );
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

    
}