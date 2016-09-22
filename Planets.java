/****************************************************************************
	 *
	 * Created by: Chris Karpinski
	 * Created on: Sept 2016
	 * This program stores planets in an enum and lists them
	 *
	 ****************************************************************************/

public class PlanetsEnum {

	public static void main(String[] args) {
		
	for (int iterator = 0; iterator < 8;iterator++)

		System.out.println(PLANETS.values()[iterator] + ": " + PLANETS.values()[iterator].planetPos);
	}
	
	public enum PLANETS {
		
		MERCURY(1),VENUS(2),EARTH(3),MARS(4),JUPITER(5),SATURN(6),URANUS(7),NEPTUNE(8);
		
		private int planetPos;
		
		PLANETS(int planetPos) {
			
			this.planetPos = planetPos;
			
		}
		
		public int ReturnPosition () {
			
			return planetPos;
		}
		
		
		
	}
	
	
	
}
