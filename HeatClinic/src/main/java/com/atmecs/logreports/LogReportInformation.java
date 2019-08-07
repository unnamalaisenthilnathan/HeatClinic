package com.atmecs.logreports;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.atmecs.constants.ProjectPathConstants;

public class LogReportInformation {

Logger logger = null;

public LogReportInformation() {
getlogger();
logger = Logger.getLogger(LogReportInformation.class.getName());
}

public void getlogger() {
PropertyConfigurator.configure(ProjectPathConstants.logpropertyfile);
}

public void info(String message) {
logger.info(message);
}
}