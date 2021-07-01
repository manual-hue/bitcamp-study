//생성자는 클래스 이름과 동일, 리턴 값 없음, 리턴 값이 없어도 void를 기술하지 않는다.
//생성자는 new 키워드 다음으로 기술하여 호출된다.
//ob = new 클래스()
//생성자 중복 가능, 기본 생성자 생략 가능  
//멤버필드 = 전역변수 private 

package net.common.bit.상속;

import java.util.Scanner;

public class Work05HotelSeikai {

private int floor; // 층=행 3층까지 있는 호텔
private int room; // 호=열 5호까지 있는 호텔 3층*5열 = 15개 방
private String [][] name = new String[3][5];
private String title;

public Work05HotelSeikai() {}

public Work05HotelSeikai(String name) {
   
   String hotelName = name;
   System.out.println("==============================");
   System.out.println(hotelName+"에 오신 것을 환영합니다!");
   System.out.println("==============================");
   
}
public Work05HotelSeikai(String name, int year) {
   
   String hotelName = name;
   int hotelYear = year;
   System.out.println("==============================");
   System.out.println(hotelName+"에 오신 것을 환영합니다");
   System.out.println("이 호텔은 "+hotelYear+"년 되었습니다.");
   System.out.println("==============================");
}


Scanner sc = new Scanner(System.in);

public void process() {
   
   int sel = 9;
   while(true) {
      System.out.print("\n1.입실\n2.퇴실\n3.지도\n4.목록\n9.종료 >>> ");
      sel = Integer.parseInt(sc.nextLine());
      if(sel == 9) {
         System.out.println("호텔 예약 프로그램을 이용해주셔서 감사합니다.");
         System.exit(1);
      }
      switch(sel) {
      case 1:
         checkIn();
         continue;
      case 2:
         checkOut();
         continue;
      case 3:
         map();
         continue;
      case 4:
         list();
         continue;
      default :
         System.out.println("다시 입력해 주십시오.");
         continue;
      }//switch end
   }//while end
}//process end

public void checkIn() {
   
   System.out.print("몇층에 투숙? > ");
   floor=Integer.parseInt(sc.nextLine());
   System.out.print("몇호에 투숙? > ");
   room=Integer.parseInt(sc.nextLine());
   System.out.print("투숙객 이름? > ");
   String guest=sc.nextLine();
   
   for(int i=0; i<3; i++) {
      for(int j=0; j<5; j++) {
         if (i==floor-1 && j==room-1) {
            name[floor-1][room-1]=guest;
         }
         name[i][j]=" ";
      }
   }
   
   
   name[floor-1][room-1]=guest;      
   

}//checkIn end

public void checkOut() {
   
   System.out.print("퇴실하시는 분 성함이? >");
   String guest=sc.nextLine();
   
   for(int i=0; i<3; i++) {
      for(int j=0; j<5; j++) {
         if (guest.equals(name[i][j])) {
            name[i][j]=" ";
         }
      }
   }
   System.out.println(guest+"님의 퇴실 처리가 완료되었습니다.");

}//checkOut end

public void map() {//printAll()=list()=display()

   String[][] roomNum=new String[3][5];
   
   for(int i=0; i<3; i++) {
      for(int j=0; j<5; j++) {
         roomNum[i][j]=(i+1)+"0"+(j+1);
      }
   }
   
   
   for(int i=0; i<3; i++) {
      for(int j=0; j<5; j++) {
         System.out.print(roomNum[i][j]+"\n\t"+name[i][j]+"\t");
      }
      System.out.println();
      System.out.println();
      System.out.println("=======================================");
   }
   
   
}//map end

public void list() {//영림쌤이 구현해서 보여드릴 예정 안 해도 됨

}//checkIn end

public static void main(String[] args) {
   Work05HotelSeikai wh = new Work05HotelSeikai("신라 스테이");
   wh.process();
}


}