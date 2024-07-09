### Guidelines for Code Best Practices

1. **Plain Old Java Object (POJO)**: A POJO is an object not bounded by any special restriction.
   
2. *(Park & Park, 2023)* **Business logic** is the custom rules or algorithms that handle the exchange of information between a database and user interface.

3. **Deprecation**:
   - Do not modify the method signature. Use `@Deprecated` with an explicit description of the new service instead.
   - Do not use a deprecated class or method.

4. **Avoid `NullPointerException`**: 
   - To avoid a `NullPointerException` when calling the `equals` method of `Object`, use a constant or a non-null object to invoke it.
     - Positive example: `"test".equals(object);`
     - Counter example: `object.equals("test");`

5. **Comparing Floating-Point Numbers**:
   - Do not use `==` or `equals` due to precision errors and rounding issues. Instead:
     1. **Specify an error range**: Two floating-point numbers are considered equal if their difference is within this range.
        ```java
        float a = 1.0f - 0.9f;
        float b = 0.9f - 0.8f;
        float diff = 1e-6f;

        if (Math.abs(a - b) < diff) {
            System.out.println("true");
        }
        ```
     2. **Use `BigDecimal`**:
        ```java
        BigDecimal a = new BigDecimal("1.0");
        BigDecimal b = new BigDecimal("0.9");
        BigDecimal c = new BigDecimal("0.8");

        BigDecimal x = a.subtract(b);
        BigDecimal y = b.subtract(c);

        if (x.equals(y)) {
            System.out.println("true");
        }
        ```

5. **Constructor Logic**: Avoid implementing business logic in the constructor. Use the `init` method instead.

6. **Generics**:
   - Method `add` cannot be used with `<? extends T>`.
   - Method `get` cannot be used with `<? super T>`.

7. **PECS (Producer Extends Consumer Super)**:
   - Use `extends` for frequently reading scenarios.
   - Use `super` for frequently inserting scenarios.

8. **Primitive Types and Wrapper Classes**:
   - POJO class members must be wrapper classes.
   - RPC method return values and arguments must be wrapper classes.
   - Local variables should be primitive data types.
   - A `null` value in a wrapper class can indicate additional information, such as RPC call failure or abnormal exit.
   - Do not assign default values to members of POJO classes like DO, DTO, VO, etc.

9. **`toString` Method**: Implement the `toString` method and call `super.toString` at the beginning if the class extends another POJO class. This helps in printing property values to debug runtime exceptions.

10. **Access Control**: Minimize access to classes, methods, arguments, and variables to reduce harmful coupling. Private members can be removed easily, while public members require careful consideration before updates.

11. **Collections**:
    - Use `Iterator` to remove elements from a collection instead of directly using `.remove()`.
    - Use `entrySet` instead of `keySet` to traverse key-value maps for efficiency.

12. **Thread Management**: Use thread pools instead of explicitly creating threads. Prefer `ThreadPoolExecutor` over `Executors` to make thread pool parameters clearer and reduce the risk of exhausting system resources.

13. **Date and Time**: Replace `Date` with `Instant`, `Calendar` with `LocalDateTime`, and `SimpleDateFormat` with `DateTimeFormatter`.

14. **Conditional Statements**: Avoid complicated expressions in conditional statements. Use boolean variables to store results of complex expressions to increase readability.

# Reference
---
1. Team, I. (2019, October 2). _Business Logic: Definition, Benefits, and Example_. Investopedia. https://www.investopedia.com/terms/b/businesslogic.asp
2. Park, M., & Park, M. (2023, April 26). _8 Principles of Service-Oriented Architecture: Is SOA Dead?_ MuleSoft Blog. https://blogs.mulesoft.com/digital-transformation/soa-principles/