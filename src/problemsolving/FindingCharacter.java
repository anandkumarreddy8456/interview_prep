package problemsolving;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindingCharacter {
	
	public static boolean isvalid(String name) {
		for(char ch:name.toCharArray()) {
			if((ch>= 'A' && ch<='Z') || (ch>='a' && ch<='z')) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String name="1234 asdfasdfg 2334w";
		String []arr=name.split(" ");
		List<String> res=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			res.add(arr[i]);
		}
		
		List<String> finalRes=res.stream().filter((i)->isvalid(i)).collect(Collectors.toList());
		System.out.println(finalRes);

	}

}
