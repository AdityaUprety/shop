import java.util.ArrayList;

public class CoffeeShop {
    private Inventory inventory;
    private ArrayList<Order> orders;
    private ArrayList<Employee> employees;

    public CoffeeShop() {
        this.inventory = new Inventory();
        this.orders = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public void start() {
        // Implementation of coffee shop operations
    }

    // Getter and setter methods
    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}
