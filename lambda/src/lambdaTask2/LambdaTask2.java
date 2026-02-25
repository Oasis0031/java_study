package lambdaTask2;

public class LambdaTask2 {
   public static void main(String[] args) {
//      1) 문자열과 정수형을 전달하면 정수형마다 글자를 건너뛰고 반환(리턴)하는 메서드
//      입력 예시)
//      "abcdabcd", 4
      
//      출력 예시
//      "abcabc"
      ModifyString modifyString = (expression, index) -> {
         String result = "";
         for(int i = 0; i < expression.length(); i++) {
            if(i == 0) { 
               result += expression.charAt(i);
               continue;
            }
            
            if(i != 0 && i % index != 0) {
               result += expression.charAt(i);
            }
         }
         return result;
      };
      
      System.out.println(modifyString.jumper("abcdabcd", 3));
      
//      2) 문자열과 문자형을 전달하면 찾은 문자형의 총 개수에 해당하는 해당하는 인댁스 글자(문자형)을 반환(리턴) 메서드
//      없을 시 "-1"
//      "abcdabcd", 'a'
//      출력 결과
//      "c"
      Find find = (expression, c) -> {
         int count = 0;
         char[] chars = expression.toCharArray();
         for(char ch: chars) {
            if(c == ch) {
               count++;
            }
         }
         
         if(count == 0) {
            return "-1";
         }
         
         return String.valueOf(expression.charAt(count));
      };
      
      System.out.println(find.findString("abcd", 'a'));
      
      
//      3) 문자열에서 중복된 값을 모두 없애고 반환(리턴)하는 메서드
//      입력 예시
//      "가나다라마바사가나다라가나다"
      
//      출력 예시
//      "가나다라마바사"
//      .contains(""); boolean
      Dedupe dedupe = (expression) -> {
         String result = "";
         char[] chars = expression.toCharArray();
         for(char c: chars) {
            if(!result.contains(String.valueOf(c))) {
               result += c;
            }
         }
         return result;
      };
      
      System.out.println(dedupe.dedupe("abcabc"));
      
//      4) 문자열을 전달하면 문자열을 뒤집어서 리턴(반환)해주는 메서드
//      입력 예시
//      "123456789"
      
//      출력 예시
//      "987654321"
      Reverse reverse = (expression) -> {
         String result = "";
         for(int i = 0; i < expression.length(); i++) {
            result += expression.charAt(expression.length() - 1 - i);
         }
         
         return result;
      };
      
      System.out.println(reverse.reverseString("abcd"));
      
   }
}












