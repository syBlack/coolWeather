package com.syblack.coolweather.util;

/**
 * Created by hhy on 2016/12/5.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
