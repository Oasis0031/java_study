package operTask;

import java.util.Scanner;

public class OperTask02 {
	public static void main(String[] args) {
//      삼항 연산자
//      각각 사용자에게 동물을 입력 받고,
//      해당 동물에 해당되는 메세지를 출력하세요.
//      운명의 동물 찾기
//      사용자가 입력한 값에 따라 다른 결과를 출력하시오.
//      1. 고양이
//      고양이를 좋아하는 당신은 대훈이의 러버입니다.
      
//      2. 소
//      소를 좋아하는 당신은 세종이의 단짝입니다.
      
//      3. 강아지
//      강아지를 좋아하는 당신은 민균이의 짝사랑입니다.
      
//      4. 고라니
//      고라니를 좋아하는 당신은 미쳤습니다.
	   
	   String cat = "고양이", cow = "소", dog = "강아지", waterDeer= "고라니", answer = "", result ="",
			  message= "동물을 입력하시오.(고양이, 소, 강아지, 고라니)", messageCat = "고양이를 좋아하는 당신은 대훈이의 러버입니다.", 
			  messageCow = "소를 좋아하는 당신은 세종이의 단짝입니다.",  messageDog = "강아지를 좋아하는 당신은 민균이의 짝사랑입니다.", 
			  messageWaterDeer = "고라니를 좋아하는 당신은 미쳤습니다.", messageError = "해당하는 동물이 없습니다.";
	   		  
	   System.out.println(message);
	   Scanner sc = new Scanner(System.in);
	   
	   answer = sc.nextLine();
	   result = answer.equals(cat) ? messageCat : answer.equals(cow) ? messageCow 
			    : answer.equals(dog) ? messageDog : answer.equals(waterDeer) ? messageWaterDeer : messageError; 
	   System.out.println(result);
	   sc.close();
   }
}
