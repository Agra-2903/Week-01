import java.lang.*;

class EarthVolume{
	public static void main(String[]args){
		double earthRadius = 6378;
		double volumeInKm = (4/3) * Math.PI * Math.pow(earthRadius, 3);
		double volumeInMiles = volumeInKm / Math.pow(1.6, 3);
		System.out.println("The volume of earth in cubic kilometers is " + volumeInKm + " and cubic miles is " + volumeInMiles);
	}
}