package com.example.mylibrary;

import android.content.Context;
import android.util.Log;

/**
 * Created by tancho on 3/15/17.
 */

public class SampleSDK {
    public static final void runSdk() {

        //lint error
        String hardwarePropertiesService = Context.HARDWARE_PROPERTIES_SERVICE;

        //findbugs warning

        //pmd warning
        try {
            Calculator calculator = new Calculator();
            calculator.add(3, 5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //infer error
        StringUtil util = new StringUtil();
        util.splitString(null, null);

        //checkstyle error
        Log.e("SDK", "SDK Started");

    }
}
