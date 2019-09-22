import java.util.Arrays;

public class ArrayTraining {

	/**
	 * @param n size of the array, eg: 3
	 * @return an empty int array of size n, eg: {0, 0, 0}
	 */
	public int[] emptyIntArray(int n) {
		int[] tab = new int[n];
		return tab;
	}

	/**
	 * @param n size of the array, eg: 2
	 * @return an empty String array of size n, eg: {null, null}
	 */
	public String[] emptyStringArray(int n) {
		String[] tab = new String[n];
		return tab;
	}

	/**
	 * @param a first value, eg: 3
	 * @param b second value, eg: 2
	 * @param c third value, eg: 1
	 * @return an int array with a, b and c values, eg: {3, 2, 1}
	 */
	public int[] intArray(int a, int b, int c) {
		int[] tab = { a, b, c };
		return tab;
	}

	/**
	 * @param a first value, eg: "test"
	 * @param b second value, eg: "sample"
	 * @param c third value, eg: "value"
	 * @return an int array with a, b and c values, eg: {"test", sample", "value"}
	 */
	public String[] stringArray(String a, String b, String c) {
		String[] tab = { a, b, c };
		return tab;
	}

	/**
	 * @param array, eg: {1, 2, 3}
	 * @return length of the array, eg: 1
	 */
	public int length(int[] array) {
		int arrayLength = array.length;

		return arrayLength;
	}

	/**
	 * @param array, eg: {3, 2, 1}
	 * @return first value of the array, eg: 3
	 */
	public int firstValue(int[] array) {
		int firstValue = array[0];
		return firstValue;
	}

	/**
	 * @param array, eg: {3, 2, 1}
	 * @return last value of the array, eg: 1
	 */
	public int lastValue(int[] array) {
		int lastValue = array[array.length - 1];
		return lastValue;
	}

	/**
	 * @param array,    eg: {3, 2, 1}
	 * @param position, eg: 1
	 * @return value of the array at position, eg: 2
	 */
	public int valueAtPosition(int[] array, int position) {
		int valueAtPosition = array[position];
		return valueAtPosition;
	}

	/**
	 * @param array,    eg: {3, 8, 5}
	 * @param value,    eg: 4
	 * @param position, eg: 1
	 * @return the array with the value replaced at position, eg: {3, 4, 5}
	 */
	public int[] replace(int[] array, int value, int position) {
		array[position] = value;
		return array;
	}

	/**
	 * @param array, eg: {1, 2, 3}
	 * @return sum of values of the array, eg: 6
	 */
	public int sum(int[] array) {
		int sum = Arrays.stream(array).sum();
		return sum;
	}

	/**
	 * @param array,  eg: {1, 2, 3}
	 * @param search, eg: 2
	 * @return if array contains searched value, eg: true
	 */
	public boolean contains(int[] array, int search) {
		boolean result = false;
		for (int i : array) {
			if (i == search) {
				result = true;
			}
		}
		return result;
	}

	/**
	 * @param array, eg: {"sample", "value"}
	 * @return array where all words are capitalized, eg: {"Sample", "Value"}
	 */
	public String[] capitalize(String[] array) {
//		String[] array2 = { "sample", "value" };
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i].substring(0, 1).toUpperCase() + array[i].substring(1).toLowerCase();
//			StringUtils.capitalize(array[i]);
			System.out.println("" + array[i]);
		}
		return array;
	}

	/**
	 * @param first,  eg: {1, 2, 3}
	 * @param second, eg: {3, 2, 1}
	 * @return if values in first and second arrays, in the same position, are
	 *         equals, eg: false
	 */
	public boolean equals(int[] first, int[] second) {
		boolean result = false;
		for (int j = 0; j < first.length; j++) {
			if (first[j] == second[j]) {
				result = true;
			}
		}
		return result;
	}

	/**
	 * @param array, eg: {1, 2, 3}
	 * @return array with reversed values, eg: {3, 2, 1}
	 */
	public int[] reverse(int[] array) {
		int[] reverse = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			reverse[i] = array[array.length - i - 1];
//			System.out.println(reverse[i]);
		}
//		Collections.reverse(Arrays.asList(array));
		return reverse;
	}

	/**
	 * @param first,  eg: {1, 2, 3}
	 * @param second, eg: {4, 5}
	 * @return concatenates first and second values in one array, eg: {1, 2, 3, 4,
	 *         5}
	 */
	public int[] concat(int[] first, int[] second) {
		int[] result = new int[first.length + second.length];
		System.arraycopy(first, 0, result, 0, first.length);
		System.arraycopy(second, 0, result, first.length, second.length);
		return result;
	}
}
