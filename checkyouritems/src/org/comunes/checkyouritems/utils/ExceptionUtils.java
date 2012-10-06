/*
   	Copyright 2012 Cesar Valiente Gordo & Comunes Collective
 
    This file is part of CheckYourItems.

    CheckYourItems is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    QuiteSleep is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with CheckYourItems.  If not, see <http://www.gnu.org/licenses/>.
*/


package org.comunes.checkyouritems.utils;



/**
 * 
 * @author Cesar Valiente Gordo
 * @mail cesar.valiente@gmail.com
 *
 */
public class ExceptionUtils {
	
	public static final String CLASS_NAME = "org.comunes.checkYourItems.utils.ExceptionUtils";
			
	
	/**
	 * 
	 * @param stackTrace
	 * @return
	 */
	public static String getString (Exception exception) {
		
		try {			
			String exceptionString = exception.toString();
			StackTraceElement[] stackTrace = exception.getStackTrace();
			
			String completeTrace = "";
			for (int i=0; i<stackTrace.length; i++) {
				if (completeTrace.equals(""))
					completeTrace = exceptionString + "\n\t" + stackTrace[i].toString() + "\n";
				else
					completeTrace = completeTrace + "\t" + stackTrace[i] + "\n";
			}
			
			return completeTrace;
			
			
		}catch (Exception e) {
			Log.e(CLASS_NAME, e.toString());
			return "";
		}
	}
}
