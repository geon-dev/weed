package test;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class 정렬 {

	public static void main(String[] args) {

		
		//https://hianna.tistory.com/551
		//arrayToList();
		//listToArray();
		
//https://st-lab.tistory.com/112		
//		ArraysSort00001(); // Arrays + 길이정렬
		
		
		listSort0001();
		
		
		
		
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 3);
		map.put("b", 2);
		map.put("c", 1);

		
//		맵반복출력(map); // keySet, entrySet

		
//https://velog.io/@cgw0519/Java-HashMap-Value-%EA%B8%B0%EC%A4%80%EC%9C%BC%EB%A1%9C-%EC%A0%95%EB%A0%AC%ED%95%98%EA%B8%B0
//		entrySort01(map); // entrySet
//		comparatorSort01(map); // entrySet + comparator
//		comparatorLamdaSort01(map); // entrySet + Lamda
		
//https://developer-talk.tistory.com/395
//		HashMapSort00001(); // treeMap
//		HashMapSort00002(); // treeMap + comparator
//		HashMapSort00003(); // entrySet + stream
		
//https://velog.io/@dev-easy/Java-Map%EC%9D%84-Key-Value%EB%A1%9C-%EC%A0%95%EB%A0%AC%ED%95%98%EA%B8%B0		
//		collectionSort(); // keySet + Collections
//		comparatorSort0001(); // keySet + Comparator 간단히
		
	}

	private static void listSort0001() {
		//Collections.sort(list, myComparator)
		
		List<String> list = new ArrayList<>();
		list.add("d");
		list.add("a");
		list.add("e");
		list.add("g");
		list.add("d");
		
		System.out.println(list);
		
		
		list.sort(new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		
		System.out.println(list);
		
	}




	private static void ArraysSort00001() {
		String[] arr = {"asd", "efoeffi", "bxnlkv", "wein"};
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}else {
					return o1.length() - o2.length();
				}
			}
		});
		
		System.out.println(Arrays.toString(arr));
		
	}




	private static void listToArray() {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("A");
		arrList.add("B");
		arrList.add("C");
 
		String[] arr = arrList.toArray(new String[arrList.size()]);
		System.out.println(Arrays.toString(arr));
		
		
	}




	private static void comparatorSort0001() {
		Map<String, Integer> map = new HashMap<>();

        map.put("A", 10);
        map.put("D", 30);
        map.put("C", 20);
        map.put("B", 40);
        
        List<String> keySet = new ArrayList<>(map.keySet());
        
        // value값 오름차순
        keySet.sort(new Comparator<String>() {
        	public int compare(String o1, String o2) {
        		return map.get(o1).compareTo(map.get(o2));
        	}
        });
        
        for(String v : keySet) {
        	System.out.println(v + "/" + map.get(v));
        }
        
		System.out.println("========내림차순으로");
		
		keySet.sort((o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
		for(String v : keySet) {
			System.out.println(v + "/" + map.get(v));
		}
		
	}




	private static void collectionSort() {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("A", 10);
		map.put("D", 30);
		map.put("C", 20);
		map.put("B", 40);		
		
		List<String> keySet = new ArrayList<>(map.keySet());
		
		Collections.sort(keySet);
		for(String v : keySet) {
			System.out.println(v + "/" + map.get(v));
		}

		System.out.println("====reverse====");
		
		Collections.reverse(keySet);
		for(String v : keySet) {
			System.out.println(v + "/" + map.get(v));
		}
		
	}




	private static void HashMapSort00003() {
		Map<String, Integer> map = new HashMap<>();
		map.put("John", 34);
		map.put("Jane", 26);
		map.put("Tom", 27);
		map.put("Bill", 29);

		Map<String, Integer> sortedMap = map.entrySet().stream()
				.sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(
						Map.Entry::getKey,
						Map.Entry::getValue,
						(a, b) -> {throw new AssertionError();},
						LinkedHashMap::new
				));
		System.out.println(sortedMap);
		
		
	}




	private static void HashMapSort00002() {
		Map<String, Integer> map = new HashMap<>();
		map.put("John", 34);
		map.put("Jane", 26);
		map.put("Tom", 27);
		map.put("Bill", 29);
			
		System.out.println(map);
		
		Map<String, Integer> sortedMap = new TreeMap<>(new Comparator<String>() {
			public int compare(String o1, String o2) {
				int lng = o1.length() - o2.length();
				
				if(lng != 0) return lng;
				return o1.compareTo(o2);
			}
		});
		
		sortedMap.putAll(map);
		System.out.println(sortedMap);
		
		
		
		
	}




	private static void HashMapSort00001() {
		Map<String, Integer> map = new HashMap<>();

		map.put("John", 34);
		map.put("Jane", 26);
		map.put("Tom", 27);
		map.put("Bill", 29);

		System.out.println(map);
		
		Map<String, Integer> sortedMap = new TreeMap<>(map);
		System.out.println(sortedMap);
			
		
	}




	private static void comparatorLamdaSort01(Map<String, Integer> map) {
		List<Map.Entry<String, Integer>> entryList =
				new ArrayList<>(map.entrySet());
		
		System.out.println(entryList);
		
		entryList.sort(((o1, o2) -> map.get(o1.getKey()) - map.get(o2.getKey())));
		
		System.out.println(entryList);
	}

	private static void comparatorSort01(Map<String, Integer> map) {
		List<Map.Entry<String, Integer>> entryList = 
				new LinkedList<>(map.entrySet());
		
		System.out.println(entryList);
		
		entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue() - o2.getValue();
			}
		});
		
		System.out.println(entryList);
	}
	

	private static void 맵반복출력(Map<String, Integer> map) {
		// keySet
		List<String> keySet = new ArrayList<>(map.keySet());
		for(String key : keySet) {
			System.out.print("key=" + key);
			System.out.print(" value=");
			System.out.println(map.get(key));
		}

		System.out.println();
		
		// entrySet
		List<Map.Entry<String, Integer>> entrySet = new ArrayList<>(map.entrySet());
		System.out.println(entrySet);
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.print(entry.getKey());
			System.out.print(" / ");
			System.out.print(entry.getValue());
			System.out.println();
		}
	}



	private static void entrySort01(Map<String, Integer> map) {
		List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
		
		entryList.sort(Map.Entry.comparingByValue());
		
		for(Map.Entry<String, Integer> entry : entryList){
		    System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
		}
	}

	private static void arrayToList() {
		String[] arr = {"A", "B", "C"};
		
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		
		System.out.println(list);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
