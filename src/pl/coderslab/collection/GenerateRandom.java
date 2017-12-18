package pl.coderslab.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GenerateRandom {
	public static void main(String[] args) {
		Map<Integer, Integer> myMap=checkRand(5000, 10);
		for (Integer i : myMap.keySet()) {
			System.out.println(i+" : "+myMap.get(i));
		}
	}
	public static Map<Integer, Integer> checkRand(int amount, int interval){
		Random r = new Random();
		Map<Integer, Integer> results = new HashMap<>();
		for (int i = 0; i < amount; i++) {
			int tmp = r.nextInt(interval);
			if(results.containsKey(tmp)){
				int previous = results.get(tmp);
				previous++;
				results.put(tmp, previous);
			}
			else{
				results.put(tmp, 1);
			}
		}
		
		return results;
		
	}
}

