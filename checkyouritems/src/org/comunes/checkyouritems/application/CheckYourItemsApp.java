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

package org.comunes.checkyouritems.application;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * 
 * @author Cesar Valiente Gordo
 * @mail cesar.valiente@gordo
 * 
 *       This class is used to get the application context whenever we want and
 *       also to get different data we need along all the application use.
 * 
 */
public class CheckYourItemsApp extends Application {

    private final String CLASS_NAME = getClass().getName();

    private static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();

        sContext = getApplicationContext();

        // Loads the different fonts
        final ResourceManager resourceManager = ClassWiring
                .getResourceManager();
        resourceManager.loadFont(Settings.Ui.UBUNTU_MEDIUM_FONT);
        resourceManager.loadFont(Settings.Ui.UBUNTU_BOLD_FONT);
    }

    /**
     * Returns the context of
     * 
     * @return context
     */
    public static Context getContext() {
        return sContext;
    }

    /**
     * Checks if the device has internet connection
     * 
     * @return
     */
    public static boolean hasInternetConnection() {
        final ConnectivityManager connectivityManager = (ConnectivityManager) sContext
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        final NetworkInfo networkInfo = connectivityManager
                .getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isAvailable()
                && networkInfo.isConnected()) {
            return true;
        }

        return false;
    }

    /**
     * Checks if the SD card is mounted
     * 
     * @return
     */
    public static boolean hasSDCardMounted() {
        return (android.os.Environment.getExternalStorageState()
                .equals(android.os.Environment.MEDIA_MOUNTED));
    }

    /**
     * @return true if and only if this is the first time the app runs
     */
    public boolean isFirstRun() {
        final SharedPreferences prefs = getSharedPreferences(
                Settings.Preferences.PREFS_NAME, MODE_PRIVATE);
        return prefs.getBoolean(Settings.Preferences.PREFS_FIRST_RUN_KEY, true);
    }

    /**
     * store a boolean in the shared preferences so we know the next runs are
     * not the first
     */
    public void setFirstRun() {
        final Editor editor = getSharedPreferences(
                Settings.Preferences.PREFS_NAME, MODE_PRIVATE).edit();
        editor.putBoolean(Settings.Preferences.PREFS_FIRST_RUN_KEY, false);
    }
}
