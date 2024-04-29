package StringManipulation;

import java.util.Arrays;

public class StringManipulatioConcept {
	public static void main(String[] args) {
		String str = "this is my java code and i am so happy";
		int i = str.length();
		System.out.println(i);
		int hi = i - 1;
		int li = 0;
		System.out.println(hi - li);
		System.out.println(str.charAt(0));
		System.out.println(str.indexOf('i'));
		System.out.println(str.indexOf('i', str.indexOf('i') + 1));
		int i1 = str.indexOf('i', str.indexOf('i') + 1);
		System.out.println(str.indexOf('i', i1 + 1));
		System.out.println(str.indexOf("java"));
		String st = "                this is my first java program                    ";
		System.out.println(st.toUpperCase());
		System.out.println(st.trim());
		String dob = "01-01-1990";
		System.out.println(dob.replace("-", "/"));
		String con = "wajidkhanelectrical engineer";
		boolean a = con.contains("electrical");
		System.out.println(a);
		System.out.println("------------------------");
		String lang = "java_python_javascript_ruby";
		String[] lang1 = lang.split("_");
		System.out.println(Arrays.toString(lang1));
		for (String e : lang1) {
			System.out.println(e);
		}
	}
}