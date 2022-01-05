package org.manohar.mangol.config;

public enum MangolEnum {
	/**
	 * Description : LogBack configuration file name.
	 */
	LOGBACK_CONFIG_FILE_NAME("logback.xml"),
	/**
	 * Description : LogBack configuration file key..
	 */
	LOGBACK_CONFIG_FILE_KEY("logback.configuration.file"),
	/**
	 * Description : Framework Logger appender.
	 */
	FRAMEWORK_LOG_APPENDER("Framework");

	/**
	 * The Value
	 */
	private String value;

	/**
	 * Constructor to set the value
	 * 
	 * @param value
	 *              <p>
	 *              The value
	 *              </p>
	 */
	MangolEnum(String value) {
		this.value = value;
	}

	/**
	 * getValue return constant value.
	 * 
	 * @return value
	 */
	public String getValue() {
		return this.value;
	}
}
