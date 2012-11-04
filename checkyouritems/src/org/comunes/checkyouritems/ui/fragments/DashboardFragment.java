package org.comunes.checkyouritems.ui.fragments;

import org.comunes.checkyouritems.R;
import org.comunes.checkyouritems.utils.Log;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

/**
 * 
 * @author Cesar Valiente Gordo (cesar.valiente@gmail.com
 * 
 *         This class has the different elements and functionality regarding the
 *         Dashboard of the application
 * 
 */
public class DashboardFragment extends SherlockFragment implements
        OnClickListener {

    private final String CLASS_NAME = getClass().getName();

    // Widgets
    private ImageButton scanBtn, searchBtn, bookmarsBtn;

    @Override
    public void onActivityCreated(final Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);

        final View view = getView();
        scanBtn = (ImageButton) view.findViewById(R.id.scan_btn);
        searchBtn = (ImageButton) view.findViewById(R.id.search_btn);
        bookmarsBtn = (ImageButton) view.findViewById(R.id.bookmarks_btn);

        scanBtn.setOnClickListener(this);
        searchBtn.setOnClickListener(this);
        bookmarsBtn.setOnClickListener(this);
    }

    @Override
    public View onCreateView(final LayoutInflater inflater,
            final ViewGroup container, final Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dashboard, container, false);
    }

    @Override
    public void onCreateOptionsMenu(final Menu menu, final MenuInflater inflater) {
        inflater.inflate(R.menu.menu, menu);
    }

    @Override
    public void onClick(final View v) {

        final int viewId = v.getId();
        if (viewId == R.id.scan_btn) {
            final IntentIntegrator intent = new IntentIntegrator(
                    getSherlockActivity());
            intent.initiateScan();
        } else if (viewId == R.id.search_btn) {

        } else if (viewId == R.id.bookmarks_btn) {
        }

    }

    @Override
    public void onActivityResult(final int requestCode, final int resultCode,
            final Intent intent) {
        Log.d(CLASS_NAME, "onActivityResult");
        final IntentResult scanResult = IntentIntegrator.parseActivityResult(
                requestCode, resultCode, intent);
        if (scanResult != null) {
            ;
        }
        Log.d(CLASS_NAME, "scan result: " + scanResult.getContents());
    }

}
