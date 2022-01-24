
public class String_0711 {

	public static void main(String[] args) {
		String s= "Welcome to Java";
		String s1 = "a";
		
		 String trim = s.trim();
	     System.out.println(trim);
	     
				int length = s.length();
     System.out.println(length);
     
     boolean equals = s.equals(s1);
     System.out.println(equals);
     
     boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
     System.out.println(equalsIgnoreCase);
     
     String upperCase = s.toUpperCase();
     System.out.println(upperCase);
     
     String Lowercase = s.toLowerCase();
     System.out.println(Lowercase);
     
     boolean startsWith = s.startsWith("Java");
     System.out.println(startsWith);
     
     boolean endWith = s.endsWith("va");
     System.out.println(endWith);
     
     boolean contains = s.contains("e t");
     System.out.println(contains);
     
     int indexOf = s.indexOf("J");
     System.out.println(indexOf);
     
     int lastIndexOf = s.lastIndexOf(1);
     System.out.println(lastIndexOf);
     
     char charAt = s.charAt(11);
     System.out.println(charAt);
     
     String replace = s.replace("Java", "Python");
     System.out.println(replace);
     System.out.println(s);
     
     String substring = s.substring(1, 7);
     System.out.println(substring);
     
     boolean e = s1.isEmpty();
     System.out.println(e);
     
          
     int compareTo = s.compareTo(s1);
     System.out.println(compareTo);
     
     String[] split = s.split("\\s");
     for (String string : split) {
    	 System.out.println(string);
     }
     
	}

}
