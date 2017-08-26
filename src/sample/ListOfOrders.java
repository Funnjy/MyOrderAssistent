package sample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anton Ilchenko on 25.08.2017.
 */
public class ListOfOrders {
    private final String storeName;
    private List<Order> orders = new ArrayList<>();


    public ListOfOrders(String storeName, Order order) {
        this.storeName = storeName;
    }
}
