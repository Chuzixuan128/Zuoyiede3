package com.example.demo3.view;


import com.example.demo3.base.BaseView;
import com.example.demo3.bean.MeiNvBean;

public interface MeiNvView extends BaseView {
    void onFail(String mag);

    void onSuccess(MeiNvBean meiNvBean);
}
