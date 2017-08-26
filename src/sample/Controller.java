package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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

    private ListOfOrders orderList = new ListOfOrders("Meny Holmlia");


    public void onButtonClicked() throws IOException{

//        if (itemName.getText().isEmpty() || quantity.getText().isEmpty() || phoneNumber.getText().isEmpty() || email.getText().isEmpty() || customerName.getText().isEmpty()){
//            error.setText("One or more fields is empty");
//        }else {
//            int number = Integer.parseInt(phoneNumber.getText());
//            double qunt = Double.parseDouble(quantity.getText());
//            Order o = new Order(itemName.getText(), qunt, dueDate.getValue(), customerName.getText(),number , email.getText(), "Anton");
//
//            Path path = Paths.get("testStore.txt");
//            BufferedWriter bw = Files.newBufferedWriter(path);
//            try{
//                Order item = o;
//                bw.write(item.toString());
//                bw.newLine();
//            } finally {
//                if (bw != null){
//                    bw.close();
//                }
//            }


        int number = Integer.parseInt(phoneNumber.getText());
        double qunt = Double.parseDouble(quantity.getText());
        Order o = new Order(itemName.getText(), qunt, dueDate.getValue(), customerName.getText(),number , email.getText(), "Anton");

        orderList.addNewOrder(o);

        System.out.println(orderList.toString());
        //System.out.println(o.toString());
            itemName.clear();
            quantity.clear();
            phoneNumber.clear();
            email.clear();
            customerName.clear();
        }

    }
