package net.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Board {//test 테이블 제어
  public static void main(String[] args) {
    //1. 오라클 db 드라이버 로드하는 명령어 Class.forName("")
    //2. db 서버 접근 계정명, pwd  127.0.0.1:152:XE  system  1234
    //3. 두번째 서버 정보를 참조하여 명령어 생성. Statement ST = 
    int Gtotal = 0;
    Scanner sc = new Scanner(System.in);

    String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
    String id = "system";
    String pwd = "1234";
    String sql = "select * from test"; //명령어는 통일하여 맞춰줘야 한다
    
    Connection CN = null; //서버정보
    Statement ST = null; //명령어crud
    ResultSet RS = null; //결과값
    
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      CN = DriverManager.getConnection(url, id, pwd);
      System.out.println("DB 서버 연결 성공 16:33");
      
      //4. 명령어 생성 후 명령어 실행() 결과값은 ResultSet에 기억된다
      //5. 레코드를 첫번째부터 차례로 이동하며 출력한다 while(조건){코드, 이름, 제목}
      ST = CN.createStatement(); // DB에 '서버 정보'를 저장하고 수행할 sql문 작성

      sql = "select count(*) as hit from test"; 
      RS = ST.executeQuery(sql); // '작성한 명령문'을 '수행'하고 '결과'에 값을 담아라.
      
      System.out.println();
      
      
      
    } catch (Exception ex) {
      System.out.println("error 발생 :" + ex);
    }
    
    
    
    System.out.println();
    
  }//end
  
  public void DBSelectAll() {
    try {
    ST = CN.createStatement();
    sql = "select * from test";
    ResultSet rs = ST.getInt("code");
    while(rs.next()==true) {
      int a = rs.getInt("code");
      String b = rs.getString("name");
      String c = rs.getString("title");
      System.out.println(a+"\t"+b+"\t"+c);
    }
    rs.close();
  }catch(Exception ex) {}
  }
 
  public void DBInsert() {
  }
  
  public void DBDelete() {
    try {
      System.out.print("삭제할 이름 입력 : ");
      String del = sc.nextLine();
      sql = "delete from test where name = '" +del+ "'";
      System.out.println(sql);
      
      
    }
    ST = CN.createStatement();
    
  }
}//Board class END
