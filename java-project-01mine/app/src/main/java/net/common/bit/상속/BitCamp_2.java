package net.common.bit.상속;

public class BitCamp_2 extends LA {//LA상속 체리 메서드 호출
  public static void main(String[] args) {
    BitCamp_2 bc = new BitCamp_2();
    bc.book();
    
  }
  
  public void book() {
    System.out.println("book 몽블랑");
    super.cherry();
    this.cherry();
  }

  @Override public void cherry() {
    System.out.println("제주산 체리 11:07");
  }
  
  //LA 클래스에 있는 cherry 메서드의 재정의 syso제주산 체리 0:57
//  @Override
//  public void cherryChange() {
//    cherry();
//  }
  
  
  
}
