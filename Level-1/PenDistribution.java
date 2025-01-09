class PenDistribution{
	public static void main(String[]args){
		int totalPens = 14, students = 3;
		int penRemain = totalPens % students;
	System.out.println("The Pen Per Student is " + ((totalPens - penRemain) / students) + " and the remaining pen not distributed is " + penRemain);
	}
}