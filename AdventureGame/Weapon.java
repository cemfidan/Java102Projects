public class Weapon {

	private String name;
	private int id;
	private int damage;
	private int amount;
	
	public Weapon(String name, int id, int damage, int amount) {
		this.name = name;
		this.id = id;
		this.damage = damage;
		this.amount = amount;
	}
	
	public static Weapon[] weapon() {
		Weapon[] weaponList = new Weapon[3];
		weaponList[0] = new Weapon("Handgun", 1, 2, 25);
		weaponList[1] = new Weapon("Sword", 2, 3, 35);
		weaponList[2] = new Weapon("Rifle", 3, 7, 45);
		return weaponList;
	}
	
	public static Weapon getWeaponById(int id) {
		for(Weapon weapon : Weapon.weapon()) {
			if(weapon.getId() == id) {
				return weapon;
			}
		}
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
