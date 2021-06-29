package net.common.bit;

public class Board {
  private String message; // 전역변수 = 필드
    
  public String getTitle() {
    return this.message;
  }

  public void setTitle(String title) {
    message = title;

  }
}//class END
