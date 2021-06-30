package net.common.bit.상속;

public class Work01jumin {
  public static void main(String[] args) {
    String min = "871024-2541965"; // 키보드 입력 대신 초기값
    String min1 = "871024";
    String min2 = "2541965";
    
    //Q. ****** - 1541965 출력
    //Q. 2/4 여자 1/3 남자 switch()
    //length(), substring(), indexOf(), charAt() 사용
    
          System.out.println("주민등록번호 : " );
          System.out.printf(min + "\n");
          System.out.println("******-" + min2);
          
          char gender = min.charAt(7);{
          switch(gender) {
            case '1':
            case '3': System.out.println("남성입니다"); break;
            case '2':
            case '4': System.out.println("여성입니다."); break;
            default : System.out.println("유효하지 않은 성별입니다."); break;
          }
        }
      
      
    int juminFront = min1.length();
    int juminBack = min2.length();
    int juminLenTotal = min.length(); // min 길이를 juminLen 으로 받겠다.
    
    System.out.println( );
    System.out.println("주민등록번호 총 자릿수");
    System.out.printf("앞자리 : " + juminFront + "\n");
    System.out.printf("뒷자리 : " + juminBack + "\n");
    System.out.printf("- 포함 : " + juminLenTotal + "\n");
    System.out.printf("- 미포함 : " + (juminLenTotal -1));
    }
  }
  
