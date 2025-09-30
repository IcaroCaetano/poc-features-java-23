package com.myprojecticaro.poc_features_java_23.features;

import jdk.incubator.vector.IntVector;
import jdk.incubator.vector.VectorSpecies;

public class VectorApi {
    private static final VectorSpecies<Integer> SPECIES = IntVector.SPECIES_PREFERRED;

    public static void run() {
        int length = SPECIES.length();
        int[] a = new int[length];
        int[] b = new int[length];

        for (int i = 0; i < length; i++) {
            a[i] = i + 1;
            b[i] = (i + 1) * 10;
        }

        var va = IntVector.fromArray(SPECIES, a, 0);
        var vb = IntVector.fromArray(SPECIES, b, 0);

        var vc = va.add(vb);
        int[] result = new int[length];
        vc.intoArray(result, 0);

        System.out.print("Vector API result: ");
        for (int v : result) System.out.print(v + " ");
        System.out.println();
    }
}
