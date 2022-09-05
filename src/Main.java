import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (true) {
            System.out.print("напишите день недели >>>");
            String sk =scanner.nextLine().toUpperCase();
            switch (sk) {
                case "DUISHOMBY" -> System.out.println(DenNedeli.DUISHOMBY.getName());
                case "SHEISHEMBI"-> System.out.println(DenNedeli.SHEISHEMBI.getName());
                case "SHARSHEMBI"-> System.out.println(DenNedeli.SHARSHEMBI.getName());
                case "BEISHEMBI" -> System.out.println(DenNedeli.BEISHEMBI.getName());
                case "JUMA"      -> System.out.println(DenNedeli.JUMA.getName());
                case "ISHEMBI"   -> System.out.println(DenNedeli.ISHEMBI.getName());
                case "JEKSHEMBI" -> System.out.println(DenNedeli.JEKSHEMBI.getName());
                default          -> System.out.println("!!==мындай кун жумада жок==!!");
            }
           }
        }
     }

