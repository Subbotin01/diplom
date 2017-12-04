package com.websystique.springsecurity.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Created by Павел on 04.03.2017.
 */

@Entity
@Table(name = "product", catalog = "mydb")
public class Product {
    private int idProduct;
    private int Number;
    private String Name;
    private String Group;
    private String Client;
    private String PriceFirst;
    private int Date;
    private String Amount;
    private String PriceA   ;
    private String Discount;
    private String Store;
    @Id
    @Column(name = "idProduct", unique = true,
            nullable = false, length = 45)
    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    @Column(name = "Number", unique = true,
            nullable = false, length = 45)
    public int getNumber() {
        return Number;
    }

    public void setGroup(String Group) {
        this.Group = Group;
    }

    @Column(name = "Group", unique = true,
            nullable = false, length = 45)
    public String Group() {
        return Group;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }




    @Column(name = "Name", unique = true,
            nullable = false, length = 45)
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Column(name = "Client", unique = true,
            nullable = false, length = 45)
    public String getClient() {
        return Client;
    }

    public void setClient(String Client) {
        this.Client = Client;
    }
    @Column(name = "PriceFirst", unique = true,
            nullable = false, length = 45)
    public String getPrice1() {
        return PriceFirst;
    }

    public void setPrice1(String PriceFirst) {
        this.PriceFirst = PriceFirst;
    }
    @Column(name = "Date", unique = true,
            nullable = false, length = 45)
    public int getDate() {
        return Date;
    }

    public void setDate(int Date) {
        this.Date = Date;
    }
    @Column(name = "Amount", unique = true,
            nullable = false, length = 45)
    public String getAmount() {
        return Amount;
    }

    public void setAmount(String Amount) {
        this.Amount = Amount;
    }
    @Column(name = "PriceA", unique = true,
            nullable = false, length = 45)
    public String getPriceAll() {
        return PriceA;
    }

    public void setPriceAll(String PriceA) {
        this.PriceA = PriceA;
    }
    @Column(name = "Discount", unique = true,
            nullable = false, length = 45)
    public String getDiscount() {
        return Discount;
    }

    public void setDiscount(String Discount) {
        this.Discount = Discount;
    }
    @Column(name = "Store", unique = true,
            nullable = false, length = 45)
    public String getStore() {
        return Store;
    }

    public void setStore(String Store) {
        this.Store = Store;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (idProduct != product.idProduct) return false;
        if (Number != product.Number) return false;
        if (Date != product.Date) return false;
        if (Name != null ? !Name.equals(product.Name) : product.Name != null) return false;
        if (Client != null ? !Client.equals(product.Client) : product.Client != null) return false;
        if (Group != null ? !Group.equals(product.Group) : product.Group != null)
            return false;

        if (PriceFirst != null ? !PriceFirst.equals(product.PriceFirst) : product.PriceFirst != null) return false;
        if (Amount != null ? !Amount.equals(product.Amount) : product.Amount != null) return false;
        if (PriceA != null ? !PriceA.equals(product.PriceA) : product.PriceA != null) return false;
        if (Discount != null ? !Discount.equals(product.Discount) : product.Discount != null) return false;
        if (Store != null ? !Store.equals(product.Store) : product.Store != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProduct;
        result = 31 * result + Number;
        result = 31 * result + (Name != null ? Name.hashCode() : 0);
        result = 31 * result + (Group != null ? Group.hashCode() : 0);
        result = 31 * result + (Client != null ? Client.hashCode() : 0);
        result = 31 * result + (PriceFirst != null ? PriceFirst.hashCode() : 0);
        result = 31 * result + Date;
        result = 31 * result + (Amount != null ? Amount.hashCode() : 0);
        result = 31 * result + (PriceA != null ? PriceA.hashCode() : 0);
        result = 31 * result + (Discount != null ? Discount.hashCode() : 0);
        result = 31 * result + (Store != null ? Store.hashCode() : 0);
        return result;
    }
}
