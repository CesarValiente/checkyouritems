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

import org.comunes.checkyouritems.R;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;

/**
 * 
 * @author Cesar Valiente Gordo
 * @mail cesar.valiente@gmail.com
 * 
 *       This class is used as animation controller to performs all animation
 *       stuff in the application. It has to be used through the ClassWiring
 *       manager to use in standalone mode
 */
public class AnimationManager {

    private Context mContext;

    /**
     * Constructor
     * 
     * @param context
     */
    public AnimationManager(Context context) {
        mContext = context;
    }

    /**
     * FadeIn the passed view {@see View}, using the listener {@see
     * AnimationListener} as the listener to announce the different events
     * 
     * @param view
     * @param listener
     */
    public void fadeIn(View view, AnimationListener listener) {

        standardAnimation(view, listener, R.anim.fadein);
    }

    /**
     * FadeOut the passed view {@see View}, using the listener {@see
     * AnimationListener} as the listener to announce the different events
     * 
     * @param view
     * @param listener
     */
    public void fadeOut(View view, AnimationListener listener) {

        standardAnimation(view, listener, R.anim.fadeout);
    }

    /**
     * Performs an standard view animation using the view passed. If we have a
     * listener, then we use, and finally the animationType which is a resource
     * to the different animation types.
     * 
     * @param view
     * @param listener
     * @param animationType
     */
    private void standardAnimation(View view, AnimationListener listener,
            int animationType) {

        Animation animation = AnimationUtils.loadAnimation(mContext,
                animationType);
        if (listener != null) {
            animation.setAnimationListener(listener);
        }
        view.startAnimation(animation);
    }

    /**
     * This function scale a view passed as parameter
     * 
     * @param view
     * @param listener
     */
    public void scale(View view, AnimationListener listener) {

        standardAnimation(view, listener, R.anim.scale);
    }

    /**
     * Translates (moves) the view to a new position
     * 
     * @param view
     * @param listener
     */
    public void animateBackground(View view, AnimationListener listener) {

        standardAnimation(view, listener, R.anim.translate);
    }

}
