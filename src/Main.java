import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (true) {
            System.out.print("напишите день недели >>>");
            String sk =scanner.nextLine().toUpperCase();
            switch (sk) {
                case "MONDAY" -> System.out.println(DenNedeli.DUISHOMBY.getName());
                case "TUESDAY"-> System.out.println(DenNedeli.SHEISHEMBI.getName());
                case "WEDNESDAY"-> System.out.println(DenNedeli.SHARSHEMBI.getName());
                case "THURSDAY" -> System.out.println(DenNedeli.BEISHEMBI.getName());
                case "FRIDAY"      -> System.out.println(DenNedeli.JUMA.getName());
                case "SATURDAY"   -> System.out.println(DenNedeli.ISHEMBI.getName());
                case "SUNDAY" -> System.out.println(DenNedeli.JEKSHEMBI.getName());
                default          -> System.out.println("!!==мындай кун жумада жок==!!");
            }
           }
        }

     }

