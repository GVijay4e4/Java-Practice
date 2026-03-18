package basics;

public class BitWiseShift {

	public static void main(String[] args) {
		//left Shift (<<) : equivalent to multiplying by 2^n
		var a = 4;
		var b = a<<2;          // 4*2^2 = 16
		System.out.println("a<<2 = "+b);  
		var  c = b<<1;          // 16*2^1 = 32
		System.out.println("b<<1 = "+ c);  
		var d=c<<1;             // 32*2^1 = 64
		System.out.println("c<<1 = "+d);
		System.out.println("-------------");
		//Right  Shift(>>) : equivalent to dividing by 2^n
		var e = 32;
		var f = e>>2;         // 32/2^2 = 8
		System.out.println("e>>2 = "+f);
		var g=f>>1;             // 8/2^1 = 4
		System.out.println("f>>1 = "+g);
		var h=g>>1;              // 4/2^1 = 2
		System.out.println("g>>1 = "+h);
	}

}
