/*
 * Copyright (c) 2018. Liam Cole
 * This class is part of a public project, HeadStart
 */

package com.headstart.stream;

public class Data<T> {
    private T data = null;

    public T getData() {
        return data;
    }

    public Data getNewInstance() {
        return new Data();
    }

    public void printData() {
        if(data instanceof String) {
            System.out.println(data);
        } else {
            System.out.println(data.toString());
        }
    }
}
