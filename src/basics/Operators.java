package basics;

public class Operators {

	public static void main(String[] args) {
		var a=10;
		var b=5;
		var c= a+b;
		System.out.println("-----Arithmetic Operations-----");
		
		System.out.println("Addition = "+c);
		c=a-b;
		System.out.println("Difference = "+c);
		c=a*b;
		System.out.println("Product = "+c);
		c=a/b;
		System.out.println("Quotient = "+c);
		c=a%b;
		System.out.println("Remainder = "+c);
		System.out.println("-----Relational Operators-----");
		var d=a<b;
		System.out.println("a<b = "+d);
		d=a>b;
		System.out.println("a>b = "+d);
		d=a<=b;
		System.out.println("a<=b = "+d);
		d=a>=b;
		System.out.println("a>=b = "+d);
		d=a==b;
		System.out.println("a==b = "+d);
		System.out.println("-----Logical operators-----");
		var e = true;
		var f =  false;
		var g = e&&e;
		System.out.println("true && true => "+g);
		g=e&&f;
		System.out.println("true && false => "+g);
		g=f&&f;
		System.out.println("false && false => "+g);
		g=f&&e;
		System.out.println("false && true => "+g);
		g=e||e;
		System.out.println("true || true => "+g);
		g=e||f;
		System.out.println("true || false => "+g);
		g=f||e;
		System.out.println("true || false => "+g);
		g=f||f;
		System.out.println("true || false => "+g);
		g=(10<20)&&(5>10);
		System.out.println("(10<20) && (5>10) => "+g);
		g=(10<20)||(5>10);
		System.out.println("(10<20) || (5>10) => "+g);
		
		
	}

}
