package com.xworkz.camera.boot;

public class CameraFeatures extends Camera{

	
	public void builtInFlash() {
		
		System.out.println("Built in flash feature is there in camera");
	}

	
	public void digitalZoom() {
		
		System.out.println("Digital tele converter is present in the camera");
	}

	
	public void imageStabilizer() {
		
		System.out.println("In-body 5-axis sensor-shift image stabilisation ");
	}

	
	public void manualFocus() {
		
		System.out.println("Manual focus is present in the camera");
	}

	
	public void movieFormat() {
		
		System.out.println("Movie format is MP4");
	}

	
	public void optionalPower() {
		
		System.out.println("AC power & USB power is present as optional power");
	}

	
	public void viewFinderCoverage() {

		System.out.println("camera provides 100 % view finder coverage ");
	}

	
	public void whiteBalance() {
		
		System.out.println("white balance is present in camera");
	}
	
	
	public void cameraWeight(int weight) {
		super.weight = weight;
		System.out.println("Weight of the camera :" +weight);
	}
	
	public void isSilentShutterPresentOrAbsent(boolean isSilentShutterPresent) {
		super.isSilentShutterPresent = isSilentShutterPresent;
		System.out.println("Silent shutter is present in camera :" +isSilentShutterPresent);
	}
	
	public void isManualFocusPresentOrNot(boolean isManualFocusPresent) {
		super.isManualFocusPresent = isManualFocusPresent;
		System.out.println("Manual focus is present in camera :" +isManualFocusPresent);
	}
	
	public void SizeOflcdMonitor(float lcdMonitorSize) {
		super.lcdMonitorSize = lcdMonitorSize;
		System.out.println("Size of the lcd monitor :" +lcdMonitorSize);
	}
	
	
	

}
