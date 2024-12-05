package MapUse;
import java.util.HashMap;
import java.util.Set;
public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		//insert
		map.put("abc",1);
		map.put("def",2);
		
		//check presence
		System.out.println(map.containsKey("abc"));
		System.out.println(map.containsKey("abcd"));
		
		if(map.containsValue(2)) {
			System.out.println("contains 2");
		}
		int ans = map.size();
		System.out.println(ans);
		
		//get value
		int v1 = map.get("abc");
//		int v = map.get("abc1");
		System.out.println();
		
		//remove
		int s = map.remove("abc");
		System.out.println(s);
		
		
		
		map.put("ghi", null);
		map.put("jkl",8);
		//iterate
		Set<String> keys = map.keySet();
		for(String str:keys) {
			System.out.println(str);
		}
		

	}

}
