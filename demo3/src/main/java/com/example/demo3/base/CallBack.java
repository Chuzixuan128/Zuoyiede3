package com.example.demo3.base;

public interface CallBack<T> {

    void onSuccess(T t);
    void onFail(String mag);
}
