import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AutoSave extends Thread{
	public void run() {
		for(; ;) {
			try{
				Thread.sleep(3000);
				String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
				System.out.println("Autosave"+time);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			};
		}
	}
}
class Eclipse extends Thread{
	public void run() {
		AutoSave a = new AutoSave();
		a.setName("AutoSave");
		
		a.setDaemon(true);
		a.start();
		
		try {
			Thread.sleep(3000);
			System.out.println("Eclipse as started");
			Thread.sleep(5000);
			System.out.print("User closed the eclipse");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

public class Daemon {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Eclipse ec = new Eclipse();
		ec.setName("Eclipse");
		ec.start();

	}

}
