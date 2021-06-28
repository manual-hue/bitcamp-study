package net.common.bit;

import java.util.Scanner;

class CampTest1 {

  public static void main(String[] args) {
    
    final int ROOM_LENGTH = 5;
    String[] roomNum = new String[ROOM_LENGTH];
    String[] roomName = new String[ROOM_LENGTH];
    int size = 0;
    Date[] createdDate = new Date[ROOM_LENGTH];
    
    System.out.println("<1차원 배열 캠프예매 28일 월요일>");
    
    Scanner sc = new Scanner(System.in);
    
    loop: while(true) {
      
      if (){
        System.out.println("1번째 캠프장은 비어 있습니다.");
        
        
      } else {
    
      };

      System.out.println("");
      System.out.println("");
      
      System.out.print("메뉴를 입력하세요. (1. 예약 2. 퇴실 3. 보기 9. 종료)> ");
      String command = sc.nextLine();
      
      switch (command) {
        case "1":
          System.out.println( );
          System.out.println("예약");
          System.out.println( );
          
          if (size == ROOM_LENGTH) {
            System.out.println("지금은 예약 가능한 방이 존재하지 않습니다.");
            break;
          } 
          
          System.out.print("호실? > ");
          roomNum[size] = sc.nextLine();
          
          System.out.print("예약자명? > ");
          roomName[size] = sc.nextLine();
          
          System.out.println("예약이 완료되었습니다.");
          System.out.println( );
          
          System.out.printf("호실 > %s\n", roomNum[size]);
          System.out.printf("예약자명 > %s\n", roomName[size]);
          
          size++;

          System.out.println( );
          
          break;

        case "2":
          System.out.println( );
          System.out.println("퇴실하실 방 번호를 입력해주세요. > ");
          int index = Integer.parseInt(sc.nextLine());          
          
          
          
          if(index < 0 || index > 5) {
            System.out.println(" 퇴실에 성공하였습니다.");
          } else {
            System.out.println("유효하지 않은 번호입니다. 다시 입력해주세요.");
            return;
          }

          break;
          
        case "3":
          System.out.println( );
          System.out.println("예약 조회");
          System.out.println( );
          
          if(size[i] == true) {
            System.out.println(" " + (i+1) + "번째 캠프는 사용 중입니다.");
          } else {
            System.out.println(" " + (i+1) + "번째 캠프는 비어 있습니다.");
          }
          
          index = Integer.parseInt(sc.nextLine()); // 키보드로 받은 문자 값을 숫자로 반환하겠다.
          if (index < 0 || index >= size) {
            System.out.println("없는 호실입니다. 다시 입력해주시길 바랍니다.");
            break;
          }

          System.out.printf("호실: %s\n", roomNum);
          System.out.printf("예약자명: %s\n", roomName);
          System.out.printf("예약일시: %1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS\n", createdDate[index]);
          
          System.out.println( );
          
          break;

        default:
          System.out.println("잘못된 명령입니다. 올바른 번호를 입력해주세요.");
          break;
        case "9":
          break loop; 
      }
    }
    
    sc.close();
    System.out.println("이용해주셔서 감사합니다.");
    
    }
  }