# jv-lambda-calc

Write a calculator. Method `calculate()` should accept three parameters: two values of type `double` and operation of type `char`. 
This method should be able to perform the following operations: 

- Addition
- Subtraction
- Division
- Multiplication
- raising to a power

In your test class you should cover such test cases:
- addition with 2 positive operands;
- addition with 2 negative operands;
- addition with positive and negative operands;
- addition with zero in different places;
- addition for min and max double values;
- same for subtraction;
- same for multiplication;
- same for division (check division by 0);
- raising positive/negative value to the positive power;
- raising positive/negative value to the negative power;
- raising positive/negative value to zero power;
- raising zero to power;
- illegal operation;

In some cases, you'll have to use delta value in `assertEquals` for doubles. Difference should be less than DELTA in order for test to pass;
For example: 
```java
   double expected = 2.0005;
   double actual = 2.00041;
   double delta = 0.0001;
   assertEquals(expected, actual, delta);
//test passed
```

There are a lot of ways to name your test methods. The main point is that they should have informative names and be consistent along with other developers in your team.
For this task use such convention:
`<methodUnderTest>_<state>_<expectedBehavior>`;
For example, if we are testing the method calculate with an illegal character passed as an operation the test method name should be calculate_illegalOperation_notOk.
notOk is because the test expects the `calculate` method to throw an exception.


[Try to avoid these common mistakes while solving the task](https://mate-academy.github.io/jv-program-common-mistakes/java-core/junit/lambda-calc)
