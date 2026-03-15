package models;

public class Alert implements Comparable<Alert> {

    private String alertId;
    private String message;
    private int severity;
    private String timestamp;

    public Alert(String alertId, String message, int severity, String timestamp) {
        this.alertId = alertId;
        this.message = message;
        this.severity = severity;
        this.timestamp = timestamp;
    }

    public int getSeverity() {
        return severity;
    }

    public String getMessage() {
        return message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getAlertId() {
        return alertId;
    }

    @Override
    public int compareTo(Alert other) {
        // Higher severity comes first
        return Integer.compare(other.severity, this.severity);
    }

    @Override
    public String toString() {
        return "[" + timestamp + "] ALERT (" + severity + "): " + message;
    }
}