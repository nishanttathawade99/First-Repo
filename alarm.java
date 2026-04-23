import java.time.LocalTime;

public class AlarmClock {

    public static void main(String[] args) {
        // Set alarm time (HH:MM:SS)
        LocalTime alarmTime = LocalTime.of(15, 30, 0); // 3:30 PM

        System.out.println("Alarm set for: " + alarmTime);

        while (true) {
            LocalTime currentTime = LocalTime.now();

            // Check if current time matches alarm time
            if (currentTime.getHour() == alarmTime.getHour() &&
                currentTime.getMinute() == alarmTime.getMinute() &&
                currentTime.getSecond() == alarmTime.getSecond()) {

                System.out.println("⏰ Alarm! Time reached: " + currentTime);
                
                // Play simple beep sound
                java.awt.Toolkit.getDefaultToolkit().beep();

                break; // Stop after alarm rings
            }

            try {
                Thread.sleep(1000); // Check every second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
