package com.myprojecticaro.poc_features_java_23.features;

import java.util.stream.Stream;
import java.util.stream.Gatherers;

/**
 * Demonstrates the usage of Stream Gatherers introduced in Java 23 (JEP 461, Preview).
 * <p>
 * Stream Gatherers provide a new API that allows custom intermediate operations
 * on streams, such as sliding windows, chunking, or other stateful transformations.
 * </p>
 *
 * <p>In this example:
 * <ul>
 *   <li>A stream of integers {@code [1, 2, 3, 4, 5]} is created.</li>
 *   <li>The {@link Gatherers#windowSliding(int)} gatherer is applied with a window size of {@code 3}.</li>
 *   <li>The result is a list of overlapping windows: {@code [[1,2,3], [2,3,4], [3,4,5]]}.</li>
 *   <li>The sliding windows are printed to the console.</li>
 * </ul>
 * </p>
 *
 * <p><b>Note:</b> This feature is still in preview. Running this example
 * requires Java 23 or newer with the {@code --enable-preview} flag enabled.</p>
 */
public class StreamGatherers {

    /**
     * Runs an example of using a Stream Gatherer with a sliding window of size 3.
     * <p>
     * Steps:
     * <ol>
     *   <li>Creates a stream of integers from 1 to 5.</li>
     *   <li>Applies {@link Gatherers#windowSliding(int)} to produce overlapping sublists of 3 elements.</li>
     *   <li>Collects the results into a list.</li>
     *   <li>Prints the list of sliding windows to the console.</li>
     * </ol>
     * </p>
     */
    public static void run() {
        var result = Stream.of(1, 2, 3, 4, 5)
            .gather(Gatherers.windowSliding(3))
            .toList();

        System.out.println("Sliding windows: " + result);
    }
}
