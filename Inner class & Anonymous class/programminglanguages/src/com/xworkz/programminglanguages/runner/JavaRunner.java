package com.xworkz.programminglanguages.runner;

import com.xworkz.programminglanguages.boot.Java;

public class JavaRunner {

	public static void main(String[] args) {

		// anonymous class
		Java language = new Java() {

			public void foundedBy(String name) {

				System.out.println("Java was founded by :" + name);

			}

		};

		language.foundedBy("James Gosling");

	}

}
