
package com.buglife;

import com.buglife.sdk.BuglifeListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

public class RNBuglifeListener implements BuglifeListener {

  private final ReactApplicationContext reactContext;

  public RNBuglifeListener(ReactApplicationContext reactContext) {
    super();
    this.reactContext = reactContext;
  }

  public void onAttachmentRequest() {
    WritableMap params = Arguments.createMap(); // trigger with empty payload
    sendEvent(reactContext, "BuglifeAttachmentRequest", params);
  }

  @ReactMethod
  private void sendEvent(ReactContext reactContext,
                         String eventName,
                         WritableMap params) {
      reactContext
              .getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)
              .emit(eventName, params);
  }
 

}