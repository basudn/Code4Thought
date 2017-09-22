package misc;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Sort {
	public static void main(String[] args) {
		List<Info> list = new LinkedList<>();
		Info info1 = new Info(1, 1);
		Info info2 = new Info(3, 2);
		Info info3 = new Info(2, 1);
		list.add(info1);
		list.add(info2);
		list.add(info3);
		for(Info info : sortRating(list)) {
			System.out.println(info.id);
		}
	}
	
	public static List<Info> sortRating(List<Info> list) {
		list.sort(new Comparator<Info>() {
			@Override
			public int compare(Info o1, Info o2) {
				return o2.rating - o1.rating;
			}
		});
		return list;
	}
}
