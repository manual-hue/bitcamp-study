package net.common.bit;

public class Dunkin {
  public Dunkin() {}
  
  public String coffee( ) {
    return "iced latte";
  }//end

  
  public void donuts(int cnt) {
    // static 메서드 (매개인자)
    // Dunkin.donuts(3); 접근
    System.out.println("도너츠 메서드 주문갯수 " + cnt + " 입니다");
  }//end
  
  public void menu( ) { //리턴값X, 매개인자X
    
  }
}
