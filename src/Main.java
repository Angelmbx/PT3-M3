import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        String [] entrada = { "UNO", "dos", "Tres", "TRES", "tres", "DoS"};

        int unos = 0;
        int doses = 0;
        int treses = 0;

        for (int i=0; i<entrada.length; i++){

           String palabra = entrada[i].toLowerCase();

            switch (palabra){
                case "uno": unos++;
                break;
                case "dos": doses++;
                break;
                case "tres": treses++;
                break;
            }

        }

        System.out.println("UNO: " + unos);
        System.out.println("DOS: " + doses);
        System.out.println("TRES: " + treses);
    }
}