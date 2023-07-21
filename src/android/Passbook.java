package com.example.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class Passbook extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
		return false;
    }
	
    public boolean available(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
		return false;
    }
	
    public boolean downloadPass(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
		return false;
    }
	
    public boolean addPass(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
		return false;
    }
}
