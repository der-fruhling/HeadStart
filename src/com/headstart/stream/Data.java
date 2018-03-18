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
