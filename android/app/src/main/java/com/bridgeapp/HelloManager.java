package main.java.com.bridgeapp;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class HelloManager extends ReactContextBaseJavaModule{ // React tells that this is a module
    public HelloManager(ReactApplicationContext reactContext){  // provide context - its like this of application - to get the native things access
        super(reactContext);
        // reactContext.getResource();
    }

    @Override
    public String getName(){
        return "HelloManager";
        // NativeModules.HelloManager.greetUser("name", true);
    }

    @ReactMethod
    public void greetUser(String name, Boolean isAdmin, Promise callback){
        System.out.println("User name " + name + " Administrator " + isAdmin);
        
        String greeting = "Welcome " + name + "   " + isAdmin;
        callback.resolve(greeting); // in try
        // callback.reject(greeting); // in catch
    }

}