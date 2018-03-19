/*
 * Copyright (c) 2018. Liam Cole
 * This class is part of a public project, HeadStart
 */

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
