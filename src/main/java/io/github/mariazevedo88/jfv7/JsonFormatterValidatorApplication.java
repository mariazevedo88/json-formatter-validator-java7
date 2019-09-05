package io.github.mariazevedo88.jfv7;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.google.gson.JsonElement;

import io.github.mariazevedo88.jfv7.service.CustomJSONFormatterService;

/**
 * Application's main class 
 * 
 * @author Mariana Azevedo
 * @since 10/02/2019
 *
 */
public class JsonFormatterValidatorApplication {
	
	private static final Logger logger = Logger.getLogger(JsonFormatterValidatorApplication.class.getName());
	
	private static JsonElement json;

	/**
	 * Method that executes the formattter/validator application
	 * 
	 * @author Mariana Azevedo
	 * @since 10/02/2019
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException{
		
		logger.info("Started Json Formatter Validator Aplication");
		
		CustomJSONFormatterService formatter = new CustomJSONFormatterService();
		
		for(String arg : args) {
			json = formatter.checkValidityAndFormatObject(arg, false, false);
		}
	}

	/**
	 * Method that returns a JsonObject
	 * 
	 * @author Mariana Azevedo
	 * @since 10/02/2019
	 * 
	 * @return json
	 */
	public static JsonElement getJson() {
		return json;
	}

}

