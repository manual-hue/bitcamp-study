package com.eomcs;

import java.util.Date;
import java.util.Scanner;

public class gw {
  
  final int BOARD_LENGTH = 5;
  String[] title = new String[BOARD_LENGTH];
  String[] content = new String[BOARD_LENGTH];
  String[] password = new String[BOARD_LENGTH];
  int size = 0;
  int[] viewCount = new int[BOARD_LENGTH];
  Date[] createdDate = new Date[BOARD_LENGTH];
  static Scanner keyboard = new Scanner(System.in);
  
  public void first() {
    
    System.out.println("password? ");
    String enter = keyboard.nextLine();
    
      if ( enter.equals("0811")) {
        System.out.println("Welcome back to S.H.E.I.L.D");
        return;
    } else {
        System.out.println("접근이 거부되었습니다.");
        System.exit(1);
    }//else end
  }
  
  public void mainProcess() {
    
    loop: while(true) {
      System.out.println( );//맨 처음 시작 공백
      System.out.println("<STRIKER 게시판 관리>");
      System.out.print("액세스하고자 하는 메뉴를 입력하세요. ");
      String command = keyboard.nextLine();
      
      switch (command) {
        case "list":
          this.list();
          break;
        case "view":
          this.view();
          break;
        case "add":
          this.add();
          break;
        case "update":
          this.update();
          break;
        case "delete":
          this.delete();
          break;
        default:
          System.out.println("잘못된 명령입니다.");
          break;
        case "quit":
          break loop; 
      }//switch end
    }  //while end
  }    //main process end
    
  
    public void list() {
      System.out.println( );
      System.out.println("글 목록");
      System.out.println( );
    
    for (int i=0; i<size; i++) {
      System.out.printf("%d, %s\n", i, title[i]);
    }//for end
  }

  
    public void add() {

      System.out.println( );
      System.out.println("글 작성");
      System.out.println( );
      
      for(int i=0; i<BOARD_LENGTH; i++) {
      if (size == BOARD_LENGTH) {
        System.out.println("더 이상 글을 작성할 수 없습니다.");
        break;
        } 
      }
      
      System.out.print("title? > ");
      title[size] = keyboard.nextLine();
      
      System.out.print("content? > ");
      content[size] = keyboard.nextLine();
      
      System.out.print("password? > ");
      password[size] = keyboard.nextLine();
      
      System.out.println("Success");
      
      System.out.printf("title > %s\n", title[size]);
      System.out.printf("content > %s\n", content[size]);
      System.out.printf("password > %s\n", password[size]);
      
      size++;

      System.out.println( );
      
    }//add end

    
    public void update() {
      System.out.println( );
      System.out.println("글 변경");
      System.out.println( );
      
      
//      for(int i )
    }//update end
    
    
    public void view() {
      System.out.println( );
      System.out.println("글 조회");
      System.out.println( );
      System.out.print("content Number? > ");
      
      int index = Integer.parseInt(keyboard.nextLine()); // 키보드로 받은 문자 값을 숫자로 반환하겠다.
      
      for(int i=0; i<size ; i++) {
        if (index < 0 || index >= size) {
          System.out.println("무효한 액세스 값입니다. 다시 입력해주시길 바랍니다.");
          break;
        }
      }
      
      viewCount[index]++;
      
      System.out.printf("title: %s\n", title);
      System.out.printf("content: %s\n", content);
      System.out.printf("password: %s\n", password);
      System.out.printf("createdDate: %1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS\n", createdDate[index]);
      System.out.println( );
    }// view end
    
    public void delete() {
      
      System.out.println( );
      System.out.println("글 삭제");
      System.out.println( );
      
    }// delete end

    public static void main(String[] args) {
      
      gw gwstriker = new gw();
      gwstriker.first(); // 패스워드부터 진입
      gwstriker.mainProcess(); // 그 다음 메인 메뉴
      
      System.out.println("액세스 프로그램을 종료합니다.");
    }
    
  }