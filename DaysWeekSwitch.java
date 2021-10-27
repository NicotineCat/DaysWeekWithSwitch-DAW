public class DaysWeekSwitch {
	public static void main(String[] args) {
		//Se genera un número al azar entre 0 y 6
		int DIAS = 6;
		int azar = (int) (Math.random() * DIAS);
		String dia = "";
		switch (azar) {
			case 0:
				dia = "Monday";
				break;
			case 1:
				dia = "Tuesday";
				break;
			case 2:
				dia = "Wednesday";
				break;
			case 3:
				dia = "Thursday";
				break;
			case 4:
				dia = "Friday";
				break;
			case 5:
				dia = "Saturday";
				break;
			case 6:
				dia = "Sunday";
				break;
		}
		System.out.println(dia + " is the best day of the week");
	}
}
