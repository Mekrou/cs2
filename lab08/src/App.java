import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        try {
            System.out.println("Enter time 1 in 24hr format as follows (HH:MM:SS)");
            String time = keyboard.nextLine();
            int secondsSinceMidnight = calculateSecondsSinceMidnight(time);

            System.out.println("Enter time 2 in 24hr format as follows (HH:MM:SS)");
            time = keyboard.nextLine();
            int secondsSinceMidnight2 = calculateSecondsSinceMidnight(time);

            int difference = secondsSinceMidnight2 - secondsSinceMidnight;
            System.out.println("Difference in seconds: " + difference);
        } catch (InvalidTimeException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Enter a valid time");
        } finally {
            keyboard.close();
        }
    }

    public static int calculateSecondsSinceMidnight(String time) throws Exception {
        String[] tokens = time.split(":", 3);
        if (tokens.length != 3) throw new InvalidTimeException("Enter a valid time");
        
        // convert each entry to ints
        int[] times = new int[3];
        for (int i = 0; i < tokens.length; i++) {
            times[i] = Integer.parseInt(tokens[i]);
        }

        validateTime(times[0], 24, "Hours");
        validateTime(times[1], 60, "Minutes");
        validateTime(times[2], 60, "Seconds");

        return (times[0] * 60 * 60) + (times[1] * 60) + times[2];
    }

    public static void validateTime(int time, int max, String timeComponent) throws InvalidTimeException {
        if (time > max || time < 0)
            throw new InvalidTimeException(timeComponent + " must be between 0-" + max);
    }
}
