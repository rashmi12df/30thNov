package lect;

public class StringBuffernBuilder {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Rashmi");
		System.out.println(sb.length());
		
		System.out.println(sb.append(" salunke"));
		System.out.println(sb.reverse());
		
		String s="I am automation tester";
		StringBuilder sb1=new StringBuilder(s);
		System.out.println(sb1.reverse());
		
		
	}
}
