package com.xworkz.camera.boot;

public abstract class Camera {
	
	public int weight;
	public boolean isSilentShutterPresent;
	public boolean isManualFocusPresent;
	public float lcdMonitorSize;
	
	
	public abstract void builtInFlash();
	
	public abstract void digitalZoom();
	
	public abstract void imageStabilizer();
	
	public abstract void manualFocus();
	
	public abstract void movieFormat();
	
	public abstract void optionalPower();
	
	public abstract void viewFinderCoverage();
	
	public abstract void whiteBalance();
	
	public void cameraWeight(int weight) {
		this.weight = weight;
		System.out.println("Weight of the camera :" +weight);
	}
	
	public void isSilentShutterPresentOrAbsent(boolean isSilentShutterPresent) {
		this.isSilentShutterPresent = isSilentShutterPresent;
		System.out.println("Silent shutter is present in camera :" +isSilentShutterPresent);
	}
	
	public void isManualFocusPresentOrNot(boolean isManualFocusPresent) {
		this.isManualFocusPresent = isManualFocusPresent;
		System.out.println("Manual focus is present in camera :" +isManualFocusPresent);
	}
	
	public void SizeOflcdMonitor(float lcdMonitorSize) {
		this.lcdMonitorSize = lcdMonitorSize;
		System.out.println("Size of the lcd monitor :" +lcdMonitorSize);
	}
	
	

}
