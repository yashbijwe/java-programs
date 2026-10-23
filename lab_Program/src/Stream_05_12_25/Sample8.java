package Stream_05_12_25;

import java.util.List;
import java.util.stream.Collectors;

public class Sample8 {

	public static void main(String[] args) {
		List<Integer> list=List.of(10,20,30,40,90,10,30,50,60,40,10,30,40,90,10);
        List<Integer> uniqueList = list.stream().distinct().collect(Collectors.toList());
     System.out.println(list);
     System.out.println(uniqueList);
        
        uniqueList.forEach(System.out::println);
	}

}
