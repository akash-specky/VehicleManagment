package customerinteraction.reminders;

import customerinteraction.reminders.Reminder;
import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class MaintenanceReminder {
    private List<Reminder> reminders;


    public MaintenanceReminder() {
        this.reminders = new ArrayList<>();
    }


    public void addReminder(Vehicle vehicle, String message, int intervalInMonths) {
        Reminder reminder = new Reminder(vehicle, message, intervalInMonths);
        reminders.add(reminder);
    }

    public void checkReminders() {
        for (Reminder reminder : reminders) {
            if (reminder.isDue()) {
                System.out.println("Maintenance reminder: " + reminder.getMessage());
            }
        }
    }
}
