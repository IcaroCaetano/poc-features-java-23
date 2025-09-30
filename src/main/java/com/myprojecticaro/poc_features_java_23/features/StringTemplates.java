package com.myprojecticaro.poc_features_java_23.features;

public class StringTemplates {

    public static void runExample() {
        int x = 10, y = 20;

        // Using string templates (JEP 459)
        String result = STR."The sum of \{x} + \{y} is \{x + y}";
        System.out.println(result);
    }
}