package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // New CellPhone instance named 'phone'
        CellPhone phone = new CellPhone();

        // User input serial number, model, carrier, phone number, owner
        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();

        // Setters
        phone.setSerialNumber(serialNumber);
        phone.setModel(model);
        phone.setCarrier(carrier);
        phone.setPhoneNumber(phoneNumber);
        phone.setOwner(owner);

        // Getters
        System.out.printf("%nSerial Number: %d%n", phone.getSerialNumber());
        System.out.printf("Model: %s%n", phone.getModel());
        System.out.printf("Carrier: %s%n", phone.getCarrier());
        System.out.printf("Phone Number: %s%n", phone.getPhoneNumber());
        System.out.printf("Owner: %s%n", phone.getOwner());
    }
}
