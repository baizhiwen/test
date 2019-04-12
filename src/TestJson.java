import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestJson {

	public static void main(String[] args){
		Map<String,Object> map = new HashMap<String,Object>();
		Map<String,String> m;
		List<Integer> list = new ArrayList<Integer>();
		List<Map<String,String>> l = new ArrayList<Map<String,String>>();
		m = new HashMap<String,String>();
		m.put("name", "aaa");
		l.add(m);
		m = new HashMap<String,String>();
		m.put("name", "bbb");
		l.add(m);
		m = new HashMap<String,String>();
		m.put("name", "ccc");
		l.add(m);
		m = new HashMap<String,String>();
		m.put("name", "ddd");
		l.add(m);
		map.put("list", l);
		
//		 JSONObject ss = new JSONObject().fromObject(map);
//		 
//		 System.out.println(ss.toString());
	}
	
	/*
		public static void main(String[] args){
		Map<String,Object> map = new HashMap<String,Object>();
		Map<String,String> m;
		List<Integer> list = new ArrayList<Integer>();
		List<Map<String,String>> l = new ArrayList<Map<String,String>>();
		m = new HashMap<String,String>();
		m.put("name", "aaa");
		l.add(m);
		m = new HashMap<String,String>();
		m.put("name", "bbb");
		l.add(m);
		m = new HashMap<String,String>();
		m.put("name", "ccc");
		l.add(m);
		m = new HashMap<String,String>();
		m.put("name", "ddd");
		l.add(m);
		map.put("list", l);
		JSONObject ss = JSONObject.fromObject(map);
		String jo = ss.toString();
		System.out.println(jo);
		
		// 获取参数
		JSONObject jsonObject = JSONObject.fromObject(jo);
		Map<String, String> infoMap = new HashMap<String, String>();
		Iterator<String> iterator = jsonObject.keys();
		String key = null;
		String value = null;

		while (iterator.hasNext()) {
			key = (String) iterator.next();
			value = jsonObject.getString(key);
			infoMap.put(key, value);
		}
		System.out.println(infoMap.toString());
		String lists = infoMap.get("list");
		JSONArray ja = JSONArray.fromObject(lists);
		for(int i = 0;i<ja.size();i++){
			JSONObject name = (JSONObject)ja.get(i);
			System.out.println(i+"--------"+name.getString("name"));
		}
		
		JSONObject ss2 = JSONObject.fromObject(jo);
		JSONArray ja = JSONArray.fromObject(ss2.get("list"));
		for(int i = 0;i<ja.size();i++){
			JSONObject name = (JSONObject)ja.get(i);
			System.out.println(i+"--------"+name.getString("name"));
		}
		 
	}
	 */

}
