package OneA;

public class Logger {
	//private static Logger  name = new Logger();
	private static Logger instance =null;
	 private Logger() {}
	 public static Logger getInstance() {
		 if(instance==null) {
			 instance=new Logger();
		 }
		 return instance;
	 }
	 public void show (String message) {
		 System.out.println("message:"+message);
	 }
	 
	
}
