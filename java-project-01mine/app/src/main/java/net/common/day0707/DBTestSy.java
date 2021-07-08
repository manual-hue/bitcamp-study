
  package net.common.day0707;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

  //클래스 및 인터페이스 이름 첫글자는 대문자
  //메서드 및 전역변수는 소문자

  public class DBTestSy {
    
    Connection CN = null; //DB 서버 연결 정보 서버 ip, 계정 id, password
    Statement ST = null; //ST=CN.createStatement() 명령어  생성 및 신규 등록, 조회하라
    ResultSet RS = null; //select 조회결과값 전체 데이터를 기억
    String msg = "isud=crud 쿼리문 기술";
    
    Scanner sc = new Scanner(System.in);
    
    public void mainProcess() {
      while(true) {
        System.out.print("1. 목록 2. 추가 quit. 종료");
        String command = sc.nextLine();
        
        switch (command) {
          case "1":
            this.list();
            break;
          case "2":
            this.add();
            break;
          default:
            System.out.println("잘못된 명령입니다.");
            break;
          case "quit":
            System.exit(1);
        }//switch end
      }  //while end
    }    //main process end
    
    
    public void list() {
      
      try {
        Class.forName("oracle.jdbc.driver.OracleDriver"); //Oracle Drive Load
        String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
        CN=DriverManager.getConnection(url, "system", "1234");
        System.out.println("오라클 드라이브 및 서버 연결 성공");
        
        System.out.println(msg);
        
        ST=CN.createStatement(); //명령어만 생성, 가져올 부분
        
        System.out.println("프로그램 전체 데이터 읽어오는 중... 잠시 기다려 주십시오.");
        Thread.sleep(3000);
        msg = "select * from test" ; 
        RS = ST.executeQuery("select * from test"); 
        
        System.out.println("코드\t이름\t");
        while(RS.next()==true) {
            int ucode = RS.getInt("code");
            String uname = RS.getString("name");
            System.out.println(ucode + "\t" + uname);
        }
        
        } catch(Exception ex) {
        System.out.println("Error 사유: " + ex);
      }
    }
    
  public void add() {
      
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver"); //Oracle Drive Load
      String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
      CN=DriverManager.getConnection(url, "system", "1234");
      System.out.println("오라클 드라이브 및 서버 연결 성공");
      
      System.out.println(msg);
      
      ST = CN.createStatement();
      
      System.out.print("\ncode 입력(4자릿수): ");
      int a=Integer.parseInt(sc.nextLine());
      System.out.print("이름 입력: ");
      String b=sc.nextLine();
      System.out.print("제목 입력: ");
      String c=sc.nextLine();

      msg = "insert into test(code,name,title,wdate,cnt) value(3300, 'kim', 'color', sysdate, 0)";
      msg = "insert into test(code,name,title,wdate,cnt) values("+a+", '"+b+"', '"+c+"', sysdate, 0)";

      System.out.println(msg);
      
      int OK = ST.executeUpdate(msg);

      
      if (OK>0) {
        System.out.println(a+"코드 데이터 저장 성공");
        } else { System.out.println(a+"코드 데이터 저장 실패");}
      
      System.out.println("프로그램 전체 데이터 읽어오는 중... 잠시 기다려 주십시오.");
      Thread.sleep(3000);
      msg = "select * from test" ; //문자열을 명령어 인식해서 실행하도록 Statement
      RS = ST.executeQuery("select * from test"); //한 건 출력, 다수 출력, 전체 출력
      
      System.out.println("코드\t이름\t");
      while(RS.next()==true) {
          //필드에 접근하여 데이터를 가져올 때 getXXXX() 메서드 필요
          int ucode = RS.getInt("code");
          String uname = RS.getString("name");
          System.out.println(ucode + "\t" + uname);
      }
      
      } catch(Exception ex) {
      System.out.println("Error 사유: " + ex);
    }
  }
    

  public static void main(String[] args){
    
    DBTestSy db = new DBTestSy();
    
    db.mainProcess(); // 메뉴
    db.list(); // 조회
    db.add(); // 입력
    
    } //main end
  }
