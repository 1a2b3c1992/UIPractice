package UtilityLayer;

import java.text.SimpleDateFormat;
import java.util.Date;

import BaseLayer.BaseClass;

public class DateAndTime extends BaseClass{
	
	public static String year()
	{
	return	new SimpleDateFormat("yyyy").format(new Date());
	}
	
	public static String monthYear()
	{
		return new SimpleDateFormat("MMMyyyy").format(new Date());
	}
	
	public static String dateMonthYear()
	{
		return new SimpleDateFormat("DDMMMyyyy").format(new Date());
	}

	public static String getDateTime() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
