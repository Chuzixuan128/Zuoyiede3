package com.example.demo3.presenter;


import com.example.demo3.base.BasePresenter;
import com.example.demo3.base.CallBack;
import com.example.demo3.bean.MeiNvBean;
import com.example.demo3.model.MeiNvModel;
import com.example.demo3.view.MeiNvView;

public class MeiNvPresenter extends BasePresenter<MeiNvView, MeiNvModel> {


    public void getData() {
        myModel.getData(new CallBack<MeiNvBean>() {
            @Override
            public void onSuccess(MeiNvBean meiNvBean) {
                myView.onSuccess(meiNvBean);
            }

            @Override
            public void onFail(String mag) {
                myView.onFail(mag);
            }
        });
    }
}
