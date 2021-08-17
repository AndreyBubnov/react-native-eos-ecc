package com.reactnativeeosecc;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

import io.plactal.ecc.service.EosService;

@ReactModule(name = EosEccModule.NAME)
public class EosEccModule extends ReactContextBaseJavaModule {
    public static final String NAME = "EosEcc";

    public EosEccModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    @NonNull
    public String getName() {
        return NAME;
    }


    // Example method
    // See https://reactnative.dev/docs/native-modules-android
    @ReactMethod
    public void sign(String data, String privateKey, Promise promise) {
      String signature = EosService.signText(data, privateKey);
      promise.resolve(signature);
    }

    public static native int nativeMultiply(int a, int b);
}
