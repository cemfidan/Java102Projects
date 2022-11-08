public abstract class SafeLocation extends Location {

	public SafeLocation(Player player, String name, int id) {
		super(player, name, id);
	}

	@Override
	boolean onLocation() {
		return true;
	}

}
