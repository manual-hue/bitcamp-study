package net.common.test;

import java.util.Scanner;

public class Test0706 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //출력insert into insa(sabun,name,buse) values(3345, 'kim', '전산') , 예외처리
    String msg="";
    
      loop: while(true) {
        try{
        System.out.print("사번입력>>>");
        int a = Integer.parseInt(sc.nextLine());  
        
        System.out.print("이름입력>>>");
        String b = sc.nextLine();  
        
        System.out.print("부서입력>>>");
        String c = sc.nextLine();  
        
        System.out.printf("%d, %s, %s", a, b, c);
        
        sc.close();
      } catch ( Exception e ) {
        msg = "insert into insa(sabun,name,buse) values(a, 'b', 'c')" ;
        System.out.println( msg );
        continue loop;
      }
      }
    }
  }//class END