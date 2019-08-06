package com.atmecs.logreports;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.atmecs.constants.ProjectPathConstants;

public class LogReportinformation {

Logger logger = null;

public LogReportinformation() {
getlogger();
logger = Logger.getLogger(LogReportinformation.class.getName());
}

public void getlogger() {
PropertyConfigurator.configure(ProjectPathConstants.logpropertyfile);
}

public void info(String message) {
logger.info(message);
}
}