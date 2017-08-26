package sample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anton Ilchenko on 25.08.2017.
 */
public class ListOfOrders {
    private final String storeName;
    private List<Order> orders = new ArrayList<>();


    public ListOfOrders(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreName() {
        return storeName;
    }

    public boolean addNewOrder(Order order){
        if (order == null){
            return false;
        }else {
            orders.add(order);
        }
        return true;
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < orders.size(); i++) {
            output += "Item " + i+1 + ": ";
            output += orders.get(i).toString();
            output += "\n";
        }
        return output;
    }
}
