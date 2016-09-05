package com.soch.uam.util;

import java.util.Date;

public class AppUtil {
	
	public static boolean validateTime(int minutes, Date fromDate)
	{
		boolean returnValue = false;
		long timeDiff = (new Date()).getTime() - fromDate.getTime();
		long timeDiffMins  = timeDiff / (60 * 1000) % 60;
		
		if(timeDiffMins < minutes)
			returnValue = true;
		return returnValue;
				
	}

}
