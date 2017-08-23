package sample;

import java.time.LocalDate;

/**
 * Created by Anton Ilchenko on 20.08.2017.
 */
public class Order {
    private String itemName;
    private Double quantity;
    private LocalDate orderDate;     //Date when order take place
    private LocalDate dueDate;   // When order should be delivered
    private String customerName;
    private int customerPhoneNumber;
    private String customerEmail;
    private String workerName;  //Name of who talk to the customer and draw order


    public Order(String itemName, Double quantity, LocalDate dueDate, String customerName, int customerPhoneNumber, String customerEmail, String workerName) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.dueDate = dueDate;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerEmail = customerEmail;
        this.workerName = workerName;
        this.orderDate = LocalDate.now();
    }

    public Order(String itemName, Double quantity, LocalDate dueDate, String customerName, String customerEmail, String workerName) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.dueDate = dueDate;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.workerName = workerName;
        this.orderDate = LocalDate.now();
        this.customerPhoneNumber = 0000000;

    }

    public Order(String itemName, Double quantity, LocalDate dueDate, String customerName, int customerPhoneNumber, String workerName) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.dueDate = dueDate;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.workerName = workerName;
        this.orderDate = LocalDate.now();
        this.customerEmail = "No customer e-mail";
    }

    @Override
    public String toString() {
        return "" + customerName +
                " ønsker å bestille " +
                itemName + " " + quantity +
                " til følgende dato " + dueDate +
                ".\n Bestilling er tatt av " + workerName + ", " + orderDate;
    }
}
