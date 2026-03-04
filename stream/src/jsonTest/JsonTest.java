package jsonTest;

import java.util.ArrayList;
import java.util.Arrays;

import org.json.JSONArray;
import org.json.JSONObject;

import streamTask.User;

public class JsonTest {
   public static void main(String[] args) {
      ArrayList<User> users = new ArrayList<User>(
            Arrays.asList(
               new User(1L, "홍길동", 20, "개발자", "남"),
               new User(2L, "장보고", 30, "기획자", "남"),
               new User(3L, "이순신", 35, "사장", "남")
            )
         );
      
       //Class -> JSON
      JSONObject userJSON = new JSONObject();
      JSONArray usersJSON = new JSONArray();
      
      //생성자를 통해 생성함.
      System.out.println(new JSONObject(new User(1L, "홍길동", 20, "개발자", "남")));
      
      //new usersJSON(users); 안 됨
      //개개인의 클래스들을 JSONObject로 바꾸고 그걸 JSONArray에 추가
      //class -> JSONObject -> JSONArray
      users.stream()
      .map(JSONObject::new)
      .forEach(usersJSON::put);
      
      System.out.println(usersJSON);
      
   }
}
