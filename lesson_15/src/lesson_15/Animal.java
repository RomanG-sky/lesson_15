package lesson_15;

import java.util.Objects;

public class Animal implements Comparable<Animal> {
private String name;
AnimalType typeOFpet;

public Animal(String name, AnimalType typeOFpet) {
	super();
	this.name = name;
	this.typeOFpet = typeOFpet;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public AnimalType getTypeOFpet() {
	return typeOFpet;
}

public void setTypeOFpet(AnimalType typeOFpet) {
	this.typeOFpet = typeOFpet;
}

@Override
public String toString() {
	return "Animal [name=" + name + ", typeOFpet=" + typeOFpet + "]";
}

@Override
public int hashCode() {
	return Objects.hash(name, typeOFpet);
}



@Override
public int compareTo(Animal o) {
	return 0;
}



}
