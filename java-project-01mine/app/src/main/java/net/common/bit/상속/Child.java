package net.common.bit.상속;

public class Child extends Father {
  public static void main(String[] args) {
    //모든 클래스의 최상위 Object 클래스를 상속 받았다
    Child cd = new Child();
    int a = cd.bank(); //에러발생
  }
  
  
  public void book() { int m = bank();
  }
}
