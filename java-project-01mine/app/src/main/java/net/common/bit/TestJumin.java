package net.common.bit;

public class TestJumin {
  public static void main(String[] args) {  
    //java.lang 패키지 String 클래스의 method char charAt(int)
    //String 클래스의 method int indexOf(int/String)
    //String 클래스의 method String substring(1시작, 2끝 -1)
    //String 클래스의 method String substring(1시작) -> 문자열 시작부터 끝까지 가져온다.
    String min = "871024-2541965";
    int pos = min.indexOf("-");
    System.out.println("pos = " + pos);
    //출력: 10월 24일 출생이시네요.
    
    String month = min.substring(2, 4);
    String day = min.substring(4, 6);
    System.out.println(month + "월 " + day + "일 출생이시네요.");
    
    String last = min.substring(7); //시작점만 있고 끝이 없어 문자열 전부가 출력된다.
    System.out.println(last);
    
    int len = min.length();
    System.out.println("총 자릿수 = " + (len-1));
    
  }
}
