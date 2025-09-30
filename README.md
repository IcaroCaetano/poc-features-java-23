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
