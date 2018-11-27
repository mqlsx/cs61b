/** 
Test whether the given year is a leap year 
A leap year is either:
divisible by 400 or
divisible by 4 and not by 100.
*/
class LeapYear {
	public static boolean isLeapYear(int year) {
		boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
		return isLeap;
	}

	public static void main(String[] args) {
		System.out.println(isLeapYear(Integer.parseInt(args[0])));
	}
}