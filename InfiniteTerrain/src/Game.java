import java.util.Random;
import java.util.Scanner;

public class Game {

	static Game game = new Game();
	Player player = new Player("", 10, 5, 0, 0);
	Treasure Treasure = new Treasure(0, 0);
	Distance distance = new Distance(0, 0);

	public int xDistance;
	public int yDistance;
	public double totalDistance;

	public static void main(String[] args) {
		game.gameSetup();
		game.start();
	}

	public void gameSetup() {

		Random treasure = new Random();
		int treasurePosX = treasure.nextInt(10);

		Treasure.setXPoisition(treasurePosX);

		Random treasure2 = new Random();
		int treasurePosY = treasure2.nextInt(10);

		Treasure.setYPoisition(treasurePosY);

		System.out.println("Enter your name: ");

		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();

		player.setName(name);

		Random positionX = new Random();
		int answer = positionX.nextInt(10);

		player.setXPoisition(answer);

		Random positionY = new Random();
		int answer2 = positionY.nextInt(10);

		player.setYPoisition(answer2);

		System.out.println("Your name is: " + name);
		System.out.println("Your health is: " + player.getHealth() + "/10");
		System.out.println("Your Strength is: " + player.getStrength() + "\n");
		System.out.println("Your position is: " + player.getXPosition() + "," + player.getYPosition());
	}

	public void start() {

		System.out.println("Darkness. Your eyes, slowly opening, allows a flood of light to blind you momentarily"
				+ "\nWhile your eyes adjust to the bright glare of the blazing sun, you notice a figure moving towards you"
				+ "\nit's movement is unorthodox, swaying left and right almost dragging itself, as if it's only goal is to get to you...");
		System.out.println("...you feel your senses rejoin you as the figure is only a few steps away, you see its face"
				+ "\nand jump backwards, crashing into the ground, you see an old dagger laying on the floor" + "\n"
				+ "\ndo you pick it up?\nY or N?");

		Scanner scan1 = new Scanner(System.in);
		String choice = scan1.nextLine();

		switch (choice) {
		case "Y":
			System.out.println("You pick up the dagger\n");
			player.setStrength(player.getStrength() + 5);
			System.out.println("Your strength is now " + player.getStrength());
			break;
		case "N":
			System.out.println("You did not pick up the dagger\n");
			break;
		default:
			System.out.println("That is not a valid input, only enter 'Yes' or 'No'");
		}

		System.out.println("You must attack the zombie, choose an attack type: ");
		if (player.getStrength() > 5) {
			System.out.println("(1)STAB\n(2)SLASH");
			Scanner scan2 = new Scanner(System.in);
			String attack = scan2.nextLine();

			switch (attack) {
			case "1":
				System.out.println(
						"You stab the Zombie\nIt is not effective\nZombie attacks you\nYou lose 2 health and run away\n");
				player.setHealth(player.getHealth() - 2);
				break;
			case "2":
				System.out.println(
						"You slash the zombie in the face, it falls to the ground...\nThe Undead is now Dead (again)\n");
				break;
			default:
				System.out.println("That is not a valid input, only enter '1' or '2'");
			}
		} else {
			System.out.println("(1)PUNCH\n(2)KICK");
			Scanner scan2 = new Scanner(System.in);
			String attack = scan2.nextLine();

			switch (attack) {
			case "1":
				System.out.println(
						"You punch the Zombie\nIt is not effective\nZombie attacks you\nYou lose 2 health and run away\n");
				player.setHealth(player.getHealth() - 2);
				break;
			case "2":
				System.out.println(
						"You kick the zombie in the face, it falls to the ground...\nThe Undead is now Dead (again)\n");
				break;
			default:
				System.out.println("That is not a valid input, only enter '1' or '2'\n");
			}
		}

		System.out.println(
				"You reach into your pocket and find a note\nThe note reads:\n'Find the treasure...\n...use the Magic Compass!");
		System.out.println(
				"You realise you've been wearing a necklace\nYou look at the necklace and realise it is the Magic Compass!\nYou give it a shake and it begins to glow"
						+ "\nThe following letters appear:\nN(orth)\nE(ast)\nS(outh)\nW(est) ");
		System.out.println("You decide to follow a direction\n");
		System.out.println("Your current position is: " + player.getXPosition() + "," + player.getYPosition());
		magicCompass();

	}

	public void magicCompass() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter which direction you would like to go: N, E, S, W: ");
			Scanner scan3 = new Scanner(System.in);
			String direction = scan3.nextLine();

			switch (direction) {
			case "N":
				System.out.println("You head North");
				player.setXPoisition(player.getXPosition() + 1);
				System.out.println("Your current position is: " + player.getXPosition() + "," + player.getYPosition());
				distance();
				System.out.println("You are " + totalDistance + "m away from the treasure");
				if (player.getXPosition() == Treasure.getXPosition()
						& player.getYPosition() == Treasure.getYPosition()) {
					System.out.println("YOU FOUND THE TREASURE!!! YOU WIN THE GAME!!!");
				} else {
					magicCompass();
				}
				break;

			case "E":
				System.out.println("You head East");
				player.setYPoisition(player.getYPosition() + 1);
				System.out.println("Your current position is: " + player.getXPosition() + "," + player.getYPosition());
				distance();
				System.out.println("You are " + totalDistance + "m away from the treasure");
				if (player.getXPosition() == Treasure.getXPosition()
						& player.getYPosition() == Treasure.getYPosition()) {
					System.out.println("YOU FOUND THE TREASURE!!! YOU WIN THE GAME!!!");
				} else {
					magicCompass();
				}
				break;
			case "S":
				System.out.println("You head South");
				player.setXPoisition(player.getXPosition() - 1);
				System.out.println("Your current position is: " + player.getXPosition() + "," + player.getYPosition());
				distance();
				System.out.println("You are " + totalDistance + "m away from the treasure");
				if (player.getXPosition() == Treasure.getXPosition()
						& player.getYPosition() == Treasure.getYPosition()) {
					System.out.println("YOU FOUND THE TREASURE!!! YOU WIN THE GAME!!!");
				} else {
					magicCompass();
				}
				break;
			case "W":
				System.out.println("You head West");
				player.setYPoisition(player.getYPosition() - 1);
				System.out.println("Your current position is: " + player.getXPosition() + "," + player.getYPosition());
				distance();
				System.out.println("You are " + totalDistance + "m away from the treasure");
				if (player.getXPosition() == Treasure.getXPosition()
						& player.getYPosition() == Treasure.getYPosition()) {
					System.out.println("YOU FOUND THE TREASURE!!! YOU WIN THE GAME!!!");
				} else {
					magicCompass();
				}
				break;
			default:
				System.out.println("Invalid input, only enter: N, E, S, W\n");
				magicCompass();
			}
		}
	}

	public void distance() {
		xDistance = player.getXPosition() - Treasure.getXPosition();
		yDistance = player.getYPosition() - Treasure.getYPosition();

		totalDistance = Math.sqrt((xDistance * xDistance) + (yDistance * yDistance));

	}
}
