package net.common.bit.상속;

public class Child extends Father {
  
  public static void main(String[] args) {
    //모든 클래스의 최상위 Object 클래스를 상속 받았다
//    Q. Father의 car
    Child ck = new Child();
    ck.book();
    }
   
  public void book() { 
    super.car();
    this.car();
  }

  public void car() {
    System.out.println("child 자식 클래스 car 메서드");
  }
}