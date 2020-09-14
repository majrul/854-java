import java.time.LocalDateTime;
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Date d = new Date();
		System.out.println(d);
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
	}
}
