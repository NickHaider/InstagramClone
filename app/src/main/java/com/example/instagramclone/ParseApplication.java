package com.example.instagramclone;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("rXE1Xobe1K4RLq3Qots8phWD0tApuVFaVRhjTxzJ")
                .clientKey("qEsNkoZjjfaN8u5TbwBrDKr198L2L9IwfxS2SSkP")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
