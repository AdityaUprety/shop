import java.util.HashMap;

public class Inventory {
    private HashMap<String, Integer> stock;

    public Inventory() {
        this.stock = new HashMap<>();
        // Initialize stock
    }

    // Getter and setter methods
    public HashMap<String, Integer> getStock() {
        return stock;
    }

    public void setStock(HashMap<String, Integer> stock) {
        this.stock = stock;
    }

    // Methods to update and manage inventory
    public void addItem(String itemName, int quantity) {
        if (stock.containsKey(itemName)) {
            int currentQuantity = stock.get(itemName);
            stock.put(itemName, currentQuantity + quantity);
        } else {
            stock.put(itemName, quantity);
        }
    }

    public void removeItem(String itemName, int quantity) {
        if (stock.containsKey(itemName)) {
            int currentQuantity = stock.get(itemName);
            int newQuantity = currentQuantity - quantity;
            if (newQuantity <= 0) {
                stock.remove(itemName);
            } else {
                stock.put(itemName, newQuantity);
            }
        } else {
            System.out.println("Item not found in inventory.");
        }
    }

    public int getQuantity(String itemName) {
        return stock.getOrDefault(itemName, 0);
    }
}
