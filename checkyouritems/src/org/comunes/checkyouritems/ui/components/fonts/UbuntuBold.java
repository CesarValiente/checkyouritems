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

package org.comunes.checkyouritems.ui.components.fonts;

import org.comunes.checkyouritems.application.ClassWiring;
import org.comunes.checkyouritems.application.Settings;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * 
 * @author Cesar Valiente Gordo
 * @mail cesar.valiente@gmail.com
 * 
 * Sets the specified font to use in this class
 *
 */
public class UbuntuBold extends TextView {

	/**
	 * Constructor
	 * @param context
	 */
	public UbuntuBold (Context context) {
		super(context);
		setFont();
	}
	
	/**
	 * Constructor
	 * @param context
	 * @param attrs
	 */
	public UbuntuBold (final Context context, final AttributeSet attrs) {		
		super(context, attrs);
		setFont();
	}
	
	/**
	 * Constructor
	 * @param context
	 * @param attrs
	 * @param defStyle
	 */
	public UbuntuBold (
			final Context context, 
			final AttributeSet attrs, 
			final int defStyle) {
		
		super(context, attrs, defStyle);
		setFont();
	}
	
	/**
	 * Sets the appropriated font
	 */
	public void setFont () {
		setTypeface(ClassWiring.getResourceManager().getFont(Settings.Ui.UBUNTU_BOLD_FONT));		
	}

}
