package net.common.bit;

public class TestLast {//형변환
  public static void main(String[] args) {
    
    int a = 234;
    double b = 78.9;
    String c = "1200";
    
    // Q1. b타입을 int형으로 변환
    int x = (int)b;
    System.out.println(x);
    
    // Q2. c타입을 int형으로 변환
    int y = Integer.parseInt(c);
    System.out.println(y);
    
    // Q3. a타입을 String형으로 변환
    String z = Integer.toString(a);
    System.out.println(z);
    
  }//end
}//class END