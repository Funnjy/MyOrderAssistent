package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller{

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
    private Label error;

    public void onButtonClicked(){
        if (itemName.getText().isEmpty() || quantity.getText().isEmpty() || phoneNumber.getText().isEmpty() || email.getText().isEmpty() || customerName.getText().isEmpty()){
            error.setText("One or more fields is empty");
        }else {
            int number = Integer.parseInt(phoneNumber.getText());
            double qunt = Double.parseDouble(quantity.getText());
            Order o = new Order(itemName.getText(), qunt, dueDate.getValue(), customerName.getText(),number , email.getText(), "Anton");

            System.out.println(o.toString());
            itemName.clear();
            quantity.clear();
            phoneNumber.clear();
            email.clear();
            customerName.clear();
        }

    }
}
