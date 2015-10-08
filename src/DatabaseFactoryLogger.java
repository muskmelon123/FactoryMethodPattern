
public class DatabaseFactoryLogger implements FactoryLogger {

	@Override
	public Logger creatLogger() {
		// TODO Auto-generated method stub
		Logger logger = new DatabaseLogger();
		return logger;
	}

}
