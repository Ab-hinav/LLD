package VendingMachineLLD;

public class ItemShelf {

    int code;
    Item item;
    int quantity;
    boolean isAvailable;

    public ItemShelf(int code, Item item, int quantity, boolean isAvailable) {
        this.code = code;
        this.item = item;
        this.quantity = quantity;
        this.isAvailable = isAvailable;
    }

    public ItemShelf() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


}
