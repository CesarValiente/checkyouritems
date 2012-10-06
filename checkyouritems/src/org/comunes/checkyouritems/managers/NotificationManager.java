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


package org.comunes.checkyouritems.components.notifications;

import org.comunes.checkyouritems.application.Settings;

import android.content.Context;

/**
 * 
 * @author Cesar Valiente Gordo (cesar.valiente@gmail.com)
 * 
 * Class to show {@link android.widget.Toast} notifications
 */
public class Toast {
	
	/**
	 * Launches a {@link android.widget.Toast} notification
	 * 
	 * @param context
	 * @param message
	 * @param length
	 */
	public static void r(Context context, String message, int length) {
		
		if (Settings.Development.DEBUG)
			android.widget.Toast.makeText(
				context,
				message,
				length).show();
	}
	
}
