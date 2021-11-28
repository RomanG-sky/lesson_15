package lesson_15;

import java.util.Scanner;

public class main {

	static void menu() {
		System.out.println();
		System.out.println("1 додаванн€ нового учасника ZooClub");
		System.out.println("2 додаванн€ нового улюбленц€ учаснику ZooClub");
		System.out.println("3 видалене€ улюбленц€ учаснику ZooClub");
		System.out.println("4 видалене€ учасника ≥з ZooClub");
		System.out.println("5 видалене€ улюбленц€ у вс≥х учасник≥в ZooClub");
		System.out.println("6 виведенн€ ус≥х часник≥в ZooClub");
		System.out.println("0 дл€ виходу");
	}

	public static void main(String[] args) {
		ZooClub zooClub = new ZooClub();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			menu();

			switch (scanner.nextInt()) {

			case 1: {
				zooClub.addClient();
				break;
			}

			case 2: {
				zooClub.addPet();
				break;
			}

			case 3: {
				zooClub.remPet();
				break;
			}

			case 4: {
				zooClub.remClient();
				break;
			}

			case 5: {
				zooClub.remPetfromAllClients();
				break;
			}

			case 6: {
				zooClub.AllClients();
				break;
			}

			case 0: {
				System.exit(0);
				break;
			}

			default: {
				System.out.println("ѕовтор≥ть вв≥д");
				break;
			}
			}
		}

	}

}
