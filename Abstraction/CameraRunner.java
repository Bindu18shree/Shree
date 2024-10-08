package com.xworkz.camera.runner;

import com.xworkz.camera.boot.CameraFeatures;

public class CameraRunner {
	
	public static void main(String[] args) {
		
		CameraFeatures features = new CameraFeatures();
		
		features.builtInFlash();
		
		features.digitalZoom();
		
		features.imageStabilizer();
		
		features.manualFocus();
		
		features.movieFormat();
		
		features.optionalPower();
		
		features.viewFinderCoverage();
		
		features.whiteBalance();
		
		features.cameraWeight(670);
		
		features.isSilentShutterPresentOrAbsent(true);
		
		features.isManualFocusPresentOrNot(true);
		
		features.SizeOflcdMonitor(7.62f);
	}

}
