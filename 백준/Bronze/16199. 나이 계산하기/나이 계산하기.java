import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startYear = sc.nextInt();
        int startMonth = sc.nextInt();
        int startDay = sc.nextInt();

        int currentYear = sc.nextInt();
        int currentMonth = sc.nextInt();
        int currentDay = sc.nextInt();

        int internationalAge = currentYear - startYear;

        int startDate = (startMonth * 100 + startDay);
        int currentDate = (currentMonth * 100 + currentDay);

        if (startDate > currentDate) internationalAge--;

        System.out.println(internationalAge);
        System.out.println(currentYear - startYear + 1);
        System.out.println(currentYear - startYear);
    }
}
