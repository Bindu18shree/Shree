package com.xworkz.classmate.boot;

import com.xworkz.classmate.bridge.ClassMate;

public class Friend {
	
	public ClassMate classmate;
	
	
	public ClassMate display(ClassMate classmate) {
		this.classmate = classmate;
		return classmate;
	}
	
	
	public ClassMate execute(ClassMate classmate) {
		return classmate;
	}

}
