package lesson_15;

import java.util.Scanner;

public class main {

	static void menu() {
		System.out.println();
		System.out.println("1 ��������� ������ �������� ZooClub");
		System.out.println("2 ��������� ������ ��������� �������� ZooClub");
		System.out.println("3 ��������� ��������� �������� ZooClub");
		System.out.println("4 ��������� �������� �� ZooClub");
		System.out.println("5 ��������� ��������� � ��� �������� ZooClub");
		System.out.println("6 ��������� ��� ������� ZooClub");
		System.out.println("0 ��� ������");
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
				System.out.println("�������� ���");
				break;
			}
			}
		}

	}

}
