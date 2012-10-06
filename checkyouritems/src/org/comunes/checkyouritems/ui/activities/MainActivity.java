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

package org.comunes.checkyouritems.ui.activities;

import org.comunes.checkyouritems.R;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockFragmentActivity;

/**
 * 
 * @author Cesar Valiente Gordo
 * @mail cesar.valiente@gmail.com
 *
 * This class is the main activity of CheckYourItems and is the started point
 * of the app.
 */
public class MainActivity extends SherlockFragmentActivity {
	
	private final String CLASS_NAME = getClass().getName();
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.main);
	}
	
		

	
		
}
