package com.epam.ExceptionLogging;

import java.util.logging.Logger;

public class DriverClass {
	static Logger log = Logger.getLogger(DriverClass.class.getName());
    public static void main( String[] args ) {
    	InterestCode.calInterest();
        ConstructionCode.costPrediction();
    }
}