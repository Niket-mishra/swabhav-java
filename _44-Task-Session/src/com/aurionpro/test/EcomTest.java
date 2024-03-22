package com.aurionpro.test;

import com.aurionpro.model.Customer;
import com.aurionpro.model.LineItem;
import com.aurionpro.model.Order;
import com.aurionpro.model.Product;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EcomTest {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Nike Shoes", 1200, 2.00);
        Product product2 = new Product(2, "Puma Jackets", 1300, 3.02);
        Product product3 = new Product(3, "Adidas T-Shirts", 1000, 1.50);
        Product product4 = new Product(4, "French Fries", 200, 3.00);
        Product product5 = new Product(5, "Condensed Milk", 500, 2.50);

        LineItem lineItem1 = new LineItem(101, 5, product5);
        LineItem lineItem2 = new LineItem(102, 3, product4);
        LineItem lineItem3 = new LineItem(103, 1, product1);
        LineItem lineItem4 = new LineItem(103, 2, product2);
        LineItem lineItem5 = new LineItem(103, 1, product3);
        List<LineItem> list = new ArrayList<>();
        list.add(lineItem2);
        list.add(lineItem1);
        list.add(lineItem3);
        List<LineItem> list1 = new ArrayList<>();
        list1.add(lineItem5);
        list1.add(lineItem4);
        list1.add(lineItem3);
        list1.add(lineItem2);


        Order order1 = new Order(
                1001,
                LocalDate.of(2023, 12, 31),
                list
        );
        Order order2 = new Order(1002, LocalDate.of(2024, 1, 25),
                list1
        );

        Customer customer1 = new Customer(1101, "Niket Mishra", List.of(order1, order2));
        for (Order order : customer1.getOrders()) {
            System.out.println(order.calculateOrderPrice());

        }
       List<Order> list2 = customer1.getOrders().stream().sorted(Comparator.comparingDouble(Order::calculateOrderPrice)).toList();

       // System.out.println(list2);
        Order order3 = new Order(1003, LocalDate.of(2024, 2, 21), List.of(lineItem5, lineItem2, lineItem3));
        Order order4 = new Order(1004, LocalDate.of(2024, 2, 29), List.of(lineItem1));
        Customer customer2 = new Customer(1102, "Nitin Tiwari", List.of(order3, order4));

        LocalDate startDate = LocalDate.of(2023, 11, 20);
        LocalDate endDate = LocalDate.of(2024, 1, 20);

        List<Order> list3 = customer1.getOrders().stream().filter(order -> order.getDate().compareTo(endDate) * startDate.compareTo(order.getDate()) >= 0).toList();
        System.out.println(list3);

    }
}
