package com.xwq520.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "aaa");
		map.put("2", "bbb");
		System.out.println(map.put("3", "aaa"));
		System.out.println(map.put("1", "ccc"));
		System.out.println(map);
		/*
		 * 遍历map 第一种：foreach map.keySet() 返回的是所有的key值
		 */
		System.out.println("第一种：通过Map.keySet遍历key和value：");
		for (String key : map.keySet()) {
			String s = map.get(key);
			System.out.println(key + ":" + s);
		}

		/*
		 * 遍历map 第二种：通过Map.entrySet使用iterator遍历key和value
		 */
		System.out.println("第二种：通过Map.entrySet使用iterator遍历key和value：");
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
		}

		/*
		 * 遍历map 第三种：推荐，尤其是容量大时 通过Map.entrySet遍历key和value
		 */
		System.out.println("第三种：通过Map.entrySet遍历key和value");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			// Map.entry<Integer,String> 映射项（键-值对） 有几个方法：用上面的名字entry
			// entry.getKey() ;entry.getValue(); entry.setValue();
			// map.entrySet() 返回此映射中包含的映射关系的 Set视图。
			System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
		}
		
		/*
		 * 遍历map 第四种：通过Map.values()遍历所有的value，但不能遍历key
		 */
		System.out.println("第四种：通过Map.values()遍历所有的value，但不能遍历key");
        for (String v : map.values()) {
            System.out.println("value= " + v);
        }
	}

}
