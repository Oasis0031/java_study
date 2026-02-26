package lambdaTask4;

public class LambdaTask4 {
    public static void main(String[] args) {
        
        // 1. 구구단 출력 람다
        Multipication multipication = (num) -> {
            for (int i = 1; i <= 9; i++) { // 구구단은 보통 1부터 시작하므로 수정했습니다.
                System.out.println(num + " x " + i + " = " + (num * i));
            }
            return num;
        };
        
        multipication.multi(3);
        System.out.println("-------------------------");

        // 2. 사칙연산 계산기 람다
        Calculator cal = (num1, num2, mark) -> {
            int result = 0;
            switch(mark) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break; 
                case "*": result = num1 * num2; break;
                case "/": result = num1 / num2; break;
                default : result = -1;
            }
            return result;
        }; // 람다 식 종료
        
        System.out.println(cal.calculator(5, 3, "-"));
        System.out.println("-------------------------");

        // 3. 내림차순 정렬 람다 (선택 정렬)
        Descending des = (arr) -> {
            for(int i = 0; i < arr.length - 1; i++) {
                int maxIndex = i;
                for(int j = i + 1; j < arr.length; j++) {
                    if(arr[j] > arr[maxIndex]) {
                        maxIndex = j;
                    }
                }
                // swap
                int temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
            return arr;
        };

        int[] numbers = {10, 3, 7, 8, 0, 9};
        
        // 인터페이스의 메서드명이 des.sort()라고 가정하거나 des.descending() 등으로 호출
        numbers = des.descending(numbers); 
        
        for(int number : numbers) {
            System.out.print(number + " ");
        }
        
    } // main 메서드 종료
} // 클래스 종료