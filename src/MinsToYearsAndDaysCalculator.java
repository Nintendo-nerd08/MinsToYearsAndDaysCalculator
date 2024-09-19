public class MinsToYearsAndDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

    }

    private static void printYearsAndDays(long minutes) {
        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;
        long leftoverDays = days % 365;
        System.out.println(minutes + "MIN" + hours + "HRS" + days + "D" + years + "YR");
        System.out.println(leftoverDays);
    }
}

