public class DaysWeekSwitch {
	public static void main(String[] args) {
		//Se genera un número al azar entre 1 y 7
		int DIAS = 7;
		int azar = (int) (Math.random() * DIAS) + 1;
		String dia;
		switch (azar) {
			case 1:
				dia = "Monday";
				break;
			case 2:
				dia = "Tuesday";
				break;
			case 3:
				dia = "Wednesday";
				break;
			case 4:
				dia = "Thursday";
				break;
			case 5:
				dia = "Friday";
				break;
			case 6:
				dia = "Saturday";
				break;
			case 7:
				dia = "Sunday";
				break;
		}
		System.out.println(dia + " is the best day of the week");
	}
}
