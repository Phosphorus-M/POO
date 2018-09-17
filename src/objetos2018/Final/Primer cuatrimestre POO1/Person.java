import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Person {

	private String name;
	private Integer age;

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public Double getChildrenAverage(Collection<Person> persons, Integer fromAge, Integer toAge) {
		Integer cantidad = 0;


		for (Person unoEnUno: persons) {
			if (unoEnUno.getAge() > fromAge && unoEnUno.getAge() < toAge) cantidad++;
		}

		return (double) (persons.size()/cantidad); 
	}

	public Collection<Person> read(File source) throws IOException{
		Scanner sc = new Scanner(source);
		String[] lineas;
		Collection<Person> personas = new ArrayList<Person>();

		while(sc.hasNextLine()) {
			lineas = sc.nextLine().split(",");
			personas.add(new Person(lineas[0], Integer.parseInt(lineas[1])));
		}

		return personas;
	}


	public boolean equals(Object obj) {
		if (this == obj) return true;
		Person other = (Person) obj;
		if (this.age == other.age) return true;
		if (this.getName().equals(other.getName())) return true;
		return false;
	}

	public static <T> Integer count(T[][] values, T valueToCount) {
		Integer cont=0;

		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[i].length; j++) {
				if(values[i][j].equals(valueToCount)) cont++;
			}
		}

		return cont;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
