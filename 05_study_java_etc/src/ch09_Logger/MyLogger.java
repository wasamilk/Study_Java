package ch09_Logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// MyLogger 또한 싱글톤으로 구현하였음   
public class MyLogger {

	// mylogger -> 식별자...
	// logger는 일종의 싱글톤 패턴으로 new로 생성 물가하고 getLogger를 해야함
	Logger logger = Logger.getLogger("mylogger");
	private static MyLogger instance = new MyLogger();

	public static final String errorLog = "log.txt";
	public static final String warningLog = "warning.txt";
	public static final String fineLog = "fine.txt";

	private FileHandler logFile = null;
	private FileHandler warningFile = null;
	private FileHandler fineFile = null;

	private MyLogger() {

		try {
			// FileHandeler(파일이름, T/F)
			// true는 overrite말고 append하라는 의미
			logFile = new FileHandler(errorLog, true);
			warningFile = new FileHandler(warningLog, true);
			fineFile = new FileHandler(fineLog, true);

		} catch (SecurityException |IOException e) {
			e.printStackTrace();
		}

		// 핸들러 포멧 설정
		logFile.setFormatter(new SimpleFormatter());
		warningFile.setFormatter(new SimpleFormatter());
		fineFile.setFormatter(new SimpleFormatter());

		// 로그의 레벨은 FileHandler나 logger에 setLevehl()로 정해준다
		// logger에서 set해줄 경우 전체 logger에 대한 레벨이다
		// 레벨이 set 되지 않은 핸들러(ex logFile)은 logger의 레벨을 따라간다
		/** logging 패키지에서 제공하는 로그 레벨은 severe, warning, info, config, fine, finer, finest 임 
		 *  만약에 logger레벨이 info, 핸들러레벨이 fine이라면, 핸들러는 더 높은 레벨인 info를 따라감 */
		logger.setLevel(Level.ALL);
		fineFile.setLevel(Level.FINE);
		warningFile.setLevel(Level.WARNING);
		// console에 찍히는 로그는, installed jre경로의 config폴더의 logging.properties를 열어보면 info레벨로 설정된것을 볼 수 있다

		logger.addHandler(logFile);
		logger.addHandler(warningFile);
		logger.addHandler(fineFile);
	}

	public static MyLogger getLogger() {
		return instance;
	}

	public void log(String msg) {

		// 괄호안에는 기록으로 남길 문자열을 넣어주면, 로그파일에 해당 문자열이 기록된다
		logger.finest(msg);
		logger.finer(msg);
		logger.fine(msg);
		logger.config(msg);
		logger.info(msg);
		logger.warning(msg);
		logger.severe(msg);

	}

	public void fine(String msg) {
		logger.fine(msg);
	}

	public void warning(String msg) {
		logger.warning(msg);
	}
}