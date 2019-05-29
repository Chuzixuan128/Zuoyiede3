package com.example.demo3.base;

import io.reactivex.disposables.CompositeDisposable;

public abstract class BaseModel {

    protected CompositeDisposable mCompositeDisposable = new CompositeDisposable();


    public void destroy() {
        mCompositeDisposable.clear();
    }
}
