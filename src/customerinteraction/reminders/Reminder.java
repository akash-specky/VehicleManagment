package customerinteraction.reminders;

import vehicles.Vehicle;

public class Reminder {
    private Vehicle vehicle;
    private String message;
    private int intervalInMonths;
    private long lastMaintenanceTimestamp;

    public Reminder(Vehicle vehicle, String message, int intervalInMonths) {
        this.vehicle = vehicle;
        this.message = message;
        this.intervalInMonths = intervalInMonths;
        this.lastMaintenanceTimestamp = System.currentTimeMillis();
    }

    // Check if the reminder is due
    public boolean isDue() {
        long currentTime = System.currentTimeMillis();
        long monthsPassed = (currentTime - lastMaintenanceTimestamp) / (30L * 24L * 60L * 60L * 1000L);
        return monthsPassed >= intervalInMonths;
    }

    public String getMessage() {
        return message;
    }
}
