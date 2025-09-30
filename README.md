# Java 23 Features - Proof of Concept (POC)

This project demonstrates the main new features introduced in **Java 23** (released September 2024).  
The goal is to provide simple examples for each feature so you can explore and experiment with them.

---

## 🆕 Features Covered

### 1. String Templates (JEP 459, 2nd Preview)
- Allows embedding expressions directly into strings with the `STR."..."` syntax.
- Example:  
  ```java
  String result = STR."The sum of \{x} + \{y} is \{x + y}";

### 2. Unnamed Variables (JEP 456, Preview)

- Use _ when you don’t care about a variable’s value.

- Example:

```

for (String _ : names) {
    System.out.println("Hello!");
}
```

### 3. Unnamed Patterns (JEP 457, Preview)

- Use _ to ignore matched values in pattern matching.

- Example:

```
switch (obj) {
    case String _ -> System.out.println("It's a String (ignored)");
    case Integer i -> System.out.println("Integer: " + i);
}
```

### 4. Scoped Values (JEP 464, Finalized)

- A lightweight alternative to thread-local variables for sharing immutable data across threads.

- Example:

````
ScopedValue.where(USER, "user-123").run(() -> {
    System.out.println("Scoped value: " + USER.get());
});
````

### 5. Stream Gatherers (JEP 461, Preview)

- New API for custom stream operations such as sliding windows.

- Example:

  ````
  Stream.of(1,2,3,4,5)
        .gather(Gatherers.windowSliding(3))
        .toList();
  ````

### 6. Vector API (JEP 460, Incubator)

- Introduces SIMD operations for better performance on numerical computations.

- Example:
  ````

  var va = IntVector.fromArray(SPECIES, a, 0);
  var vb = IntVector.fromArray(SPECIES, b, 0);
  var vc = va.add(vb);
  ````

## 📂 Project Structure

````

src/
 └─ com/myprojecticaro/poc_features_java_23/features/
      ├─ StringTemplates.java
      ├─ UnnamedVariables.java
      ├─ UnnamedPatterns.java
      ├─ ScopedValuesExample.java
      ├─ StreamGatherersExample.java
      └─ VectorApiExample.java
````

## ▶️ Running the Examples

1. Make sure you have JDK 23 installed.

````
java --version
````

2. Compile the project:

````
javac --enable-preview --release 23 -d out $(find src -name "*.java")
````

3. Run an example (with preview enabled):

````

java --enable-preview -cp out com.myprojecticaro.poc_features_java_23.features.StringTemplates
````

## ⚠️ Notes

- Some features are still preview (--enable-preview flag required).

- Vector API is still incubator → requires --add-modules jdk.incubator.vector.
Example:

````

java --enable-preview --add-modules jdk.incubator.vector -cp out com.myprojecticaro.poc_features_java_23.features.VectorApiExample
````

## 📚 References

### - JEP 459: String Templates (2nd Preview)

### - JEP 456: Unnamed Variables

### - JEP 457: Unnamed Patterns

### - JEP 464: Scoped Values

### - JEP 461: Stream Gatherers

### - JEP 460: Vector API (6th Incubator)
