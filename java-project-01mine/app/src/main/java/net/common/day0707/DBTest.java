package net.common.day0707;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

//클래스 및 인터페이스 이름 첫글자는 대문자
//메서드 및 전역변수는 소문자

public class DBTest {
  public static void main(String[] args) {
    Connection CN = null; //DB 서버 연결 정보 서버 ip, 계정 id, password
    Statement ST = null; //ST=CN.createStatement() 명령어  생성 및 신규 등록, 조회하라
    ResultSet RS = null; //select 조회결과를 기억하는 덩어리
    String msg = "isud=crud 쿼리문 기술";
    Scanner sc = new Scanner(System.in);
    
  try {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    
    System.out.println("오라클 드라이버 연결 성공 10:11");
//    System.out.println("\ncode e 입력(4자릿수): ");
//    int a=Integer.parseInt(sc.nextLine());
//    System.out.println("이름 입력: ");
//    String b=sc.nextLine();
//    System.out.println("제목 입력: ");
//    String c=sc.nextLine();
  
  } catch(Exception ex) {
    System.out.println("Error 사유: " + ex);
  }
    
    sc.close();
    
  }//main end
  
  //신규 등록 및 전체 출력 성공 후 메서드를 생성해 최대한으로 메서드를 활용한다.
} //class end
