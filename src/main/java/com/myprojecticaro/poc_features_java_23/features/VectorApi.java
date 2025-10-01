package com.myprojecticaro.poc_features_java_23.features;

import jdk.incubator.vector.IntVector;
import jdk.incubator.vector.VectorSpecies;

/**
 * Demonstrates the use of the <b>Vector API</b>, an incubating feature in Java (JEP 338),
 * which introduces a new set of classes for expressing vector computations
 * that can be reliably compiled to optimal hardware instructions at runtime.
 *
 * <p>
 * The Vector API allows developers to write explicit vectorized code that leverages
 * SIMD (Single Instruction, Multiple Data) instructions available on modern CPUs.
 * This provides significant performance improvements for data-parallel operations
 * compared to traditional scalar computations.
 * </p>
 *
 * <p><b>In this example:</b></p>
 * <ul>
 *   <li>Two arrays {@code a} and {@code b} are initialized with integer values.</li>
 *   <li>They are loaded into {@link IntVector} instances using the preferred species.</li>
 *   <li>A vector addition is performed ({@code va.add(vb)}).</li>
 *   <li>The result is stored back into a standard {@code int[]} array and printed.</li>
 * </ul>
 *
 * <p><b>Output Example:</b></p>
 * <pre>
 * Vector API result: 11 22 33 44 55 66 77 88 ...
 * </pre>
 *
 * @author Icaro
 * @since Java 23 (Incubator Feature)
 * @see jdk.incubator.vector.IntVector
 * @see jdk.incubator.vector.VectorSpecies
 */
public class VectorApi {
    /**
     * Defines the vector species (the shape and size of the vector) to be used.
     * {@link IntVector#SPECIES_PREFERRED} selects the most efficient size for the current platform.
     */
    private static final VectorSpecies<Integer> SPECIES = IntVector.SPECIES_PREFERRED;

    /**
     * Runs a demonstration of the Vector API by performing element-wise addition
     * of two integer arrays using SIMD instructions.
     * <p>
     * Steps:
     * <ol>
     *   <li>Initialize two arrays of integers ({@code a} and {@code b}).</li>
     *   <li>Load them into vector objects ({@code IntVector}).</li>
     *   <li>Perform a vectorized addition ({@code va.add(vb)}).</li>
     *   <li>Store the result into a new array and print it.</li>
     * </ol>
     */
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
