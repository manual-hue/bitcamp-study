//생성자는 클래스 이름과 동일, 리턴 값 없음, 리턴 값이 없어도 void를 기술하지 않는다.
//생성자는 new 키워드 다음으로 기술하여 호출된다.
//ob = new 클래스()
//생성자 중복 가능, 기본 생성자 생략 가능  
//멤버필드 = 전역변수 private 

package net.common.bit.상속;

import java.util.Scanner;

public class Work05Hotel {
  
  private int floor; // 층=행 3층까지 있는 호텔
  private int room; // 호=열 5호까지 있는 호텔 3층*5열 = 15개 방
  private String[][] name = new String[3][5];
  private String title;
  private Scanner sc;
  
  public Work05Hotel() {}
  public Work05Hotel(String name) {
  }
  public Work05Hotel(String name, int year) {}
  
  public void process() {
    Scanner sc = new Scanner(System.in);
    int sel = 9;
    while(true) {
      System.out.print("\n1. 입실\n2. 퇴실\n3. 지도\n4. 목록\n9. 종료 >>> ");
      sel = Integer.parseInt(sc.nextLine());
      if(sel == 9) {
        System.out.println("호텔 예약 프로그램을 이용해주셔서 감사합니다.");
        System.exit(1);
        }
      switch(sel) {
        case 1:
          
          break;
        case 2:
          break;
        case 3:
          break;
        default:
          break;
      }//switch end
    }//while end
  }//process end
  
  public void checkIn() {
    System.out.println("< 입실 예약 >");
    System.out.println("\t> 몇 층에 투숙?");
    floor = Integer.parseInt(sc.nextLine());
    
    System.out.println("\t> 몇 호에 투숙?");
    room = Integer.parseInt(sc.nextLine());
    
    System.out.println("\t> 투숙객 이름?");
    name = sc.nextLine();
    
  }//checkIn end
  
  public void checkOut() {
    
  }//checkOut end
  
  public void map() {//printAll()=list()=display()
    System.out.println("\n\t[ "+title+" 투숙 상태 ]");
    for(int i = 0; i < 3; i++) {
      for(int b = 0; b < 5; b++) {
        System.out.println((i+1)+"0"+(b+1)+"\t");
      }
      
      System.out.println( ); //이름 표시 공백
    
      for(int j = 0; j < 5; j++) {
        if(this.name[i][j] == null) {
          System.out.println("\t");
          continue;
        }//if end
        System.out.print(this.name[i][j]+"\t");
      }//j end
      System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
    }//for i end
  }//map end
  
  public void list() {//영림쌤이 구현해서 보여드릴 예정 안 해도 됨
    
  }//checkIn end
  
  public static void main(String[] args) {
    Work05Hotel wh = new Work05Hotel("신라 스테이");
    wh.process();
  }
}
