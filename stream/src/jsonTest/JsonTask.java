package jsonTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonTask {
	
	public static String addRoot(String url) {
		return "/app" + url;
	}
	
	public static void main(String[] args) {
//      "/news", "/game", "/brand", "/rank"
//      위 4개 경로를 모두 ArrayList에 추가하고,
//      경로 앞에 "/app"을 붙인 뒤
//      JSONArray로 변경하기

//		ArrayList<String> paths = new ArrayList<>();
//		paths.add("/news");
//		paths.add("/game");
//		paths.add("/brand");
//		paths.add("/rank");
//		
//		ArrayList<String> updatedPath = new ArrayList<>();
//		for(String path:paths) {
//			updatedPath.add("/app"+ path);
//		}
//		
//		JSONArray jsonArray = new JSONArray(updatedPath); 
//		
//		System.out.println(jsonArray.toString());

	ArrayList<Url> urls = new ArrayList<Url>(Arrays.asList(
			new Url("/news"),
			new Url("/game"), 
			new Url("/brand"), 
			new Url("/rank")
			));
	JSONArray urlsJson = new JSONArray();
		
	}
}
