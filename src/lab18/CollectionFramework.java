package lab18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Vector;

public class CollectionFramework {

	public static void main(String[] args) {
		
		ArrayList<String> intList = new ArrayList<String>();
		
		intList.add("B");
		intList.add("A");
		intList.add("H");
		intList.add("X");
		intList.add("Z");
		intList.add("V");
		
		for (String integerItem : intList) {
			System.out.println(integerItem+ " ");
		}
		
		intList.sort(null);
		
		System.out.println();
		
		for(String integerItem: intList){
			System.out.println(integerItem+" ");
		}
		
		ArrayList<MyClass> myClassLIst = new ArrayList<>();
		
		myClassLIst.add(new MyClass());
		myClassLIst.add(new MyClass());
		myClassLIst.add(new MyClass());
		myClassLIst.add(new MyClass());
		myClassLIst.add(new MyClass());
		myClassLIst.add(new MyClass());
		
		System.out.println();
		
		for(MyClass mc : myClassLIst){
			System.out.println(mc);
		}
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		hashSet.add(1);
		hashSet.add(4);
		hashSet.add(2);
		
		System.out.println();
		System.out.println("HASH SET>>>>> : ");
		for(Integer hs : hashSet){
			System.out.println(hs+" ");
		}
		
		HashMap<String, MyClass> hashMap = new HashMap<>();
		
		hashMap.put("sou", new MyClass());
		hashMap.put("456", new MyClass());
		hashMap.put("789", new MyClass());
		
		System.out.println("\nHASH  MAP\n"+hashMap.get("sou"));
		System.out.println("\nHASH  MAP\n"+hashMap.get("456"));
		
		Vector<String> v = new Vector<>();
		
		v.add("Sourav");
		v.add("Roy");
		
		System.out.println(v.get(0)+" "+v.get(1));	
		
	}

}
