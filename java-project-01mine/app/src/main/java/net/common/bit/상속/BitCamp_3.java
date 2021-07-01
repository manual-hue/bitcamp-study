package net.common.bit.상속;

public class BitCamp_3 extends LA {
  public BitCamp_3() { this("종로점",7,"python"); }// 기본생성자는 생략가능
  public BitCamp_3(String location) { }// String매개인자가 있는 생성자
  public BitCamp_3(int floor) { }//int 매개인자가 있는 생성자
  public BitCamp_3(String location, int pos, String subject) {
    System.out.println(location + pos + "층" + subject + "과정입니다.");
  }
  
  public static void main(String[] args) {
    BitCamp_3 bc = new BitCamp_3("종로점" , 7 , "python");
    bc.coffee();
  }
  
  public void coffee() {
    System.out.println("coffee 카누");
    this.cookie(); // this 생략 가능 this() 현재 클래스 생성자 접근
  }

  public void cookie() {//논스태틱
    System.out.println("cookie 버터링");
  }
}
