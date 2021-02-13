package com.example.parstagram;

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
                .applicationId("CxSxIWcRi6Bq6lsOmuDQAFEZR3NdFUr1Nj2KWsr0")
                .clientKey("hT6azlDUGeIma47pAfpOW0iflnpUaZsmDuueqkG5")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
