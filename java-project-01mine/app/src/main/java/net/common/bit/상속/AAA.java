package net.common.bit.상속;

public interface AAA {
  public void apple();
  public String memo();
  public boolean nullCheck (int key);
  
  //추상 메서드 구성원이므로 AAA인터페이스로 객체를 생성하면 에러가 발생한다
  //AAA 인터페이스를 상속하지 않으면 객체화가 됨
}


