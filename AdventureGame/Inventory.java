public class Inventory {

	private Weapon weapon;
	
	public Inventory() {
		this.weapon = new Weapon("Go little rockstar!", 0, 0, 0);
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
}
