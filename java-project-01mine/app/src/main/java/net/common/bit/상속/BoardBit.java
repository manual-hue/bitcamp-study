package net.common.bit.상속;

public class BoardBit implements BoardImp {
  public static void main(String[] args) {
    
  }//end
  
  public int boardCount() {
    return 0;
  }//end

  public boolean boardInsert() {
    return false;
  }//end

  public void boardDelete(int num) {
    //@override 생략 가능
    
  }//end

  public void index() {
    //인터페이스 소속이 아님 = 상속을 받지 않음 = 재정의되지 않음
    //@Override 기술시 에러
    
  }//end
}//interface END
