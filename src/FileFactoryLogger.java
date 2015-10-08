
public class FileFactoryLogger implements FactoryLogger {

	@Override
	public Logger creatLogger() {
		// TODO Auto-generated method stub
		Logger logger = new FileLogger();
		return logger;
	}

}
