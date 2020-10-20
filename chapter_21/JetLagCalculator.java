import java.util.Scanner;

public class JetLagCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hours = number of hours of travel \nZones = number of time zones crossed \nDepart =\n 0, for departures between 8AM and noon \n1, for departures between noon and 6PM \n3, for departures between 6PM and 10PM \n4, for departures between 10PM and 1AM \n5, for departures between 1AM and 8AM \nArrive = \n4, for arrivals between 8AM and noon \n2, for arrivals between noon and 6PM \n0, for arrivals between 6PM and 10PM \n1, for arrivals between 10PM and 1AM \n3, for arrivals between 1AM and 8AM");
        System.out.println("Enter Hours: ");
        int hour = scanner.nextInt();
        System.out.println("Enter Zones: ");
        int zones = scanner.nextInt();
        System.out.println("Enter Depart: ");
        int depart = scanner.nextInt();
        System.out.println("Enter Arrive: ");
        int arrive = scanner.nextInt();

        double recovery = ((hour + 0.0) / 2 + (zones - 3) + depart + arrive) / 10;
        System.out.println("Days of recovery: " + recovery);

    }
}