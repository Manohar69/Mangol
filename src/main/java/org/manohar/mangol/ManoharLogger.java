package org.manohar.mangol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * ManoharLogger is used to get the handle to logBack logger. This application
 * uses slf4j framework with logBack as the underlying implementation for
 * logging.
 * 
 * This logBack by default can log messages at five levels. The logging levels
 * will be used as follows: DEBUG - Use debug to write debugging messages which
 * should not be printed when the application is in production. INFO - Use info
 * for messages similar to the "verbose" mode of many applications. WARN - Use
 * for warning messages where the application is able to carry on without a
 * problem. ERROR - Use for application error messages where the user or system
 * is able to recover. Such as when some administrator-supplied configuration
 * parameter is incorrect and you fall back to using some hard-coded default
 * value. FATAL- Use for critical messages, after logging of which the
 * application quits abnormally.
 * 
 * 
 */
public class ManoharLogger {
	private Logger logger = null;

	/**
	 * Method Name: getLogger Description: This methods returns Logger instance for
	 * default appender.
	 * 
	 * @return ManoharLogger
	 */
	protected static ManoharLogger getLogger() {
		ManoharLogger loggerInstance = new ManoharLogger();
		loggerInstance.logger = LoggerFactory.getLogger("Default");
		return loggerInstance;
	}

	/**
	 * Method Name: getLogger Description: This methods returns Logger instance for
	 * given appender.
	 * 
	 * @param appender
	 *                 <p>
	 *                 The appender name
	 *                 </p>
	 * @return ManoharLogger
	 */
	public static ManoharLogger getLogger(String appender) {
		ManoharLogger loggerInstance = new ManoharLogger();
		loggerInstance.logger = LoggerFactory.getLogger(appender);
		return loggerInstance;
	}

	/**
	 * EntryPoint is used to log the method name. It should be the first statement
	 * in any method.
	 * 
	 * @param methodName
	 *                   <p>
	 *                   String method_name indicating name of the method to be
	 *                   logged.
	 *                   </p>
	 */
	public void entryPoint(String methodName) {
		logger.info(String.format("Entering %s ", methodName));

	}

	/**
	 * ExitPoint is used to log the method name. It should be the last reachable
	 * statement in any method. It should be placed before any return statement.
	 * 
	 * @param methodName
	 *                   <p>
	 *                   String methodName indicating name of the method to be
	 *                   logged.
	 *                   </p>
	 */
	public void exitPoint(String methodName) {
		logger.info(String.format("Exiting %s ", methodName));
	}

	/**
	 * LogDebug is used to log the messages to log file. It checks if DEBUG mode is
	 * enabled to log the message.
	 * 
	 * @param message
	 *                <p>
	 *                Object message indicates the message to be logged.
	 *                </p>
	 * 
	 */
	public void logDebug(String message) {
		logger.debug(message);
	}

	/**
	 * LogDebug is used to log the messages to log file. It checks if DEBUG mode is
	 * enabled to log the message.
	 * 
	 * @param message
	 *                  <p>
	 *                  Object message indicates the message to be logged.
	 *                  </p>
	 * @param throwable
	 *                  <p>
	 *                  This represents any exception which needs to be logged.
	 *                  </p>
	 */
	public void logDebug(String message, Throwable throwable) {
		logger.debug(message, throwable);
	}

	/**
	 * LogError is used to log error messages to log file. It checks if ERROR mode
	 * is enabled to log the message.
	 * 
	 * @param message
	 *                <p>
	 *                Object message indicates the message to be logged.
	 *                </p>
	 * 
	 */
	public void logError(String message) {
		logger.error(message);
	}

	/**
	 * LogError is used to log error messages to log file. It checks if ERROR mode
	 * is enabled to log the message.
	 * 
	 * @param message
	 *                  <p>
	 *                  Object message indicates the message to be logged.
	 *                  </p>
	 * @param throwable
	 *                  <p>
	 *                  This represents any exception which needs to be logged.
	 *                  </p>
	 */
	public void logError(String message, Throwable throwable) {
		logger.error(message, throwable);
	}

