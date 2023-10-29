package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month >= 1 && month <= 12) {
            String season;
            if (month >= 3 && month <= 5) {
                System.out.println("Spring");
            } else if (month >= 6 && month <= 8) {
                System.out.println("Summer");
            } else if (month >= 9 && month <= 11) {
                System.out.println("Autumn");
            } else {
                System.out.println("Winter");
            }
        } else {
            System.out.println("Wrong number!");
        }
    }

}
