package com.yupanweather.app.util;
//�ӿ�
public interface HttpCallbackListener {
	void onFinish(String response);

	void onError(Exception e);

}
