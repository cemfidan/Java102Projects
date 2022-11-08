public class Armor {
	private String name;
	private int id;
	private int damage;
	private int amount;
	
	public Armor(String name, int id, int damage, int amount) {
		this.name = name;
		this.id = id;
		this.damage = damage;
		this.amount = amount;
	}
	
	public static Armor[] armor() {
		Armor[] armorList = new Armor[3];
		armorList[0] = new Armor("Leather", 1, 2, 25);
		armorList[1] = new Armor("Iron", 2, 3, 35);
		armorList[2] = new Armor("Diamond", 3, 7, 45);
		return armorList;
	}
	
	public static Armor getArmorById(int id) {
		for(Armor armor : Armor.armor()) {
			if(armor.getId() == id) {
				return armor;
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
