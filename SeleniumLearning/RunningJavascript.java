package com.SeleniumLearning;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class RunningJavascript {

	public static void main(String[] args) throws ScriptException {
		 ScriptEngineManager mgr = new ScriptEngineManager();
		    ScriptEngine engine = mgr.getEngineByName("js");

		 // Load and execute a script from the file 'demo.js'
		    try {
		    	FileReader reader = new FileReader("/Users/sansp/eclipse-workspace/com.SeleniumLearning/src/com/SeleniumLearning/javascriptsamp.js");
		        engine.eval(reader);
		    } catch (FileNotFoundException ex) {
		        ex.printStackTrace();
		    } catch (ScriptException ex) {
		        // This is the generic Exception subclass for the Scripting API
		        ex.printStackTrace();
		    }
		    
		  
		    		 
		    		

}

}


