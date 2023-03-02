import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int ciclo = 0;

        while (ciclo != 1) {
            System.out.println("¿Qué acción quieres realizar?\n" +
                    "1. Concatenar cadenas.\n" +
                    "2. Potenciar una cadena.\n" +
                    "3. Longitud de una cadena.\n" +
                    "4. Reflexión o inversa de una cadena.\n" +
                    "5. Subcadena.\n" +
                    "6. Prefijo.\n" +
                    "7. Sufijo.\n");

            int accion = sc.nextInt();

            switch (accion) {
                case 1:
                    concatenar();
                    break;
                case 2:
                    potenciar();
                    break;
                case 3:
                    longitud();
                    break;
                case 4:
                    inversa();
                    break;
                case 5:
                    subcadena();
                    break;
                case 6:
                    prefijo();
                    break;
                case 7:
                    sufijo();
                    break;
                default:
                    System.out.println("Esa acción es invalida.\n");
                    break;
            }

            System.out.println("\nDesea seguir realizando acciones?\n" +
                    "0. Si\n" +
                    "1. No\n");

            ciclo = sc.nextInt();
        }
    }

    public static void concatenar() {
        System.out.println("\nDigite la primera cadena: ");
        String cadena1 = sc.next();

        System.out.println("Digite la segunda cadena: ");
        String cadena2 = sc.next();

        System.out.println("El resultado es:");
        System.out.println(cadena1 + "" + cadena2);
    }

    public static void potenciar() {
        String resultado = "";

        System.out.println("\nDigite la cadena: ");
        String cadena = sc.next();

        System.out.println("Digite la cantidad de veces que quiere potenciar la cadena: ");
        int potencia = sc.nextInt();

        System.out.println("El resultado es:");

        if (potencia != 0) {
            for (int i=0; i<potencia; i++) {
                resultado += cadena + "";
            }
            System.out.println(resultado);
        } else {
            System.out.println("λ");
        }
    }

    public static void longitud() {
        System.out.println("\nDigite la cadena: ");
        String cadena = sc.next();
        int longitud = cadena.length();

        System.out.println("El resultado es:");
        System.out.println(longitud);
    }

    public static void inversa() {
        System.out.println("\nDigite la cadena: ");
        String cadena = sc.next();
        StringBuilder builder = new StringBuilder();

        for (int i = cadena.length() - 1; i >= 0; i--) {
            builder.append(cadena.charAt(i));
        }

        System.out.println("El resultado es:");
        System.out.println(builder.toString());
    }

    public static void subcadena() {
        System.out.println("\nDigite la cadena: ");
        String cadena = sc.next();

        System.out.println("El resultado es:");
        System.out.println(cadena.substring(0, (cadena.length() / 2)));
    }

    public static void prefijo() {
        System.out.println("\nDigite la cadena: ");
        String cadena = sc.next();

        System.out.println("Digite la prefijo de la cadena: ");
        String prefijo = sc.next();

        if (cadena.startsWith(prefijo)) {
            System.out.println("La cadena empieza por el prefijo");
        } else {
            System.out.println("La cadena No empieza por el prefijo");
        }
    }

    public static void sufijo() {
        System.out.println("\nDigite la cadena: ");
        String cadena = sc.next();

        System.out.println("Digite el sufijo de la cadena: ");
        String sufijo = sc.next();

        if (cadena.endsWith(sufijo)) {
            System.out.println("La cadena termina por el sufijo");
        } else {
            System.out.println("La cadena No termina por el sufijo");
        }
    }
}