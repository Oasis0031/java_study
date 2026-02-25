package anonymousTask1;

public class Building {
   public static void main(String[] args) {
      GangNam gangnam = new GangNam();
      Jamsil jamsil = new Jamsil();
      YeokSam yeoksam = new YeokSam();
      Sinchon sinchon = new Sinchon();
      
      gangnam.register(new Form() {
         @Override
         public String[] getMenus() {
            return new String[] {"아메리카노", "카페라떼", "녹차라떼", "바닐라 콜드브루"};
         }
      });
      
      
      jamsil.register(new Form() {
         @Override
         public String[] getMenus() {
            return new String[] {"아메리카노", "에이드", "디카페인 아메리카노"};
         }
      });
      
      yeoksam.register(new Form() {
         
         @Override
         public String[] getMenus() {
            return new String[] {"아메리카노", "녹차라떼", "애플민트티"};
         }
      });
      
      sinchon.register(new Form() {
         
         @Override
         public String[] getMenus() {
            return new String[] {"아메리카노", "자몽허니블랙티", "자몽에이드"};
         }
      });
      
      
      gangnam.sell("에이드", gangnam);
      yeoksam.sell("아메리카노", yeoksam);
      sinchon.sell("아메리카노", sinchon);
      jamsil.sell("디카페인 아메리카노", jamsil);
      
      
      
      
   }
}














