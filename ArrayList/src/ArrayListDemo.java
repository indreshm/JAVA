import java.util.ArrayList;

import java.time.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());


		
		
		
		ArrayList<String> cars=new ArrayList<>(); // create an arrayList object
		
		//add 
		cars.add("tata");
		cars.add("mahindra");
		cars.add("force");
		
		System.out.println(cars);
		
		//acces an item
		System.out.println((cars.get(1)));
		
		//cahnge an item
		String a=cars.set(1,"ola");
		System.out.println(a+"   "+cars);
		
		//remove an item
		cars.remove(0);
		System.out.println(cars);
		
		//remove all item
		cars.clear();
		System.out.println(cars);
		
		System.out.println(cars.size());
		
		

	}

}
