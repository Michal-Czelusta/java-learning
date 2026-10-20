import java.util.Scanner;

public class main {

    static void main() {

        Scanner scanner = new Scanner(System.in);

        // Zadanie 1

//
//        System.out.print("Podaj swoje imie: ");
//        String name = scanner.nextLine();
//        System.out.print("Podaj nazwisko: ");
//        String surname = scanner.nextLine();
//        System.out.print("Podaj rok urodzenia: ");
//        int year = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("Podaj miesiec urodzenia: ");
//        int month = scanner.nextInt();
//        int timePassed = (2026-year)*365 + (10-month)*31;
//        System.out.println("Masz na imie: " + name + " " + surname + ", od twoich urodzin mineło " + timePassed + " dni" );

        // Zadanie 2

//        System.out.print("Podaj pierwsza liczbe: ");
//        int number_a = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("Podaj druga liczbe: ");
//        int number_b = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("Co chcesz wykonac:\n1.Dodawanie\n2.Odejmowanie\n3.Dzielenie\n4.Mnozenie\nTwoj wybor: ");
//        int choice = scanner.nextInt();
//        scanner.nextLine();
//
//        int resoult;
//
//        if (choice == 1) {
//            resoult = number_a + number_a;
//        } else if (choice == 2) {
//            resoult = number_a - number_b;
//        } else if (choice == 3) {
//            resoult = number_a / number_b;
//        } else {
//            resoult = number_a * number_b;
//        }
//
//        System.out.println("Twoj wynik to: " + resoult);

        // Zadanie 3

//        System.out.print("Podaj liczbe: ");
//        int number = scanner.nextInt();
//        int i = 0;
//
//        while(i<=number){
//            if(number==Math.pow(2,i)){
//                System.out.println("Twoja liczba to jest potega dwojki!!!");
//                break;
//            }
//            else if(i==number) {
//                System.out.println("Twoja liczba nie jest potega dwojki!!!");
//            }
//            i++;
//        }

        // Zadanie 4

//        System.out.print("Podaj liczbe: ");
//        int number = scanner.nextInt();
//        int score = 0;
//
//        while (number!=0) {
//            if(number%2==0){
//                number = number/2;
//            }
//            else {
//                number--;
//            }
//            score++;
//        }
//
//        System.out.println("Potrzeba " + score + " krokow");

        // zadanie 5

//        System.out.print("Podaj liczbe: ");
//        int number = scanner.nextInt();
//        int score = 0;
//
//        while (number!=0) {
//            if ((number&1)==1){
//                score++;
//            }
//            number = number >> 1;
//        }
//
//        System.out.println("Wynik: " + score );

    }
}


