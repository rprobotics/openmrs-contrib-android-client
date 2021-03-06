package org.openmrs.mobile.utilities;

import android.content.SharedPreferences;

import org.openmrs.mobile.application.OpenMRS;

public class ThemeUtils {
    public static boolean isDarkModeActivated() {
        SharedPreferences defaultSharedPref = OpenMRS.getInstance().getOpenMRSSharedPreferences();
        return defaultSharedPref.getBoolean(ApplicationConstants.OpenMRSThemes.KEY_DARK_MODE, false);
    }

    public static void setDarkMode(boolean darkMode) {
        SharedPreferences.Editor editor = OpenMRS.getInstance().getOpenMRSSharedPreferences().edit();
        editor.putBoolean(ApplicationConstants.OpenMRSThemes.KEY_DARK_MODE, darkMode);
        editor.apply();
    }
}
