package com.example.mylibrary;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by tancho on 3/15/17.
 */

public class SampleSDK {
    public static final void runSdk() {

        //lint error
        String hardwarePropertiesService = Context.HARDWARE_PROPERTIES_SERVICE;

        //findbugs warning
        try {

            FileReader fr = new FileReader("some_file");
            BufferedReader br = new BufferedReader(fr);

            String sCurrentLine;

            br = new BufferedReader(new FileReader("Some_file"));

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }

        } catch (IOException e) {
            
        }

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
