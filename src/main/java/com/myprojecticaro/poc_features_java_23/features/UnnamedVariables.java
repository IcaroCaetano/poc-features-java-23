package com.myprojecticaro.poc_features_java_23.features;

/**
 * Demonstrates the use of <b>Unnamed Variables</b>, a feature introduced in Java 23 (JEP 456).
 * <p>
 * Unnamed variables allow developers to explicitly ignore a variable when it is not needed.
 * Instead of creating an unused variable (which can trigger compiler warnings),
 * the underscore symbol {@code _} can be used as a placeholder to indicate
 * that the variable is intentionally ignored.
 * </p>
 *
 * <p><b>Example use case:</b> Iterating over an array when the element value is irrelevant,
 * such as performing a repeated action a fixed number of times.</p>
 *
 * <p><b>Output:</b></p>
 * <pre>
 * Hello!
 * Hello!
 * Hello!
 * </pre>
 *
 * @author Icaro
 * @since Java 23
 */
public class UnnamedVariables {

    /**
     * Runs a simple demonstration of unnamed variables in a {@code for-each} loop.
     * <p>
     * Instead of binding each element of the array {@code names} to a named variable,
     * the underscore {@code _} is used to indicate that the value is intentionally ignored.
     * </p>
     *
     * <p>For each element in the array, this method prints "Hello!" to the console.</p>
     */
    public static void runExample() {
        String[] names = { "Alice", "Bob", "Carol" };

        for (String _ : names) {
            System.out.println("Hello!");
        }
    }
}
