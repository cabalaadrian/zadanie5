import java.util.Scanner;
public class zadanie6 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.print("Podaj liczbe sekund (nie mniejsza niz 60):  ");
        int sekundy;
        sekundy = klawiatura.nextInt();

        double minuty = sekundy/60;
        double godziny = sekundy/3600;
        double dni = sekundy/86400;
    if (sekundy>59 && sekundy<3600){
        System.out.println(minuty + " MINUT");
    }
    else if(sekundy>3599 && sekundy<86400){
        System.out.println(godziny + " GODZIN");
    }

    else if (sekundy > 86399)
    {
        System.out.println(dni + " DNI");
    }
    else {
        System.out.println("NIEPRAWIDŁOWA LICZBA SEKUND");
    }
    }}