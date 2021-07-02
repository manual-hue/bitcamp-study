package net.common.bit.상속;


class A{
  static int value;

  int by;

  static void printAll() {}

}


public class Test {

  public static void main(String[] args) {

    A a = new A();
    a.by = 1;

    A b = new A();
    b.by = 5;


    A.value = 2;
    A.printAll();



  }
}
