package com.myprojecticaro.poc_features_java_23;

import com.myprojecticaro.poc_features_java_23.features.*;

public class PocFeaturesJava23Application {

    public static void main(String[] args) {
        System.out.println("🚀 Running Java 23 Features POC");

        // Call each feature demo for java 23
        StringTemplates.runExample();
        UnnamedPatterns.run("Hello");
        UnnamedPatterns.run(42);
        UnnamedVariables.runExample();
        ScopedValues.runExample();
        StreamGatherers.run();
        VectorApi.run();

        System.out.println("✅ Finished running Java 23 features.");
    }
}
