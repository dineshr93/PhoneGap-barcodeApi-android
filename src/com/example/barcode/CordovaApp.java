/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
 */

package com.example.barcode;

import org.apache.cordova.CordovaActivity;
import org.json.JSONException;
import org.json.JSONObject;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.EditText;

public class CordovaApp extends CordovaActivity
{
	WebView webview;
	EditText fnameEditText;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.init();
        loadUrl(launchUrl);
		/*setContentView(R.layout.activity_main);
		fnameEditText = (EditText)this.findViewById(R.id.fnameEditText);
		webview = (WebView)this.findViewById(R.id.webView);*/
        
       
    }
    
/*
	@SuppressLint({ "SetJavaScriptEnabled", "JavascriptInterface" })
	@Override
	public void onStart() {
    	super.onStart();
    	 // Set by <content src="index.html" /> in config.xml
//        loadUrl(launchUrl);
        
       WebSettings webSettings = webview.getSettings();
    	webSettings.setJavaScriptEnabled(true);
    	webview.loadUrl(launchUrl);
    	
    	webview.addJavascriptInterface(new WebViewInterface(this), "Android");
    	
	}
    
    
    
    public class WebViewInterface {
	    Context mContext;

	    *//** Instantiate the interface and set the context *//*
	    WebViewInterface(Context c) {
	        mContext = c;
	    }

	    
	     * Uncomment if compiling for Android 4.2
	     * @JavascriptInterface
	     
	    public void updateNames(String namesJsonString) {
	    	Log.d(getPackageName(), "Sent from webview: " + namesJsonString);
	    	try {
				
	    		JSONObject namesJson = new JSONObject(namesJsonString);
				final String firstName = namesJson.getString("results");  
				

				// When invoked from Javascript this is executed on a thread other than the UI thread
				// Since we want to update the native UI controls we must create a runnable for the main UI thread.
		    	runOnUiThread(new Runnable() {
		            public void run() {
		            	fnameEditText.setText(firstName);
		            
		            }
		        });

	    	} catch (JSONException e) {
				Log.e(getPackageName(), "Failed to create JSON object from web view data");
			}
	    	
	    }
	    
	}*/
}
