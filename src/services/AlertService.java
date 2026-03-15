package services;

import datastructures.AlertPriorityQueue;
import models.Alert;
import utils.DateTimeUtil;

import java.util.UUID;

public class AlertService {

    private AlertPriorityQueue alertQueue;

    public AlertService() {
        alertQueue = new AlertPriorityQueue();
    }

    public void generateAlert(String message, int severity) {

        String alertId = UUID.randomUUID().toString();
        String timestamp = DateTimeUtil.getCurrentTimestamp();

        Alert alert = new Alert(alertId, message, severity, timestamp);

        alertQueue.addAlert(alert);

        System.out.println("Alert Generated: " + message);
    }

    public void handleNextAlert() {

        Alert alert = alertQueue.processAlert();

        if (alert != null) {
            System.out.println("Handling Alert → " + alert);
        }
    }

    public void showAllAlerts() {
        alertQueue.displayAlerts();
    }
}