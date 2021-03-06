package com.revature.flow;

public class FlowControl {
	
	public FlowControl(int i){
		//super(); is called implicitly
		System.out.println("inside contructor i = " + i);
		
	}
	
/*	public FlowControl(){
		this(6);
	}*/
	
	public void ifMethod(boolean input, int x) {

		if (input) {
			System.out.println("it was true");
		}

		if (!(5 < x)) {
			System.out.println("x is large enough");
		} else if (5 == x) {
			System.out.println("just barely");
		} else {
			System.out.println("x is too small");
		}

	}

	public void switchMethod(String s) {

		switch (s) {

		case "yes":
			System.out.println("ok");
			break;
		case "no":
			System.out.println("why not");
			break;
		case "fallthrough":
			System.out.println("why did you do this");
		default:
			System.out.println("this is for everything else");

		}

	}

	public void loopMethod(int x, String s) {

		for (int i = 0; i < x; i++) {

			if (i > 10)
				break;

			if (i == 4)
				continue;

			System.out.println(i);

		}

		for (;;) {
			break;
		}

		/*
		 * while(s.length() < 10){
		 * 
		 * s += "a";
		 * 
		 * }
		 */

		//System.out.println(s);

		do {

			s = s.substring(0, s.length() - 1);

		} while (s.length() > 2);

		System.out.println("after do while " + s);

	}

	public void whileMethod(String s) {

		while (s.length() > 2) {

			s = s.substring(0, s.length() - 1);

		}
		
		System.out.println("after while loop: " + s);

	}

}
