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

import org.comunes.checkyouritems.application.Settings;

/**
 * 
 * @author Cesar Valiente Gordo
 * @mail cesar.valiente@gmail.com
 * 
 *       This class is used to write in the standard output the different traces of the application.
 */
public class Log {

    public static void v(String className, String msg) {
        if (Settings.Development.DEBUG) {
            android.util.Log.v(className, msg);
        }
    }

    public static void d(String className, String msg) {
        if (Settings.Development.DEBUG) {
            android.util.Log.d(className, msg);
        }
    }

    public static void i(String className, String msg) {
        if (Settings.Development.DEBUG) {
            android.util.Log.i(className, msg);
        }
    }

    public static void w(String className, String msg) {
        if (Settings.Development.DEBUG) {
            android.util.Log.w(className, msg);
        }
    }

    public static void e(String className, String msg) {
        if (Settings.Development.DEBUG) {
            android.util.Log.e(className, msg);
        }
    }

}
