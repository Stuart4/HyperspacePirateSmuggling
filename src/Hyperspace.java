
/**
 * Hyperspace Pirate Smuggling
 *
 * @author Jacob Stuart
 * @lab
 * @date September 09, 2014
 */
public class Hyperspace {

	public Hyperspace(String[] map) {

		for (int i = 0; i < map.length; i++) {
			map[i] = ((char)('0' + (map[i].charAt(0)) - 'A')) + map[i].substring(1);
			map[i] = map[i].substring(0, 2) + ((char)('0' + (map[i].charAt(2)) - 'A')) + map[i].substring(3);
		}

		System.out.println(map[1]);
	}
}

