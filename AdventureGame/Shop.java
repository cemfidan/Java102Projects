public class Shop extends SafeLocation {

	public Shop(Player player) {
		super(player, "Shop", 2);
	}

	@Override
	boolean onLocation() {
		System.out.println("Location : Shop | Gun, armor and more.");
		System.out.println("\nWelcome to the Shop!");
		System.out.println("1 - Weapons\n2 - Armors\n3 - Exit");
		
		System.out.print("\nYour Choice: ");
		int selectStuff = scanner.nextInt();
		
		switch(selectStuff) {
		case 1:
			showWeapon();
			buyWeapon();
			break;
		case 2:
			showArmor();
			break;
		case 3:
			return true;
		default:
			showWeapon();
		}
		
		return true;
	}

	public void showWeapon() {
		for(Weapon weapon : Weapon.weapon()) {
			System.out.println(weapon.getId() + " - " + weapon.getName() + " | Damage: " + weapon.getDamage() + " | Amount: " + weapon.getAmount());
		}
	}
	
	public void buyWeapon() {
		System.out.print("\nYour Choice: ");
		int selectWeapon = scanner.nextInt();
		
		while(selectWeapon < 0 || Weapon.weapon().length < selectWeapon) {
			System.out.println("Invalid number, try again.");
			int input = scanner.nextInt();
		}
		
		Weapon selectedWeapon = Weapon.getWeaponById(selectWeapon);
		
		if(selectedWeapon != null) {
			if(selectedWeapon.getAmount() > this.getPlayer().getMoney()) {
				System.out.println("\nInsufficient balance!");
			} else {
				System.out.println("\n" + selectedWeapon.getName() + " was purchased!");
				int balance = this.getPlayer().getMoney() - selectedWeapon.getAmount();
				this.getPlayer().setMoney(balance);
				System.out.println("\nCurrent balance: " + this.getPlayer().getMoney());
				this.getPlayer().getInventory().setWeapon(selectedWeapon);
			}
		}
		
		switch(selectWeapon) {
		case 1:
			
		}
	}
	
	public void showArmor() {
		
	}
	
	
	
}
