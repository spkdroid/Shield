package com.soln.shield;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.widget.Toast;

public class Shield {

    public static boolean isDeveloperModeOn(Context c) {
            if(Integer.parseInt(Build.VERSION.SDK) == 16) {
                return Settings.Secure.getInt(c.getContentResolver(),
                        Settings.Secure.DEVELOPMENT_SETTINGS_ENABLED , 0) != 0;
            } else if (Integer.parseInt(Build.VERSION.SDK) >= 17) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                    return Settings.Secure.getInt(c.getContentResolver(),
                            Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0) != 0;
                }
            }
        return false;
    }



}