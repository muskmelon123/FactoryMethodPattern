
public class Client {
	public static void main(String args[]){
		FactoryLogger factorylogger;
		Logger logger;
		factorylogger = new FileFactoryLogger();
		logger = factorylogger.creatLogger();
		logger.writeLog();
	}
}
