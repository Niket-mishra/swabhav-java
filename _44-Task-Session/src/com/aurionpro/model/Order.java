package com.aurionpro.model;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private int id;
    private LocalDate date;
    private List<LineItem> items;

    public Order(int id, LocalDate date, List<LineItem> items) {

        this.id = id;
        this.date = date;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<LineItem> getItems() {
        return items;
    }

    public void setItems(List<LineItem> items) {
        this.items = items;
    }
    public double calculateOrderPrice(){
        double x = 0;
        for (LineItem item : items) {
            x +=item.calculateLineItemCost();
        }
        return x;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", items=" + items +
                '}';
    }
}
