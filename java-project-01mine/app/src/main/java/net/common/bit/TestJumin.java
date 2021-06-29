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
    System.out.println(getGender(min));

  }

  public static String getGender(String min) {
    switch(min.charAt(min.indexOf("-")+1)) {
      case '1':
      case '3':
        return "남자";
      case '2':
      case '4':
        return "여자";
      default :
        return null;
    }
  }
}