package ogp.game;

import java.util.ArrayList;

public class Bag {
	

	/**
	 * @representationObject
	 * ship null means not collected
	 */
	private Spaceship ship;
	/**
	 * @representationObject
	 */
	private ArrayList<Gem> gems;
	
	public Spaceship getShip() {
		return null;
	}
	
	public ArrayList<Gem> getGems() {
		return null;
	}
	
	public Bag(Spaceship ship, ArrayList<Gem> gems) {
		ship = null;
		gems = null;
	}
	
	
	/**
	 * @pre | u != null
	 * If possible, upgrade the ship with u and remove a corresponding gem.
	 */
	public void tryUpgradeShip(Upgrade u) {

	}
	

	public void setShip(Spaceship ship) {
		ship = null;
		
	}
	
	/**
	 * post: getGems has g as an extra element
	 */
	public void addGem(Gem g) {

	}
	
	public Bag copy() {
		return null;
	}
	
	/**
	 * LEGIT
	 */
	public String stringContents() {
		String res = "SHIP:0   ";
		if (ship != null) {
			res = "SHIP:1" + " ( " + ship.contents() + ")    ";
		}

    	int[] upgradeNumbers = Upgrade.giveUpgradesFrom(gems);
    	for (Upgrade u : Upgrade.values() ) {
    		res = res + u.toSmallString() + ": " + upgradeNumbers[u.idx()] + "  "; 
    	}
    	return res;
	}
	
	/**
	 * Attempts to upgrade the ship from the list of gems.
	 * Has some effect if
	 * - ship != null
	 * - ship is missing some upgrades
	 * - some of these missing upgrades appear in the list of gems (see Upgrade.giveUpgradeFrom)
	 * In that case some gems are deleted and serve to upgrade the ship. 
	 */
	public void update() {
		
	}
	
	
	
	

}
