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

import org.comunes.checkyouritems.managers.AnimationManager;

/**
 * 
 * @author Cesar Valiente Gordo
 * @mail cesar.valiente@gmail.com
 * 
 *       This class is used to instantiate the objects used along all the app
 *       following the singleton design pattern.
 * 
 */
public class ClassWiring {

    private final String CLASS_NAME = ClassWiring.class.getName();

    private static ResourceManager sResourceManager;
    private static AnimationManager sAnimationManager;

    /**
     * Gets the ResourceManager used in the app
     * 
     * @return
     * @see {@link ResourceManager}
     */
    public static ResourceManager getResourceManager() {

        if (sResourceManager == null) {
            sResourceManager = new ResourceManager(
                    CheckYourItemsApp.getContext());
        }

        return sResourceManager;
    }

    /**
     * Gets the AnimationController used in the app
     * 
     * @return
     * @see {@link AnimationManager}
     */
    public static AnimationManager getAnimationManager() {

        if (sAnimationManager == null) {
            sAnimationManager = new AnimationManager(
                    CheckYourItemsApp.getContext());
        }

        return sAnimationManager;
    }

}
