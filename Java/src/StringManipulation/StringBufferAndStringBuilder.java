package StringManipulation;

public class StringBufferAndStringBuilder {
	public static void main(String[] args) {
		// mutable
		StringBuffer sf = new StringBuffer("hello");
		System.out.println(sf);
		sf.append("hi");
		System.out.println(sf);
		// mutable
		StringBuilder sb = new StringBuilder("testing");
		System.out.println(sb);
		sb.append("hi");
		System.out.println(sb);
		
		//difference between SBuilder and sbuffer
	}
}
