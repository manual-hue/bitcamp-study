package net.common.bit;

public class BoardUser {
  public static void main(String[] args) {
    Board ob = new Board();
    ob.setTitle("<6월 장미축제>");
    String data = ob.getTitle();
    // 게터/세터 ==> lombok롬복 연결
    System.out.println(data);


  }//end
}//class END
