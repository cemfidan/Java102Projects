import java.util.Scanner;

public class Player {

	private String name;
	private String charName;
	private int damage;
	private int health;
	private int money;
	private Inventory inventory;
	
	private Scanner scanner = new Scanner(System.in);
	
	public Player(String name) {
		this.name = name;
		this.inventory = new Inventory();
	}
	
	public void selectChar() {
		System.out.println("\nPlease select character:");
		
		GameChar[] charList = {new Samurai(), new Archer(), new Knight()};
	
		for(GameChar gChar : charList) {
			System.out.println(gChar.getId() + " - Name: " + gChar.getName() + " | Damage: " + gChar.getDamage() + " | Health: " + gChar.getHealth() + " | Money: " + gChar.getMoney());
		}
	
		System.out.print("\nYour Choice: ");
		int selectChar = scanner.nextInt();
		
		switch(selectChar) {
		
		case 1:
			initPlayer(new Samurai());
			break;
		case 2:
			initPlayer(new Archer());
			break;
		case 3:
			initPlayer(new Knight());
			break;
		default:
			initPlayer(new Knight());
		}
		
		System.out.println("\n" + this.getCharName()  + " is ready!");
		System.out.println("\n************************************");
	}
	
	public void initPlayer(GameChar gameChar) {
		this.setCharName(gameChar.getName());
		this.setDamage(gameChar.getDamage());
		this.setHealth(gameChar.getHealth());
		this.setMoney(gameChar.getMoney());
	}
	
	public void selectLoc() {
		
		Location location = null;
		
		Location[] locList = {new SafeHouse(this), new Shop(this)};
		
		System.out.println("\nPlease select Location:");
	
		for(Location loc : locList) {
			System.out.println(loc.getId() + " - Location: " + loc.getName());
		}

		System.out.print("\nYour Choice: ");
		int selectLoc = scanner.nextInt();
		
		switch(selectLoc) {
		
		case 1:
			location = new SafeHouse(this);
			break;
		case 2:
			location = new Shop(this);
			break;
		default:
			location = new SafeHouse(this);
		}
		
		System.out.println();
		location.onLocation();
		System.out.println("\n************************************");
	}
	
	public void showPlayer() {
		System.out.println("Weapon: " + this.getInventory().getWeapon().getName() + " | Damage: " + this.getDamage() + " | Health: " + this.getHealth() + " | Money: " + this.getMoney());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCharName() {
		return charName;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}

	public int getDamage() {
		return damage + this.getInventory().getWeapon().getDamage();
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
}
