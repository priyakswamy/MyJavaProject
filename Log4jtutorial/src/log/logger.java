package log;

import java.util.logging.Logger;

import org.apache.logging.log4j.LogManager;

public class logger {

public static org.apache.logging.log4j.Logger log = LogManager.getLogger(logger.class.getName());

public static void main(String[] args) {

	log.debug("debugging in progress");
	log.error("will get displayed if there is an error");
	log.fatal("application crashed");
}
}