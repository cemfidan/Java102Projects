public class SafeHouse extends SafeLocation {

	public SafeHouse(Player player) {
		super(player, "Safe House", 1);
	}

	@Override
	boolean onLocation() {
		System.out.println("Location : Safe House | Health is renewed.");
		return true;
	}

}
