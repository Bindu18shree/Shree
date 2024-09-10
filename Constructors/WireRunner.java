class WireRunner{
	
	public static void main(String [] args){
		
		Wire wire = new Wire("KEI", 32, 1100l, 'R', 16.3f, 5.29723d, true);
		
		System.out.println("Brand of the wire :" +wire.getBrand());
		
		System.out.println("Number of cable strands :" +wire.getNoOfCableStrand());
		
		System.out.println("Voltage of the wire in volts :" +wire.getVoltage());
		
		System.out.println("Color of the wire :" +wire.getColor());
		
		System.out.println("Height of the wire in cm :" +wire.getItemHeight());
		
		System.out.println("Width of the wire in cm :" +wire.getItemWidth());
		
		System.out.println("Origin of the wire is India :" +wire.isOriginOfWireFromIndiaOrNot());
		
		
	}
}