	/**
	 * LogInfo is used to log informational messages to log file. It checks if INFO
	 * mode is enabled to log the message.
	 * 
	 * @param message
	 *                <p>
	 *                Object message indicates the message to be logged.
	 *                </p>
	 * 
	 */
	public void logInfo(String message) {
		logger.info(message);
	}

	/**
	 * LogInfo is used to log informational messages to log file. It checks if INFO
	 * mode is enabled to log the message.
	 * 
	 * @param message
	 *                  <p>
	 *                  Object message indicates the message to be logged.
	 *                  </p>
	 * @param throwable
	 *                  <p>
	 *                  This represents any exception which needs to be logged.
	 *                  </p>
	 */
	public void logInfo(String message, Throwable throwable) {
		logger.info(message, throwable);
	}

	/**
	 * LogWarn is used to log warning messages to log file. It checks if WARN mode
	 * is enabled to log the message.
	 * 
	 * @param message
	 *                <p>
	 *                Object message indicates the message to be logged.
	 *                </p>
	 * 
	 */
	public void logWarn(String message) {
		logger.warn(message);
	}

	/**
	 * LogWarn is used to log warning messages to log file. It checks if WARN mode
	 * is enabled to log the message.
	 * 
	 * @param message
	 *                  <p>
	 *                  Object message indicates the message to be logged.
	 *                  </p>
	 * @param throwable
	 *                  <p>
	 *                  This represents any exception which needs to be logged.
	 *                  </p>
	 */
	public void logWarn(String message, Throwable throwable) {
		logger.warn(message, throwable);
	}

	/**
	 * logTrace is used to log trace messages to log file. It checks if TRACE mode
	 * is enabled to log the message.
	 * 
	 * @param message
	 *                <p>
	 *                Object message indicates the message to be logged.
	 *                </p>
	 * 
	 */
	public void logTrace(String message) {
		logger.trace(message);
	}

	/**
	 * logTrace is used to log trace messages to log file. It checks if TRACE mode
	 * is enabled to log the message.
	 * 
	 * @param message
	 *                  <p>
	 *                  Object message indicates the message to be logged.
	 *                  </p>
	 * @param throwable
	 *                  <p>
	 *                  This represents any exception which needs to be logged.
	 *                  </p>
	 */
	public void logTrace(String message, Throwable throwable) {
		logger.trace(message, throwable);
	}

	/**
	 * IsDebugEnabled is used to check if DEBUG mode is enabled or not.
	 * 
	 * @return true/false
	 */
	public boolean isDebugEnabled() {
		return logger.isDebugEnabled();
	}

	/**
	 * IsErrorEnabled is used to check if ERROR mode is enabled or not.
	 * 
	 * @return true/false
	 */
	public boolean isErrorEnabled() {
		return logger.isErrorEnabled();
	}

	/**
	 * IsInfoEnabled is used to check if INFO mode is enabled or not.
	 * 
	 * @return true/false
	 */
	public boolean isInfoEnabled() {
		return logger.isInfoEnabled();
	}

	/**
	 * IsWarnEnabled is used to check if WARN mode is enabled or not.
	 * 
	 * @return true/false
	 */
	public boolean isWarnEnabled() {
		return logger.isWarnEnabled();
	}

	/**
	 * IsTraceEnabled is used to check if TRACE mode is enabled or not.
	 * 
	 * @return true/false
	 */
	public boolean isTraceEnabled() {
		return logger.isTraceEnabled();
	}

	/**
	 * Used to get information from MDC.
	 * 
	 * @param key - The key to lookup for.
	 * @return object
	 */
	public Object getSharedDataByKey(String key) {
		return MDC.get(key);
	}

}
