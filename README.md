## SimpleTuples

> A simple library for tuples in Java 8!

### Usage
There are multiple ways to use this library, some of which are:
##### Tuples builder
Using `Tuples.of( *params* );`
```java
public void doSomething() {
  Pair<String, Integer> pair = Tuples.of("string", 1);
  System.out.println("first value is " + pair.getFirstValue());
  System.out.println("second value is " + pair.getSecondValue());
}
```
##### Types builder
Using `*type*.of( *params* );`
```java
public void doSomething() {
  Pair<String, Integer> pair = Pair.of("string", 1);
  System.out.println("first value is " + pair.getFirstValue());
  System.out.println("second value is " + pair.getSecondValue());
}
```
##### Constructors
Using `new *type*<>( *params* );`
```java
public void doSomething() {
  Triplet<String, Integer, Double> triplet = new Triplet<>("string", 1, 2.0d);
  System.out.println("first value is " + triplet.getFirstValue());
  System.out.println("second value is " + triplet.getSecondValue());
  System.out.println("third value is " + triplet.getThirdValue());
}
```
##### Inside methods
Using `*type*.to*type*( *params* );`
Notes:
> Those methods creates new tuple objets everytime called.
> Upgrades gain new parameters - including in hashCode() & equals().
> Downgrades lose parameters - including in hashCode() & equals().
```java
public Triplet<String, String, Integer> doUpgrade(Pair<String, String> pair) {
  return pair.toTriplet(1); // new param 1
}
```
```java
public Pair<String, String> doDowngrade(Triplet<String, String, Integer> triplet) {
  return triplet.toPair(); // loses one param
}
```
