package com.myprojecticaro.poc_features_java_23.features;

/**
 * Demonstrates the usage of String Templates introduced in Java 23
 * (JEP 459, 2nd Preview).
 * <p>
 * String Templates provide a concise and safe way to embed expressions
 * directly into string literals using the {@code STR."..."} syntax.
 * This eliminates the need for verbose concatenation or {@link String#format}.
 * </p>
 *
 * <p>In this example:
 * <ul>
 *   <li>Two integers {@code x = 10} and {@code y = 20} are defined.</li>
 *   <li>A string template is used to embed both values and their sum into a string.</li>
 *   <li>The result is printed to the console.</li>
 * </ul>
 * </p>
 *
 * <p><b>Note:</b> String Templates are still in preview in Java 23, so the
 * {@code --enable-preview} flag must be enabled when compiling and running.</p>
 */
public class StringTemplates {

    /**
     * Runs a simple example of using String Templates.
     * <p>
     * Steps:
     * <ol>
     *   <li>Defines two integer variables {@code x} and {@code y}.</li>
     *   <li>Uses a string template {@code STR."..."} to embed {@code x}, {@code y}, and their sum.</li>
     *   <li>Prints the resulting string to the console.</li>
     * </ol>
     * </p>
     *
     * Example output:
     * <pre>
     * The sum of 10 + 20 is 30
     * </pre>
     */
    public static void run() {
        int x = 10, y = 20;

        // Using string templates (JEP 459)
        String result = STR."The sum of \{x} + \{y} is \{x + y}";
        System.out.println(result);
    }
}
