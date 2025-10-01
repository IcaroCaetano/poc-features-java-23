package com.myprojecticaro.poc_features_java_23.features;

/**
 * Demonstrates the usage of Unnamed Patterns introduced in Java 23 (JEP 457, Preview).
 * <p>
 * Unnamed patterns allow developers to match a type in pattern matching
 * without needing to capture its value. The underscore symbol ({@code _})
 * is used to indicate that the matched value is intentionally ignored.
 * </p>
 *
 * <p>In this example:
 * <ul>
 *   <li>If the object is a {@link String}, the type is matched but its value is ignored.</li>
 *   <li>If the object is an {@link Integer}, the value is captured and printed.</li>
 *   <li>All other types fall into the {@code default} case.</li>
 * </ul>
 * </p>
 *
 * <p><b>Note:</b> Unnamed Patterns are in preview in Java 23,
 * requiring the {@code --enable-preview} flag when compiling and running.</p>
 */
public class UnnamedPatterns {

    /**
     * Runs an example of pattern matching with unnamed patterns.
     *
     * @param obj the object to be matched against the pattern
     *
     * <p>Behavior:
     * <ul>
     *   <li>If {@code obj} is a {@link String}, prints:
     *       <pre>"It's a String (value ignored)"</pre></li>
     *   <li>If {@code obj} is an {@link Integer}, prints:
     *       <pre>"It's an Integer: X"</pre> where {@code X} is the integer value.</li>
     *   <li>Otherwise, prints:
     *       <pre>"Unknown type"</pre></li>
     * </ul>
     * </p>
     */
    public static void run(Object obj) {
        switch (obj) {
            case String _ -> System.out.println("It's a String (value ignored)");
            case Integer i -> System.out.println("It's an Integer: " + i);
            default -> System.out.println("Unknown type");
        }
    }
}

