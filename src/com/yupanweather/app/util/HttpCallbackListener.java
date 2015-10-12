package com.yupanweather.app.util;
//½Ó¿Ú
public interface HttpCallbackListener {
	void onFinish(String response);

	void onError(Exception e);

}
