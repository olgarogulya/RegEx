import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		
		//Дана строка 'ahb acb aeb aeeb adcb axeb'. Напишите регулярку, которая найдет строки ahb, acb, aeb по шаблону: буква 'a', любой символ, буква 'b'. 
		String s1 = "ahb acb aeb aeeb adcb axeb";
		String p1 = "a.b";
		//findPattern(s1, p1);
		
		//Дана строка 'aba aca aea abba adca abea'. Напишите регулярку, которая найдет строки abba adca abea по шаблону: буква 'a', 2 любых символа, буква 'a'. 
		String s2 = "aba aca aea abba adca abea";
		String p2 = "a.{2}a";
		//findPattern(s2, p2);
		
		//Дана строка 'aba aca aea abba adca abea'. Напишите регулярку, которая найдет строки abba и abea, не захватив adca.  
		String p3 = "ab.a";
		//findPattern(s2, p3);
		
		//Дана строка 'aa aba abba abbba abca abea'. Напишите регулярку, которая найдет строки aba, abba, abbba по шаблону: буква 'a', буква 'b' любое количество раз, буква 'a'.
		String s4 = "aa aba abba abbba abca abea";
		String p4 = "ab+a";
		//findPattern(s4, p4);
		
		//Дана строка 'aa aba abba abbba abca abea'. Напишите регулярку, которая найдет строки aa, aba, abba, abbba по шаблону: буква 'a', буква 'b' любое количество раз (в том числе ниодного раза), буква 'a'.
		String p5 = "ab*a";
		//findPattern(s4, p5);

	}

	
	public static void findPattern(String s, String p) {
		 Pattern pattern = Pattern.compile(p);
	        Matcher matcher = pattern.matcher(s);
	        String m = "";
			
	        while(matcher.find()) {
	        	m = matcher.group();
	        	print(m);
	        }
	}
	
	public static void print(String a) {
		System.out.println("Found " + a);
	}
}
