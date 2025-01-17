package week2;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        Car newCar = null;

        boolean exit = false;
        System.out.print("Anna auton merkki: ");
        String brand = sc.nextLine();
        System.out.print("Anna auton malli: ");
        String model = sc.nextLine();
        newCar = new Car(brand, model, 0);
        while(!exit) {
            System.out.println("1) Näytä auton tila \n 2) Muokkaa auton merkkiä ja mallia \n 3) Kiihdytä autoa \n 4) Hidasta autoa \n 0) Lopeta ohjelma");

            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1: 
                        newCar.status();
                        break;
                    
                    case 2:
                        System.out.print("Anna uusi auton merkki: ");
                        newCar.brand = sc.nextLine();
                        System.out.print("Anna uusi auton malli: ");
                        newCar.model = sc.nextLine();
                        break;

                    case 3:
                        System.out.print("Kuinka monta km/h haluat kiihdyttää? ");
                        int x = Integer.parseInt(sc.nextLine());
                        if (x < 0) {
                            System.out.println("Nopeuden täytyy olla positiivinen luku.");
                            break;
                        }
                        newCar.accelerate(x);
                        break;

                    case 4: 
                        System.out.print("Kuinka monta km/h haluat hidastaa? ");
                        int y = Integer.parseInt(sc.nextLine());
                        if (y < 0) {
                            System.out.println("Nopeuden täytyy olla positiivinen luku.");
                            break;
                        }
                        newCar.decelerate(y);
                        break;

                    case 0:
                        exit = true;
                        System.out.println("Kiitos ohjelman käytöstä.");
                        break;

                    default: 
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
        }sc.close();
    }
    
}
