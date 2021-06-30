package net.common.bit.상속;

public interface BoardImp {
  //메서드 선언만 = abstract method = 추상 메서드 = 명세서
  //abstract 키워드는 생략 가능하다. 기술해도 에러는 없음.
    public abstract int boardCount();
    public abstract boolean boardInsert();
    public void boardDelete(int num);


}//interface END
