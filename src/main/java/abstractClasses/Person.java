package abstractClasses;

public abstract class Person {
  private String name;
  private int age;
  private double money;

  public Person(String name, int age, double money) {
    this.name = name;
    this.age = age;
    this.money = money;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public double getMoney() {
    return this.money;
  }
}
