package lesson_15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ZooClub {

	public static void main(String[] args) {

	}

	Map<Person, ArrayList<Animal>> ZooClub = new HashMap<Person, ArrayList<Animal>>();

	public void addClient() {
		System.out.println("¬вед≥ть ≥м'€ учасника клубу:");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("¬вед≥ть в≥к учасника клубу:");
		Scanner sc1 = new Scanner(System.in);
		int age = sc1.nextInt();
		Person ZooClubClient = new Person(name, age);
		ZooClub.put(ZooClubClient, new ArrayList<Animal>());
		System.out.println("Ќовий кл≥Їнт " + ZooClubClient.toString() + "доданий у ZooClub.");
	}

	public void addPet() {
		System.out.println("¬вед≥ть ≥м'€ учасника клубу:");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("¬вед≥ть в≥к учасника клубу:");
		Scanner sc1 = new Scanner(System.in);
		int age = sc1.nextInt();
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = ZooClub.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> next = iterator.next();
			if (next.getKey().getName().equalsIgnoreCase(name) && next.getKey().getAge() == age) {
				System.out.println("¬вед≥ть ≥м'€ улюбленц€:");
				Scanner sc2 = new Scanner(System.in);
				String Petname = sc2.next();
				System.out.println("ќбер≥ть тип улюбленц€:");
				Scanner scan = new Scanner(System.in);

				System.out.println("Ќатисн≥ть 1 щоб обрати : " + AnimalType.cat);
				System.out.println("Ќатисн≥ть 2 щоб обрати : " + AnimalType.dog);
				switch (scan.next())

				{
				case "1": {
					Animal newPet = new Animal(Petname, AnimalType.cat);
					ArrayList<Animal> animal = next.getValue();
					animal.add(newPet);
					System.out.println(
							"ƒл€ учасника " + name + age + " дадалась тварина " + Petname.toString() + AnimalType.cat);
					break;
				}

				case "2": {
					Animal newPet = new Animal(Petname, AnimalType.dog);
					ArrayList<Animal> animal = next.getValue();
					animal.add(newPet);
					System.out.println(
							"ƒл€ учасника" + name + age + "дадалась тварина " + Petname.toString() + AnimalType.dog);
					break;
				}
				}

			} else {
				System.out.println("¬ведений вами учасник у клуб≥ не зареЇстрований.");
			}

		}
	}

	public void remPet() {
		System.out.println("¬вед≥ть ≥м'€ учасника клубу:");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("¬вед≥ть в≥к учасника клубу:");
		Scanner sc1 = new Scanner(System.in);
		int age = sc1.nextInt();
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = ZooClub.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> next = iterator.next();
			if (next.getKey().getName().equalsIgnoreCase(name) && next.getKey().getAge() == age) {
				System.out.println("¬вед≥ть ≥м'€ улюбленц€:");
				Scanner sc2 = new Scanner(System.in);
				String Petname = sc2.next();
				System.out.println("ќбер≥ть тип улюбленц€:");
				Scanner scan = new Scanner(System.in);
				System.out.println("Ќатисн≥ть 1 щоб обрати : " + AnimalType.cat);
				System.out.println("Ќатисн≥ть 2 щоб обрати : " + AnimalType.dog);
				switch (scan.next()) {
				case "1": {
					Animal newPet = new Animal(Petname, AnimalType.cat);
					ArrayList<Animal> animal = next.getValue();
					Iterator<Animal> iterator2 = animal.iterator();
					while (iterator2.hasNext()) {
						Animal next2 = iterator2.next();
						if (next2.getName().equalsIgnoreCase(Petname) && next2.getTypeOFpet().equals(AnimalType.cat)) {
							iterator2.remove();
							System.out.println("ƒл€ учасника" + name + age + "видалилась тварина" + Petname.toString()
									+ AnimalType.cat);
						} else {
							System.out.println(
									"¬ведений вами тварина в учасника клубу" + name + age + "не зареЇстрована.");
						}
					}
					break;
				}

				case "2": {
					Animal newPet = new Animal(Petname, AnimalType.dog);
					ArrayList<Animal> animal = next.getValue();
					Iterator<Animal> iterator2 = animal.iterator();
					while (iterator2.hasNext()) {
						Animal next2 = iterator2.next();
						if (next2.getName().equalsIgnoreCase(Petname) && next2.getTypeOFpet().equals(AnimalType.dog)) {
							iterator2.remove();
							System.out.println("ƒл€ учасника" + name + age + "видалилась тварина" + Petname.toString()
									+ AnimalType.dog);
						}
					}

				}

				}
				break;
			} else {
				System.out.println("¬ведений вами учасник у клуб≥ не зареЇстрований!.");
			}
		}
	}

	public void remClient() {
		System.out.println("¬вед≥ть ≥м'€ учасника клубу:");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("¬вед≥ть в≥к учасника клубу:");
		Scanner sc1 = new Scanner(System.in);
		int age = sc1.nextInt();
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = ZooClub.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> next = iterator.next();
			if (next.getKey().getName().equalsIgnoreCase(name) && next.getKey().getAge() == age) {
				iterator.remove();
				System.out.println("”часник  " + name + age + "видалений ≥з клубу");
			}
			if (!next.getKey().getName().equalsIgnoreCase(name) & next.getKey().getAge() != age) {
				System.out.println("¬ведений вами учасник у клуб≥ не зареЇстрований.");
			}
		}
	}

	public void remPetfromAllClients() {
		System.out.println("¬вед≥ть ≥м'€ улюбленц€:");
		Scanner sc = new Scanner(System.in);
		String Petname = sc.next();
		System.out.println("ќбер≥ть тип улюбленц€:");
		Scanner scan = new Scanner(System.in);

		System.out.println("Ќатисн≥ть 1 щоб обрати : " + AnimalType.cat);
		System.out.println("Ќатисн≥ть 2 щоб обрати : " + AnimalType.dog);
		switch (scan.next())

		{
		case "1": {
			Iterator<Entry<Person, ArrayList<Animal>>> iterator = ZooClub.entrySet().iterator();
			while (iterator.hasNext()) {
				Entry<Person, ArrayList<Animal>> next = iterator.next();
				ArrayList<Animal> animal = next.getValue();
				Iterator<Animal> iterator2 = animal.iterator();
				while (iterator2.hasNext()) {
					Animal next2 = iterator2.next();
					if (next2.getName().equalsIgnoreCase(Petname) && next2.getTypeOFpet() == AnimalType.cat) {
						iterator2.remove();
						System.out.println("ƒл€ ус≥х учасник≥в видалилась тварина" + Petname + AnimalType.cat);
					} else {
						System.out.println(
								"¬ведений вами тварина в учасника клубу" + Petname + AnimalType.cat + "не знайдена.");
					}
					break;
				}
			}

		}
		case "2": {
			Iterator<Entry<Person, ArrayList<Animal>>> iterator = ZooClub.entrySet().iterator();
			while (iterator.hasNext()) {
				Entry<Person, ArrayList<Animal>> next = iterator.next();
				ArrayList<Animal> animal = next.getValue();
				Iterator<Animal> iterator2 = animal.iterator();
				while (iterator2.hasNext()) {
					Animal next2 = iterator2.next();
					if (next2.getName().equalsIgnoreCase(Petname) && next2.getTypeOFpet() == AnimalType.dog) {
						iterator2.remove();
						System.out.println("ƒл€ ус≥х учасник≥в видалилась тварина" + Petname + AnimalType.dog);
					}

					else {
						System.out.println(
								"¬ведений вами тварина в учасника клубу" + Petname + AnimalType.dog + "не знайдена.");
					}
					break;
				}
			}
		}
		}
	}

	public void AllClients() {
		Set<Entry<Person, ArrayList<Animal>>> entrySet = ZooClub.entrySet();
		for (Entry<Person, ArrayList<Animal>> entry : entrySet) {
			System.out.println("¬ клуб≥ присутн≥ наступн≥ учасники:" + entry.getKey() + entry.getValue());
		}

	}
}
