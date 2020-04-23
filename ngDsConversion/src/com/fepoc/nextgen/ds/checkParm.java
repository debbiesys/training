package com.fepoc.nextgen.ds;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class checkParm {
private String useParmDate;
private String parmOvrdProcDate;
public checkParm (String str1, String str2) {
	useParmDate = str1;
	parmOvrdProcDate = str2;
}
public boolean validateDateFormat(String dateToValidate, String dateFromat){

	if(dateToValidate == null){
		return false;
	}

	SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
	sdf.setLenient(false);

	try {

		//if not valid, it will throw ParseException
		Date date = sdf.parse(dateToValidate);
		
	} catch (ParseException e) {

		e.printStackTrace();
		return false;
	}

	return true;
}
}
