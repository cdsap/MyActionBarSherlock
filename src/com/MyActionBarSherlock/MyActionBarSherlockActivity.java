package com.MyActionBarSherlock;


import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.SubMenu;

import android.app.Activity;
import android.os.Bundle;

public class MyActionBarSherlockActivity extends SherlockActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        SubMenu subMenu1 = menu.addSubMenu("Action Item");
        subMenu1.add("Sample");
        subMenu1.add("Menu");
        subMenu1.add("Items");

        MenuItem subMenu1Item = subMenu1.getItem();
        subMenu1Item.setIcon(R.drawable.ic_launcher);
        subMenu1Item.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS | MenuItem.SHOW_AS_ACTION_WITH_TEXT);

        SubMenu subMenu2 = menu.addSubMenu("Overflow Item");
        subMenu2.add("These");
        subMenu2.add("Are");
        subMenu2.add("Sample");
        subMenu2.add("Items");

        MenuItem subMenu2Item = subMenu2.getItem();
        subMenu2Item.setIcon(R.drawable.ic_launcher);

        return super.onCreateOptionsMenu(menu);
    }

}