package main;
import model.*;
import storage.*;

public class TrackerDemo {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to tests!");
        System.out.println();


        // Book storage test
        StorageUnit<Book> bookStorage = new StorageUnit<>();
        bookStorage.addItem(new Book("Java 101"));
        System.out.println("Test 1:");
        System.out.println(bookStorage.getItem().getTitle());
        System.out.println();

        // Snack storage test
        StorageUnit<Snack> snackStorage = new StorageUnit<>();
        System.out.println("Test 2:");
        snackStorage.addItem(new Snack("Twix"));
        System.out.println(snackStorage.getItem().getTitle());
        System.out.println();


        // Device storage test
        StorageUnit<Device> deviceStorage = new StorageUnit<>();
        System.out.println("Test 3:");
        deviceStorage.addItem(new Device("Pixel 6"));
        System.out.println(deviceStorage.getItem().getTitle());
        System.out.println();

    }
}