package classTask1;

public class ClassTask1 {
//넷플릭스
// 애니메이션 영화 드라마
	
// 선택한 영화에 따라 다른 기능 구현
// 애니메이션 "자막 지원"
// 영화 "4D 기능"
// 드라마 "굿즈 판매"
	
	public static void main(String[] args) {
		Netflix netflix = new Netflix();
		netflix.checkGenre(new Animation());
		netflix.checkGenre(new Movie());
		netflix.checkGenre(new Drama());
	}
}
