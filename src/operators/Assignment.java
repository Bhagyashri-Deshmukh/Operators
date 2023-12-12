package operators;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 7;
	    System.out.println("value += 3: " + (value += 3));
	    System.out.println("value -= 2: " + (value -= 2));
	    System.out.println("value *= 4: " + (value *= 4));
	    System.out.println("value /= 3: " + (value /= 3));
	    System.out.println("value %= 2: " + (value %= 2));
	    System.out.println("value &= 0b1010: " + (value &= 0b1010));
	    System.out.println("value |= 0b1100: " + (value |= 0b1100));
	    System.out.println("value ^= 0b1010: " + (value ^= 0b1010));
	    System.out.println("value <<= 2: " + (value <<= 2));
	    System.out.println("value >>= 1: " + (value >>= 1));
	    System.out.println("value >>>= 1: " + (value >>>= 1));
	}

}
