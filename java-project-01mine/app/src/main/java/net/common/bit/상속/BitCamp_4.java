package net.common.bit.상속;

public class BitCamp_4 extends Father implements AAA, BBB {
  public static void main(String[] args) {
    BitCamp_4 bc4 = new BitCamp_4();
    bc4.game();
  }
  
  public void game() {
    System.out.println("삼국지 사마의");
    int m = this.bank();
  }

  @Override public void apple() {
    System.out.println("BitCamp_4 소속의 apple method");
  }

  @Override public String memo() {
    return null;
  }

  @Override public boolean nullCheck(int key) {
    return false;
  }

  @Override public void blue() {    
  }
}