package org.emp;

public class Employee {
public static void main(String[] args) {
	  String s = "     java Class    ";
int l = s.length();
System.out.println(l);
int i = s.indexOf('a');
System.out.println(i);
int li = s.lastIndexOf('a');
System.out.println(li);
char charAt = s.charAt(2);
System.out.println(charAt);

String replace = s.replace('a', 'b');
System.out.println(replace);
String reall = s.replaceAll("java", "sel");
System.out.println(reall);
String su = s.substring(0,7);
System.out.println(su);
boolean st = s.startsWith("cj");
System.out.println(st);
boolean endsWith = s.endsWith("ss");
System.out.println(endsWith);
String sub = s.substring(8);
System.out.println(sub);
String co = s.concat("as");
System.out.println(co);
boolean em = s.isEmpty();
System.out.println(em);
boolean eq = s.equals("java class");
System.out.println(eq);
boolean ei = s.equalsIgnoreCase("java class");
System.out.println(ei);
String trim = s.trim();
System.out.println(trim);


}
}
