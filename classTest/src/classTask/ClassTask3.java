package classTask;

// PlayerA
// 10 170 16 24 35
// 카드 뽑기

class PlayerA {
   int[] cards = {10, 170, 16, 24, 35};

// PlayerB의 카드 중에 가장 큰 수와 가장 작은 수를 뽑아올 수 있는 메서드
   public void takeCard(PlayerB playerB) {
      int min = playerB.cards[0];
      int max = playerB.cards[0];
      
      for(int i = 0; i < playerB.cards.length; i++) {
         if(min > playerB.cards[i]) {
            min = playerB.cards[i];
         }
         if(max < playerB.cards[i]) {
            max = playerB.cards[i];
         }
      }
      
      // min, max -> 내가 가진 카드에 추가하는 로직
      addCard(min);
      addCard(max);
      
      removePlayerBCard(min, playerB);
      removePlayerBCard(max, playerB);
      
   }
   
   // 카드를 추가하는 메서드
   void addCard(int card) {
      int[] newCards = new int[this.cards.length + 1];
      
      for(int i = 0; i < this.cards.length; i++) {
         newCards[i] = this.cards[i];
      }
      
      newCards[this.cards.length] = card;
      this.cards = newCards;
   }
   
   // playerB 카드를 제거하는 메서드
   void removePlayerBCard(int card, PlayerB playerB) {
      int[] newCards = new int[playerB.cards.length - 1];
      int index = 0;
      
      for(int i = 0; i < playerB.cards.length; i++) {
         if(playerB.cards[i] != card) {
            newCards[index] = playerB.cards[i];
            index++;
         }
      }
      
      playerB.cards = newCards;
   }
   
   
   void showCards() {
      String result = "";
      for(int card: this.cards) {
         result += String.valueOf(card) + " ";
      }
      System.out.println("A: " + result);
   }
   
   
}

class PlayerB {
   int[] cards = {53, 22, 74, 12, 13};
   
//   PlayerA의 카드 전부 중 모든 숫자의 홀수를 뽑아올 수 있는 메서드
   public void takeCard(PlayerA playerA) {
      for(int i = 0; i < playerA.cards.length; i++) {
         if(playerA.cards[i] % 2 == 1) {
            int oddCard = playerA.cards[i];
            
            addCard(oddCard);
            removePlayerACard(oddCard, playerA);
         }
      }
   }
   
   // 카드를 추가하는 메서드
   void addCard(int card) {
      int[] newCards = new int[this.cards.length + 1];
      
      for(int i = 0; i < this.cards.length; i++) {
         newCards[i] = this.cards[i];
      }
      
      newCards[this.cards.length] = card;
      this.cards = newCards;
   }
   
   // playerA 카드를 제거하는 메서드
   void removePlayerACard(int card, PlayerA playerA) {
      int[] newCards = new int[playerA.cards.length - 1];
      int index = 0;
      
      for(int i = 0; i < playerA.cards.length; i++) {
         if(playerA.cards[i] != card) {
            newCards[index] = playerA.cards[i];
            index++;
         }
      }
      
      playerA.cards = newCards;
   }
   
   
   void showCards() {
      String result = "";
      for(int card: this.cards) {
         result += String.valueOf(card) + " ";
      }
      System.out.println("B: " + result);
   }
}


public class ClassTask3 {
   public static void main(String[] args) {
      PlayerA a = new PlayerA();
      PlayerB b = new PlayerB();
      a.takeCard(b);
      a.showCards();
      b.takeCard(a);
      b.showCards();
      a.showCards();
   }
}

















