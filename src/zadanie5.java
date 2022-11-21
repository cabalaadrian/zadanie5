import java.util.Scanner;
public class zadanie5 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.print("Podaj mase obiektu w kilogramach: ");
        int masa;
        masa = klawiatura.nextInt();

        double ciezar = masa*9.8;
        System.out.println(ciezar + " N");

         if (10>ciezar)
            {
            System.out.println("obiekt jest za lekki");
        }
          else if (1000<ciezar) {
            System.out.println("obiekt jest za ciezki");
        }



    }}

