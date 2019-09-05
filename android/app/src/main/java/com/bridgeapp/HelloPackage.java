package main.java.com.bridgeapp;

public class HelloPackage implements ReactPackage{

    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules(){
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext){
        return Collections.emptyList();  // for exposing view - android view will be shown in react
    }

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext){
        List<NativeModule> modules = new ArrayList<>();
        modules.add(new HelloManager(reactContext));
        return modules;
    }

}