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
import org.comunes.checkyouritems.application.ClassWiring;
import org.comunes.checkyouritems.components.animation.AnimationManager;
import org.comunes.checkyouritems.controllers.AnimationController;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 
 * @author Cesar Valiente Gordo
 * @mail cesar.valiente@gmail.com
 * 
 * This class is used to show the splash screen the first time we start the app
 * while in the background we perform other operations
 */
public class SplashScreenActivity extends Activity   {
	
	//Widgets
	private TextView titleText;
	private TextView appNameText;
	private ImageView imageLogo;
		
	
	//Controllers used in the activity
	AnimationManager animationManager;
	
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.splash_screen);		
		
		//Initialize widgets
		titleText = (TextView)findViewById(R.id.splash_title_text);
		imageLogo = (ImageView)findViewById(R.id.splash_logo_image);
		appNameText = (TextView)findViewById(R.id.splash_appname_text);
		
		startAnimations();
	}

	
	/**
	 * Starts the animations of this screen (all of them)
	 */
	private void startAnimations () {
		
		animationManager = ClassWiring.getAnimationManager();
		
		
		final AnimationListener imageLogoListener = new AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {}			
			@Override
			public void onAnimationRepeat(Animation animation) {}			
			@Override
			public void onAnimationEnd(Animation animation) {
				imageLogo.setVisibility(View.VISIBLE);	
				startDashboard();
			}
		}; 
		
		animationManager.scale(imageLogo, imageLogoListener);
		
		final AnimationListener appNameListener = new AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {}		
			@Override
			public void onAnimationRepeat(Animation animation) {}			
			@Override
			public void onAnimationEnd(Animation animation) {
				appNameText.setVisibility(View.VISIBLE);				
			}
		};
		
		final AnimationListener titleListener = new AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {				
			}			
			@Override
			public void onAnimationRepeat(Animation animation) {						
			}			
			@Override
			public void onAnimationEnd(Animation animation) {
				titleText.setVisibility(View.VISIBLE);
				animationManager.fadeIn(appNameText, appNameListener);
			}
		};
		
		animationManager.fadeIn(titleText, titleListener);			
	}
	
	private void startDashboard () {
		
		new Handler().postDelayed(new Runnable() {			
			@Override
			public void run() {
				Intent intent = new Intent(getApplicationContext(), MainActivity.class);				
				startActivity(intent);				
			}
		}, 1000);
	}
	
	
	
	
	
	
}
