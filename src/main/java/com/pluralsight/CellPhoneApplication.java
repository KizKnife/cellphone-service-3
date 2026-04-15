package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // New CellPhone instance named 'cellPhone1' and 'cellPhone2'
        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();

        // User input serial number, model, carrier, phone number, owner for phone 1
        System.out.println("Phone 1");
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

        // Setters for Phone 1
        setPhone(cellPhone1, serialNumber, model, carrier, phoneNumber, owner);

        // User input serial number, model, carrier, phone number, owner for phone 2
        System.out.println("Phone 2");
        System.out.print("What is the serial number? ");
        serialNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        model = scanner.nextLine();

        System.out.print("Who is the carrier? ");
        carrier = scanner.nextLine();

        System.out.print("What is the phone number? ");
        phoneNumber = scanner.nextLine();

        System.out.print("Who is the owner of the phone? ");
        owner = scanner.nextLine();

        // Setters for Phone 2
        setPhone(cellPhone2, serialNumber, model, carrier, phoneNumber, owner);

        // Getters
        display(cellPhone1);
        display(cellPhone2);

        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());
    }

    public static void setPhone(CellPhone cellPhone1, int serialNumber, String model, String carrier, String phoneNumber, String owner) {
        cellPhone1.setSerialNumber(serialNumber);
        cellPhone1.setModel(model);
        cellPhone1.setCarrier(carrier);
        cellPhone1.setPhoneNumber(phoneNumber);
        cellPhone1.setOwner(owner);
    }

    public static void display(CellPhone cellPhone1) {
        System.out.printf("%nSerial Number: %d%n", cellPhone1.getSerialNumber());
        System.out.printf("Model: %s%n", cellPhone1.getModel());
        System.out.printf("Carrier: %s%n", cellPhone1.getCarrier());
        System.out.printf("Phone Number: %s%n", cellPhone1.getPhoneNumber());
        System.out.printf("Owner: %s%n", cellPhone1.getOwner());
    }

}
