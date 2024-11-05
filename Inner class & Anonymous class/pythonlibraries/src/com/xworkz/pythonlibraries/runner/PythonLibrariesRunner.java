package com.xworkz.pythonlibraries.runner;

import com.xworkz.pythonlibraries.boot.PythonLibraries;

public class PythonLibrariesRunner {

	public static void main(String[] args) {
		
        // Anonymous class using lambda expression
		PythonLibraries library = (n) -> System.out.println("Name of the python library is :" + n);{

		library.nameOfTheLibrary("Numpy");
		
		};

	}

}
