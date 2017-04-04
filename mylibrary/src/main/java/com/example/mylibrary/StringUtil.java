package com.example.mylibrary;

import android.support.annotation.NonNull;

/**
 * Created by tancho on 4/4/17.
 */

public class StringUtil {

    public
    @NonNull
    String[] splitString(@NonNull String sbstring, @NonNull String string) {
        return string.split(sbstring);
    }
}
