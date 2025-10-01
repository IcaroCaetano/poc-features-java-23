package com.myprojecticaro.poc_features_java_23.features;

import java.util.concurrent.Executors;

/**
 * Demonstrates the usage of {@link java.lang.ScopedValue} introduced in Java 23 (JEP 464).
 * <p>
 * Scoped values are a lightweight and efficient alternative to {@link ThreadLocal} 
 * for sharing immutable data across threads. They allow values to be bound to a 
 * specific scope and are automatically cleaned up when the scope ends.
 * </p>
 *
 * <p>In this example:
 * <ul>
 *   <li>A {@code ScopedValue<String>} named {@code USER} is created to hold a user identifier.</li>
 *   <li>The value {@code "icaro-123"} is bound to {@code USER} within a scope.</li>
 *   <li>A single-thread executor is used to run a task that reads the scoped value.</li>
 *   <li>The executor is properly shut down after execution.</li>
 * </ul>
 * </p>
 *
 * <p><b>Note:</b> This feature requires Java 23 or newer, with the {@code --enable-preview} flag
 * if running during its preview stage.</p>
 */
public class ScopedValues {

    /**
     * A scoped value holding a {@link String} that represents a user context.
     * <p>
     * This value is immutable once bound inside a specific scope.
     * </p>
     */
    public static final ScopedValue<String> USER = ScopedValue.newInstance();

    /**
     * Demonstrates how to bind and access a scoped value across threads.
     * <p>
     * Steps:
     * <ol>
     *   <li>Binds the {@link #USER} value to {@code "icaro-123"}.</li>
     *   <li>Runs a task inside a thread that retrieves and prints the value of {@link #USER}.</li>
     *   <li>Ensures that the executor service is shut down after execution.</li>
     * </ol>
     * </p>
     *
     * <p>If an exception occurs during execution, it is wrapped in a {@link RuntimeException}.</p>
     */
    public static void runExample() {
        try {
            ScopedValue.where(USER, "icaro-123").run(() -> {
                var executor = Executors.newSingleThreadExecutor();
                try {
                    executor.submit(() -> {
                        System.out.println("Scoped value in thread: " + USER.get());
                    }).get();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    executor.shutdownNow();
                }
            });
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }
}
