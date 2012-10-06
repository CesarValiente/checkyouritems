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

package org.comunes.checkyouritems.managers;

import android.content.Context;
import android.widget.Toast;

/**
 * 
 * @author Cesar Valiente Gordo (cesar.valiente@gmail.com)
 * 
 *         Class to show {@link android.widget.Toast} notifications
 */
public class NotificationManager {

    /**
     * Launches a {@link Toast} notification
     * 
     * @param context
     * @param message
     * @param length
     */
    public static void showToast(Context context, String message, int length) {

        Toast.makeText(context, message, length).show();
    }

    /**
     * Shows a short time {@link Toast}
     * 
     * @param context
     * @param message
     */
    public static void showShortTimeToast(Context context, String message) {
        showToast(context, message, Toast.LENGTH_SHORT);
    }

    /**
     * Shows a long time {@link Toast}
     * 
     * @param context
     * @param message
     */
    public static void showLongTimeToast(Context context, String message) {
        showToast(context, message, Toast.LENGTH_LONG);
    }
}
