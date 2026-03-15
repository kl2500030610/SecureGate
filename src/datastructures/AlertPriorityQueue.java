package datastructures;

import java.util.PriorityQueue;
import models.Alert;

public class AlertPriorityQueue {

    private PriorityQueue<Alert> alertQueue;

    public AlertPriorityQueue() {
        alertQueue = new PriorityQueue<>();
    }

    public void addAlert(Alert alert) {
        alertQueue.add(alert);
    }

    public Alert processAlert() {

        if (alertQueue.isEmpty()) {
            System.out.println("No alerts to process.");
            return null;
        }

        return alertQueue.poll();
    }

    public boolean isEmpty() {
        return alertQueue.isEmpty();
    }

    public void displayAlerts() {

        if (alertQueue.isEmpty()) {
            System.out.println("No alerts available.");
            return;
        }

        for (Alert alert : alertQueue) {
            System.out.println(alert);
        }
    }
}