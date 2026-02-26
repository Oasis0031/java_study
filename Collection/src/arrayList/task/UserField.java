package arrayList.task;

import java.util.ArrayList;

public class UserField {
   
   public ArrayList<User> users = DBConnecter.users;
   public final int KEY = 300;
   
//   1. 회원가입
//   - name, password, phone  
//   id 중복 체크
   public User checkId(String id) {
      for(User user: users) {
         if(user.getId().equals(id)) {
            return user;
         }
      }
      return null;
   }
   
//   password 암호화
   public String encode(String password) {
      String encodedPassword = "";
      for(int i = 0; i < password.length(); i++) {
         encodedPassword += (char)(password.charAt(i) * KEY);
      }
      return encodedPassword;
   }
   
   public void join(User user) {
      User userInDB = checkId(user.getId());
      if(userInDB == null) {
         user.setPassword(encode(user.getPassword()));
         users.add(user);
      }
   }
   
//   2. 로그인
//   - id, password 화면에서 받음
//   - DB에 id 있는지 검사
//   - id를 찾으면 password 검사
//   - 찾은 user를 리턴
   public User login(User user) {
      User userInDB = checkId(user.getId());
      if(userInDB == null) {
         System.out.println("회원이 존재하지 않습니다.");
         return null;
      }
      
      if(!userInDB.getPassword().equals(encode(user.getPassword()))) {
         System.out.println(userInDB.getPassword());
         System.out.println(encode(user.getPassword()));
         System.out.println("비밀번호가 일치하지 않습니다");
         return null;
      }
      
      return userInDB;
   }
   
//   3. 로그아웃
//   4. 회원탈퇴
//   5. 비밀번호 변경(마이페이지)
//   6. 비밀번호 변경(비밀번호 변경 30일)
//   7. 인증번호 전송
//   8. 인증번호 확인
   public static void main(String[] args) {
      UserField uf = new UserField();
      User user1 = new User("hong123", "홍길동", "1234", "010-1234-1234");
      User user2 = new User("hong123", "김길홍", "1234", "010-4567-4567");
      
      uf.join(user1);
//      uf.join(user2);
//      System.out.println(uf.users);
      
      User currentUser = uf.login(new User("hong123", "홍길동", "1234", "010-1234-1234"));
      System.out.println(currentUser);
      
   }
}

















