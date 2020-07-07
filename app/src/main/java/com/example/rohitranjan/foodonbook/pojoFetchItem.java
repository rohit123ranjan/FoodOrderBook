package com.example.rohitranjan.foodonbook;

public class pojoFetchItem {
    private String itemName;
    private String storeQuantity;
    private String storeTotal;

    public pojoFetchItem(String itemName, String storeQuantity, String storeTotal) {
        this.itemName = itemName;
        this.storeQuantity = storeQuantity;
        this.storeTotal = storeTotal;
    }

    public pojoFetchItem() {
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getStoreQuantity() {
        return storeQuantity;
    }

    public void setStoreQuantity(String storeQuantity) {
        this.storeQuantity = storeQuantity;
    }

    public String getStoreTotal() {
        return storeTotal;
    }

    public void setStoreTotal(String storeTotal) {
        this.storeTotal = storeTotal;
    }
}
