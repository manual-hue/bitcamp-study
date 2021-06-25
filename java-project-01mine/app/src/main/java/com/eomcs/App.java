package com.eomcs;

import java.util.Scanner;

//01. main(): 프로그램 entry point
//02. 사용자로부터 명령어 입력 받기
//03. 사용자로부터 계속 명령어 입력 받기
//04. quit 명령어를 입력 받았을 때 반복 종료하기
//05. 명령어 별로 실행을 분기하기
//06. 게시글 입력 받기
//07. 배열을 이용하여 여러 개의 게시글 보관하기
//08. 상수(final 변수)를 이용하여 배열의 크기를 다루기
//09. 게시글 목록 출력하기
//10. 게시글 상세 조회
//11. 게시글 조회수 추가하기
//12. 게시글 등록일 추가하기
//13. 게시글 변경하기
//14. 게시글 삭제하기
//15. 메서드 문법을 이용하여 기능 별로 명령어를 묶어 관리하기
//16. 클래스를 이용하여 새 데이터타입을 정의하기
//17. 클래스를 이용하여 메서드를 분류하기 
//18. 데이터 목록을 다루는 코드를 재사용하기 쉽게 별도의 클래스로 분리한다.
//19. 메뉴 선택 기준을 추가
//20. 리팩토링: method 추출extract => 게시글 관리 메뉴의 처리코드를 별도의 메소드로 분리
//21. 리팩토링:
//    - method 이동move => 게시글을 다루는 일은 BoardHandler에게 맡긴다.
//    - class 이동move => Board 클래스를 사용하는 BoardHandler로 옮긴다.
//22. 회원 관리, 계산기 기능 추가
//23. 메뉴를 실행하는 핸들러 사용 규칙 통일 : 인터페이스 문법의 용도
//    - 규칙 정의 : Handler
//    - 규칙 이행 : BoardHandler, MemberHandler, ComputeHandler
//24. 회원 관리 기능 완성
//    - 회원 정보를 담을 데이터 타입 새로 설계
//    - 회원 등록, 목록 조회, 상세 조회, 변경, 삭제 기능을 부여한다.
//25. 회원 데이터를 별도의 목록으로 관리하기(단순한 방법 = 유지보수가 어렵다.)
//      - 기존의 ArrayList 클래스를 복사하여 ArrayList2 로 만들어 사용한다.
//26. 인스턴스 변수로 배열을 관리하기
//      - ArrayList2.java는 삭제한다.
//      - ArrayList.java의 변수를 인스턴스 변수로 전환한다. 
//      - 메서드에 작업할 때 사용할 변수의 주소를 파라미터로 받는다.
//      - BoardHandler.java와 MemberHandler.java 변경
//      - 각 핸들러가 사용할 ArrayList의 인스턴스를 따로 생성한다
//      - ArrayList의 메서드를 호출할 때마다 인스턴스 주소를 전달한다.
//27. 인스턴스 변수를 사용하는 메서드는 인스턴스 메서드로 선언하기
//      - ArrayList의 메서드를 클래스 메서드에서 인스턴스 메서드로 변환한다.
//      - BoardHandler 와 MemberHandler 에서 Arraylist의 메서드를 호출할 때
//      인스턴스 메서드 호출 규칙에 따라 변경한다.
//28. 게시판 추가하기(클래스를 복제해서 만들기 -> 유지보수가 어렵다.)
//29. 여러 개의 게시판을 다룰 수 있도록 BoardHandler의 변수를 인스턴스 변수로 전환한다.
//      - 또한 메서드도 인스턴스 메서드로 전환한다.
//      - BoardHandler 2를 삭제한다.
//      - 게시판을 구분할 때 사용할 게시판 이름을 담을 인스턴스 변수를 추가한다.
//30. 향후 다양한 그룹의 회원을 관리할 수 있도록 MemberHandler의 변수도 인스턴스 변수로 전환하기
//      - MemberHandler의 스태틱 변수를 인스턴스 메서드로 바꾼다.
//      - 메서드도 인스턴스 메서드로 전환한다.
//      - 실무에서는 가능한 향후 확장성을 고려하여 인스턴스 변수로 주로 선언한다.
//        그러다 보니 메서드도 인스턴스 메서드를 정의하게 된다.
//      - ComputeHandler도 인스턴스 변수로 변경하라.
//31. 인스턴스를 만들 때 반드시 값을 설정하도록 강제하기
//      - 생성자 문법을 적용한다.
//      - 생성자는 인스턴스를 생성할 때 반드시 호출해야 하는 메서드이다.

public class App {

  static Scanner keyScan = new Scanner(System.in);

  public static void main(String[] args) {

    // App 클래스의 Scanner 인스턴스를 각각 핸들러와 함께 쓴다.
    // 규칙에 따라 만든 클래스에 대해
    // 규칙에서 정의한 메서드를 호출하고자 할 경우
    // 먼저 해당 클래스의 인스턴스 생성 후
    // 그 인스턴스를 이용하여 메서드를 호출해야 한다.
    BoardHandler boardHandler = new BoardHandler("게시판1", keyScan);
    BoardHandler boardHandler2 = new BoardHandler("게시판2", keyScan);
    
    MemberHandler memberHandler = new MemberHandler(keyScan); //그룹 이름을 생략하면 일반이라는 이름을 갖도록 한다.
    
    ComputeHandler computeHandler = new ComputeHandler();
    computeHandler.keyScan = keyScan;
    
    menuLoop: while(true) {
      System.out.println("[메뉴]");
      System.out.println("  1. 게시글 관리");
      System.out.println("  2. 게시글 관리 2");
      System.out.println("  3. 회원 관리");
      System.out.println("  4. 계산기");
      System.out.print("메뉴를 선택하세요. (종료: quit) [1..3] ");
      String menuNo = keyScan.nextLine();
      
      switch (menuNo) {
        case "1":
          boardHandler.execute();
          break;
        case "2":
          boardHandler2.execute();
          break;
        case "3":
          memberHandler.execute();
          break;
        case "4 ":
          computeHandler.execute();
          break;
        case "quit":
          break menuLoop;
        default:
          System.out.println("메뉴 번호가 옳지 않습니다.");
      }
     
      System.out.println( );
      
    }
    
      keyScan.close();      
      System.out.println("이용해주셔서 감사합니다.");
      
    }
  }
