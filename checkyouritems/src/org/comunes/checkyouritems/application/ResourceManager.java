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

import android.content.Context;
import android.graphics.Typeface;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Cesar Valiente Gordo
 * @mail cesar.valiente@gmail.com
 * 
 *       This class loads all resources we need to use in the app
 */
public class ResourceManager {

    private final String CLASS_NAME = getClass().getName();

    private final Map<String, Typeface> mFonts;
    private final Context mContext;

    /**
     * Contrutctor
     * 
     * @param context
     */
    public ResourceManager(final Context context) {
        mContext = context;
        mFonts = new HashMap<String, Typeface>();
    }

    /**
     * Load a font from disk and insert it in the Map fonts.
     * 
     * @param fontFileName
     */
    public void loadFont(final String fontFileName) {
        final Typeface typeface = Typeface.createFromAsset(mContext.getAssets(), fontFileName);
        if (!mFonts.containsKey(fontFileName)) {
            mFonts.put(fontFileName, typeface);
        }
    }

    /**
     * Gets the font specfified
     * 
     * @param fontFileName
     * @return
     */
    public Typeface getFont(final String fontFileName) {
        return mFonts.get(fontFileName);
    }

}
