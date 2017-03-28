package com.websystique.springsecurity.model;

/**
 * Created by Павел on 04.03.2017.
 */
public class Product {
    private int idProduct;
    private int number;
    private String name;
    private String client;
    private String price1;
    private int date;
    private String amount;
    private String priceAll;
    private String discount;
    private String store;

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getPrice1() {
        return price1;
    }

    public void setPrice1(String price1) {
        this.price1 = price1;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPriceAll() {
        return priceAll;
    }

    public void setPriceAll(String priceAll) {
        this.priceAll = priceAll;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (idProduct != product.idProduct) return false;
        if (number != product.number) return false;
        if (date != product.date) return false;
        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        if (client != null ? !client.equals(product.client) : product.client != null) return false;
        if (price1 != null ? !price1.equals(product.price1) : product.price1 != null) return false;
        if (amount != null ? !amount.equals(product.amount) : product.amount != null) return false;
        if (priceAll != null ? !priceAll.equals(product.priceAll) : product.priceAll != null) return false;
        if (discount != null ? !discount.equals(product.discount) : product.discount != null) return false;
        if (store != null ? !store.equals(product.store) : product.store != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProduct;
        result = 31 * result + number;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (client != null ? client.hashCode() : 0);
        result = 31 * result + (price1 != null ? price1.hashCode() : 0);
        result = 31 * result + date;
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (priceAll != null ? priceAll.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        result = 31 * result + (store != null ? store.hashCode() : 0);
        return result;
    }
}
