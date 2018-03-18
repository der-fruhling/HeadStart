package com.headstart.stream;

import java.util.HashMap;

public class Message {
    public static HashMap<Integer, ? extends Data> receive(DataStream<? extends Data> dataStream) {
        return dataStream.getMap();
    }

    public static boolean isValid(Data data) {
        return (data instanceof ValidData);
    }
}
