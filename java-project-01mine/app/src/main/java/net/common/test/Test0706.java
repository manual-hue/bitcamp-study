package net.common.test;

import java.util.Scanner;

public class Test0706 {

  public static void main(String[] args) {
    int a ;
    Scanner sc = new Scanner(System.in);
    //출력insert into insa(sabun,name,buse) values(3345, 'kim', '전산') , 예외처리
    String msg="";
    
        try{
        Exception e = new Exception();
          
        System.out.print("사번을 입력하세요. : ");
        a = Integer.parseInt(sc.nextLine());  

        System.out.print("이름을 입력하세요. : ");
        String b = sc.nextLine();  
        
        System.out.print("부서를 입력하세요. : ");
        String c = sc.nextLine();  
        
        System.out.printf("%d, %s, %s", a, b, c);
        
        sc.close();
        throw e;
        
        } catch ( Exception e ) {
          msg = "insert into insa(sabun,name,buse) values(a, 'b', 'c')" ;
          System.out.println( msg );
      }
    }
  }//class END