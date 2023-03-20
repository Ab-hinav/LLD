package VendingMachineLLD;

public class Item {
    ItemType itemType;
    int price;

    public Item(ItemType itemType, int price) {
        this.itemType = itemType;
        this.price = price;
    }

    public Item() {
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public void setType(ItemType type) {
        this.itemType = type;
    }

    public ItemType getType() {
        return itemType;
    }
}
