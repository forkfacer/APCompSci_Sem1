/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {


	Cipher ciph = new Cipher();

	System.out.println(ciph.encode("6v lvp u5vuy5 y1z5 qpsqy5r"));
	System.out.println(ciph.encode("sv8vq17r 1r q25 85rq"));
	System.out.println(ciph.encode("q25 z5l qv wpx85s f 1r gg"));
	System.out.println(ciph.keyedEncode("z8r8v 6yzzc 64r8 oys sx z8r8v 6y4z6 ty 18t oys 9yqz", 33));
	System.out.println(ciph.encode("29y4 v4 v2q9w1r 05sr5l wpx85s 1r z5l qv d"));
	System.out.println(ciph.keyedEncode("a8 1oy 92 1kx rxdj in 4", 8));
	System.out.println(ciph.keyedEncode("549q94u8 q3t sxys0u3 q7u 2e vqb47y9u bq7yqr1u 3q2u8", 13));
	System.out.println(ciph.keyedEncode("12xgx2cy g3d e98e6c3 gzc 4s bgv2z8xc vgz8gf5c 3g4cy", 29));
	System.out.println(ciph.encode("lvpo5 rp775rr4pyyl 7vxuy5q56 q25 41srq r57q1vw"));
	System.out.println(ciph.keyedEncode("u4y i1e i5 i6ita5c 314c1i66e1 i5f by6i5 hea5c zbi58 u4y", 27));
	System.out.println(ciph.keyedEncode("amlb mfhp7fcj jlgq fo tap s9a bjlslql aflipa lb hlg9b 210z t9ct", 16));

	Scanner sc = new Scanner(System.in);
	System.out.print("\nWrite a sentence to encode: ");
	String sent = sc.nextLine();
	Cipher newCiph = new Cipher();
	System.out.println("Your encoded sentence is: \n" + newCiph.encode(sent));
	
	}
}