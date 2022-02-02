package p4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setAge(25);
		e1.setName("Shad");
		e1.setSalary(1234);

		Employee e2 = new Employee();
		e2.setAge(21);
		e2.setName("Tushar");
		e2.setSalary(3421);

		Employee e3 = new Employee();
		e3.setAge(30);
		e3.setName("Lala");
		e3.setSalary(5432);

		List<Employee> emps = new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);

		// Internal Iterator
		Iterator<Employee> it = emps.iterator();

		while (it.hasNext()) {
			Employee e = it.next();

			System.out.println(e);
		}
		// External Iterator
		emps.forEach(e -> System.out.println(e));

		System.out.println(
				"Filtering the list according to age nd store in a new List using Declrative way of programming");

		List<String> newList = new ArrayList<>();
		// using enhance for loop
		for (Employee e : emps) {

			if (e.getAge() > 21) {
				newList.add(e.getName());
			}

		}

		System.out.println(newList);

		System.out.println(
				"Filtering the list according to age nd store in a new List using Functionl style of programming");

		List<String> newList8 = emps.stream().filter(e -> e.getAge() > 21).map(e -> e.getName())
				.collect(Collectors.toList());

		System.out.println(newList8);

//		System.out.println("==========================================");
//
//		emps.forEach(e -> System.out.println(e));
//
//		System.out.println("==========================================");
//
//		System.out.println(emps);

	}

}
