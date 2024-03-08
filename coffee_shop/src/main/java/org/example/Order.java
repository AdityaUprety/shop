import java.util.Date;
import java.util.ArrayList;

public class Order {
    private int orderId;
    private Date orderDate;
    private Customer customer;
    private ArrayList<Item> items;
    private double totalPrice;

    public Order(int orderId, Date orderDate, Customer customer, ArrayList<Item> items, double totalPrice) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.customer = customer;
        this.items = items;
        this.totalPrice = totalPrice;
    }

    // Getter methods
    public int getOrderId() {
        return orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    // Setter methods
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
