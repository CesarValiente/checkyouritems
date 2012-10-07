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

/**
 * 
 * @author Cesar Valiente Gordo (cesar.valiente@gmail.com)
 * 
 *         This class is used to use different constant values along all the
 *         app.
 */
public class Settings {

    /**
     * 
     * @author Cesar Valiente Gordo (cesar.valiente@gmail.com)
     * 
     *         This class is used to specify all the development values
     */
    public class Development {

        public static final boolean DEBUG = true;
    }

    /**
     * 
     * @author Cesar Valiente Gordo (cesar.valiente@gmail.com)
     * 
     *         This class is used to specify the different final names of the ui
     *         components
     */
    public class Ui {

        // Font files
        public static final String UBUNTU_MEDIUM_FONT = "fonts/UbuntuM.ttf";
        public static final String UBUNTU_BOLD_FONT = "fonts/UbuntuB.ttf";
    }

    /**
     * 
     * @author Cesar Valiente Gordo (cesar.valiente@gmail.com)
     * 
     *         Class to define the preference attributes
     */
    public class Preferences {

        public static final String PREFS_NAME = "checkyouritems_prefs";
        public static final String PREFS_FIRST_RUN_KEY = "first_run";
    }

    /**
     * 
     * @author Cesar Valiente Gordo (cesar.valiente@gmail.com)
     * 
     *         Data regarding network
     */
    public class Network {

        public static final String TEXT_ENCODING = "UTF-8";
        public static final String REQUEST_USER_PART = "https://api.soundcloud.com/users/";
        public static final String REQUEST_TRACKS_PART = "/tracks.json?";
        public static final String REQUEST_FAVORITES_PART = "/favorites.json?";
        public static final String REQUEST_CLIENT_ID_PART = "client_id=";
        public static final String REQUEST_LIMIT_PART = "&limit=1";
        public static final String REQUEST_OFFSET_PART = "&offset=";
    }
}
