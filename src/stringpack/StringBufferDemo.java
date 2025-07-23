package stringpack;

public class StringBufferDemo {

	public static void main(String[] args) {

		String s = "royal";
		StringBuffer sb1 = new StringBuffer(s);

		StringBuffer sb = new StringBuffer("royal");

		System.out.println(sb.length());
		System.out.println(sb.capacity());// +16

		sb.append("ahmedabad");// royal

		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);

		String rev = sb.toString();

		// synchronized -> turn by turn

		StringBuilder sb11 = new StringBuilder("same as buffer");
		// non sync

	}
}
