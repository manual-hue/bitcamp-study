package net.common.bit;

public class Dunkin {
  public String coffee( ) {
    //Non-static 메서드, 리턴값
    //객체화 생성 후 객체명.coffee();
    String kind = "아이스라떼";
    return kind;
  }//end

  
  public static void donuts(int cnt) {
    // static 메서드 (매개인자)
    // Dunkin.donuts(3); 접근
    System.out.println("도너츠 메서드 주문갯수 " + cnt + " 입니다");
  }//end
  
  public void menu( ) { //리턴값X, 매개인자X
    
  }
}
