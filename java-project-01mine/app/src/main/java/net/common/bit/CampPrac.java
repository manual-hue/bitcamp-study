package net.common.bit;

import java.util.Scanner;

public class CampPrac {

  public static void main(String[] args) {
    System.out.println("1차원 배열 캠프");
    Scanner kb = new Scanner(System.in);
    boolean[] camp = new boolean[5];
    int ROOM_LENGTH = 0;
    int booking = 0;
    String[] roomNum = new String[ROOM_LENGTH];
    String[] roomName = new String[ROOM_LENGTH];
    int num = 0;
    
    for(int i=0; i<camp.length; i++) {
      if(camp[i]==true) {
        System.out.println(" "+(i+1)+"번 객실은 현재 이용 불가능합니다. 다른 객실을 이용 바랍니다.");
      } else {
        System.out.println(" "+(i+1)+"번 객실은 현재 이용 가능합니다. 예약을 원하실 경우 메뉴를 진행해주세요.");
      }
    }
    
    loop: while(true) {
      System.out.println("원하시는 메뉴를 선택하세요.\n1. 예약 2. 퇴실 3. 예약 조회 4. 예약 명단 (quit: 종료) > ");
      String command = kb.nextLine(); // 키보드 값으로 입력 받겠다.
      
      switch (command) {
        case "1":
          System.out.println( );
          System.out.println("객실 예약");
          System.out.println( );
          
          if (booking == ROOM_LENGTH) {
            System.out.println("현재 예약 가능한 객실이 없습니다.");
            break;
          }
          
          System.out.println("Room Number? > ");
          roomNum[booking] = kb.nextLine();
          
          System.out.println("Subscriber Name? > ");
          roomName[booking] = kb.nextLine();
          
          System.out.printf("%d\n", roomNum);
          System.out.printf("%d\n", roomName);
          System.out.println("예약이 완료되었습니다.");
          
          booking++;          
          break;
          
        case "2":
          System.out.println( );
          System.out.println("객실 퇴실");
          System.out.println( );
          break;
        case "3":
          System.out.println( );
          System.out.println("예약 조회");
          System.out.println( );
          break;
          
        case "4":
          System.out.println( );
          System.out.println("예약 명단");
          System.out.println( );
          
        for(int i=0; i<booking; i++) {
          System.out.printf("%d, %s\n", i+1, roomName[i]);
        }
        
          break;
          
        case "quit":
        System.out.println("이용해주셔서 감사합니다.");
          break loop;

        default: 
          break;
      }    
    
    
  
    }
    kb.close(); // 키보드는 쓰고 나면 꼭 닫는다.
  }
}
