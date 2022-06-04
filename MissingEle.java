package week3.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingEle {
	public static void main(String arg[]) {
		int[] arr = {1,2,3,5,6,7,8};
		List<Integer> ad = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			ad.add(arr[i]);
		}
		System.out.println(ad);
		Collections.sort(ad);
		System.out.println(ad);
		for(int i=0; i<ad.size();i++) {
			if(ad.get(i)!=(i+1)) {
				System.out.println(i+1);
				break;
			}
		}
	}
}
