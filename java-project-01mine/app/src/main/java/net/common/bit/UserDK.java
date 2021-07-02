package net.common.bit;

public class UserDK {
 public static void main(String[] args) {
   System.out.println("UserDK class");
  //문제 Dunkin 클래스 coffee 메소드 호출 donuts 메소드 호출
  //coffee();
//   Dunkin.donuts(3);
   Dunkin dk = new Dunkin();
   String msg = dk.coffee();
   System.out.println("주문하신 음료는" + msg + "입니다.");
 }
}