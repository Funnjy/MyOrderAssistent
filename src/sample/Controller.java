package sample;

import com.sun.org.apache.xpath.internal.operations.Or;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Controller {

    @FXML
    private TextField itemName;

    @FXML
    private TextField quantity;

    @FXML
    private DatePicker dueDate;

    @FXML
    private TextField phoneNumber;

    @FXML
    private TextField email;

    @FXML
    private TextField customerName;

    @FXML
    private ListView orderListView;

    @FXML
    private Label error;

    private ListOfOrders orderList = new ListOfOrders("Meny Holmlia");

    public void initialize(){

    }
    public void onButtonClicked() throws IOException {
        if (textFieldsValidation()) {
            int number = Integer.parseInt(phoneNumber.getText());
            double qunt = Double.parseDouble(quantity.getText());
            Order o = new Order(itemName.getText(), qunt, dueDate.getValue(), customerName.getText(), number, email.getText(), "Anton");

            orderList.addNewOrder(o);

            System.out.println(orderList.toString());
            clearTextFields();
        } else {

        }
    }

    public void saveToFile() throws IOException {

        Path path = Paths.get("testStore.txt");
        try(FileWriter file = new FileWriter(String.valueOf(path))){
            List<Order> o;
            o = orderList.getOrders();
            Order item;
            for (int i = 0; i < o.size(); i++) {
                item = o.get(i);
                file.write(item.toString() + "\n");
            }
        }
    }

    private void clearTextFields() {
        itemName.clear();
        quantity.clear();
        phoneNumber.clear();
        email.clear();
        customerName.clear();
    }

    private boolean textFieldsValidation() {

        //Validating itemName field
        if (!itemName.getText().matches("[a-zA-Z]+")) {  //Only Text allowed
            error.setText("Invalid Item Name");
            return false;
        }
        if (!quantity.getText().matches("[0-9]+")) {   //Only int allowed
            error.setText("Invalid quantity number");
            return false;
        }
        if (!phoneNumber.getText().matches("\\d{8}")){  //Only 8 digit number allowed
            error.setText("Invalid phone number");
            return false;
        }
        if (dueDate.getValue()== null){ //User must chose date
            error.setText("Invalid date");
            return false;
        }
        if (!customerName.getText().matches("[a-zA-Z]+")){   //Only letters
            error.setText("Invalid customer Name");
            return false;
        }
        if (!email.getText().matches("^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$")){
            error.setText("Invalid email");
            return false;
        }
        return true;
    }

}
