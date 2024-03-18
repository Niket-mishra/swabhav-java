package com.aurionpro.test;

import java.util.function.*;

public class Test {
    public static void main(String[] args) {
        //Function
        Function<Integer, Integer> function = i -> i * i;
        Integer result = function.apply(10);
        System.out.println("Function :" + result);

        //BiFunction
        BiFunction<Integer, Double, String> biFunction = (i, j) -> i + " x " + j;
        String result1 = biFunction.apply(10, 2.0);
        System.out.println("Bifunction :" + result1 + " = 20 ");

        //Predicate
        Predicate<String> predicate = x -> x.length() >= 6;
        boolean result2 = predicate.test("Niket");
        System.out.println("Predicate :" + result2);

        //BiPredicate
        BiPredicate<String, Integer> biPredicate = (x, y) -> x.length() >= y;
        boolean result3 = biPredicate.test("Niket", 5);
        System.out.println("BiPredicate :" + result3);

        //Supplier
        Supplier supplier = () -> Math.random();
        Object result4 = supplier.get();
        System.out.println("Supplier :" + result4);

        //Consumer
        Consumer<Integer> consumer = x ->
            System.out.println("Consumer :"+x);
            consumer.accept(10);






        //UnaryOperator
        UnaryOperator<Boolean> unaryOperator = x -> !x;
        Boolean result5 = unaryOperator.apply(false);
        System.out.println("UnaryOperator :" + result5);

        //BinaryOperator
        BinaryOperator<Boolean> binaryOperator = (x, y) -> !y;
        Boolean result6 = binaryOperator.apply(false, false);
        System.out.println("BinaryOperator :" + result6);

    }
}
