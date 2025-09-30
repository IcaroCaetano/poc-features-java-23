package com.myprojecticaro.poc_features_java_23.features;

public class UnnamedPatterns {

    public static void runExample(Object obj) {
        switch (obj) {
            case String _ -> System.out.println("It's a String (value ignored)");
            case Integer i -> System.out.println("It's an Integer: " + i);
            default -> System.out.println("Unknown type");
        }
    }
}
