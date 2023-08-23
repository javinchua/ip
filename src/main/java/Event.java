/**
 * Represents a task that occurs during a specific period.
 */
public class Event extends Task{
    private String type = "E";
    private String from;
    private String to;

    /**
     * Creates a new event task with the specified description, start time, and end time.
     *
     * @param description The description of the event task.
     * @param from        The start time of the event.
     * @param to          The end time of the event.
     */
    public Event(String description, String from, String to) {
        super(TaskType.EVENT, description);
        this.from = from;
        this.to = to;
    }

    /**
     * Returns a string representation of the event task.
     *
     * @return A formatted string showing the event task's type, status, description, start time, and end time.
     */
    @Override
    public String toString() {
        return super.toString() + " (from: " + this.from + " to: " + this.to + ")";
    }
}
