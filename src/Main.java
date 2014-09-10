/**
 * Hyperspace Pirate Smuggling
 *
 * @author Jacob Stuart
 * @lab
 * @date September 09, 2014
 */
public class Main {

	public static void main(String[] args) {
		String[] map = strToArray(
			"A B 1\n" +
			"A C 1\n" +
			"B C 2\n" +
			"B D 2\n" +
			"C D 1\n" +
			"C E 2\n" +
			"D E 2\n" +
			"D F 2\n" +
			"D G 1\n" +
			"E G 1\n" +
			"E H 1\n" +
			"F I 4\n" +
			"F G 3\n" +
			"G J 2\n" +
			"G H 3\n" +
			"H K 3\n" +
			"I J 2\n" +
			"I K 2"
		);
		Hyperspace hs = new Hyperspace(map);
	}

	public static String[] strToArray(String input) {
		String[] out = input.split("\n");

		return out;
	}
}
