package com.myprojecticaro.poc_features_java_23.features;

import java.util.stream.Stream;
import java.util.stream.Gatherers;

public class StreamGatherers {

    public static void run() {
        var result = Stream.of(1, 2, 3, 4, 5)
            .gather(Gatherers.windowSliding(3)) 
            .toList();

        System.out.println("Sliding windows: " + result);
    }
}
