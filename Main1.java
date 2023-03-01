package mypackage;

public class Main1 {//main class
public static void main(String[] args) {//main method
	Movie m1= new Movie();
	m1.setMovieName("Sita Raman");//set the data
	m1.setMovieStartTime("12:00 PM");
	m1.setMovieEndTime("2:45 PM");
	m1.setMovieTicketPrice(250);
	System.out.println("movie name: "+m1.getMovieName());//get the data
	System.out.println("movie start time :"+m1.getMovieStartTime());
	System.out.println("movie end time: "+m1.getMovieEndTime());
	System.out.println("movie ticket price: "+m1.getMovieTicketPrice());
}
}
