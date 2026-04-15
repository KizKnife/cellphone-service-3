package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // New CellPhone instance named 'cellPhone1' and 'cellPhone2'
        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();
        CellPhone cellPhone3 = new CellPhone(
                12345,
                "PS Vita",
                "AT&T",
                "900-689-9051",
                "Kiz"
        );

        buildPhoneNumber(scanner, cellPhone1);
        buildPhoneNumber(scanner, cellPhone2);

        // Getters
        display(cellPhone1);
        display(cellPhone2);
        display(cellPhone3);

        cellPhone1.dial(cellPhone2);
        cellPhone2.dial(cellPhone1);
        cellPhone1.dial(cellPhone3);
    }

    public static void buildPhoneNumber(Scanner scanner, CellPhone cellPhone) {
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

        // Setters for Phone
        setPhone(cellPhone, serialNumber, model, carrier, phoneNumber, owner);

        // Line break
        System.out.println();
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
