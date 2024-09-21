class MixerGrinder{
	static int warranty;
	static char model;
	static float capacity;
	static long wattage;
	static short numberOfJars;
	static double itemWeight;
	static byte numberOfSpeeds;
	static boolean onOrOff;
	
	public static void main(String[] args){
		
		warranty = 12;
		model = 'L';
		capacity = 1.5f;
		wattage = 500l;
		numberOfJars = 4;
		itemWeight = 2.96340d;
		numberOfSpeeds = 03;
		onOrOff = false;
		
		System.out.println("Warranty of the Mixer Grinder is given in months as ="+warranty);
		System.out.println("The Model ="+model);
		System.out.println("The Total Capacity of the Mixer Grinder is given in Litres which is ="+capacity);
		System.out.println("The Wattage is given in W as ="+wattage);
		System.out.println("The total number of Jars in the Mixer Grinder ="+numberOfJars);
		System.out.println("Item Weight ="+itemWeight);
		System.out.println("Number of Sppeds in the Mixer Grinder ="+numberOfSpeeds);
		System.out.println("Whether the Mixer Grinder is On or Off ="+onOrOff);
		
		
		
		
		
	}
}
