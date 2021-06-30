package net.common.bit.상속;

public class Mother {
    public void car(String name) {
    System.out.println("자동차 이름 = " + name);  
    
  }
}


//  public interface BoardImp{} // 권장
//    class 키워드 대신 interface
//    인터페이스 메소드를 선언만 = 추상 메서드 abstract method
//    public int boardCount(){ ~~ return 316; }
//    public void boardInsert(){}
//    public void boardDelete(int ){}

//public class BoardImp implements BoardImp{} // 권장
//
//public interface Boardinter{} // 비권장
//public interface Boardinterface{} // 비권장
//public interface BoardInter{}  // 비권장