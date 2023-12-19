import java.util.Scanner;

public class ManipolazineStringhe {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digita una frase: ");
        String txt = scanner.nextLine();

        int lunghezza = txt.length();

        System.out.println("La lunghezza della tua stringa è: " + lunghezza );
    }

    public static int lunghezza (String txt){
        return + txt.length();   
    }
}
