package com.xworkz.train.runner;

import com.xworkz.train.boot.Train;
import com.xworkz.train.boot.Train.Express;

public class TrainRunner {
	
	public static void main(String[] args) {
		
		Train train = new Train();
		
		train.name();
		
		Express express = train.new Express();
		
		express.rajdhaniExpress();
	}

}
