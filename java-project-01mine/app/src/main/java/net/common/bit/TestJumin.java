package net.common.bit;

//public class TestJumin {
//  public static void main(String[] args) {  
//    String min = "871024-1541965";
//    
//    if (min.charAt(7) == '1'){
//      System.out.println("남자입니다.");
//    } else {
//      System.out.println("여자입니다.");
//    }
//  }//end
//}//class END

public class TestJumin {
  public static void main(String[] args) {
    String min = "871024-2541965";
    char gender = min.charAt(7);
    String message = "당신의 성별은?";
    
    if( gender == '1' ) {
      message = "당신은 남자입니다.";      
    } else if( gender == '2') {
      message = "당신은 여자입니다.";
    } else {
      System.out.println("당신의 성별은?");
    }
  }
}