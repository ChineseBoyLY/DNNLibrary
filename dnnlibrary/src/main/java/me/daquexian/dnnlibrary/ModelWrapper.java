package me.daquexian.dnnlibrary;

import android.content.res.AssetManager;

/**
 * Created by daquexian on 2017/11/12.
 * Java wrapper for ModelBuilder and Model
 */

public class ModelWrapper {

    static {
        System.loadLibrary( "dnnlibrary");
    }

    public static final int PREFERENCE_LOW_POWER = 0;
    public static final int PREFERENCE_FAST_SINGLE_ANSWER = 1;
    public static final int PREFERENCE_SUSTAINED_SPEED = 2;
    public static native void readFile(AssetManager assetManager, String filename);
    public static native void setOutput(String blobName);
    public static native void compile(int preference);
    public static native float[] predict(float[] input);
    public static native void clear();
}
