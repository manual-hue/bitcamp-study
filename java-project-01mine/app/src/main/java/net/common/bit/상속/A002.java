package net.common.bit.상속;

public class A002 {
  public static void main(String[] args/*스트링 배열의 args를 받겠다, 이름 바꿔도 됨*/) {
    String name = args[0];
    int price = Integer.parseInt(args[1]);
    
    System.out.println(name + "표 도시락: " + price + "원");
    }
  }