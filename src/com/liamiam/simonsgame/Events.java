/*
 * Copyright (c) 2018. Liam Cole
 * This class is part of a public project, HeadStart
 */

package com.liamiam.simonsgame;

public class Events {
    public static void init(Event event) {
        init0(event);
    }

    private static void init0(Event event) {
        killIfNull(event);
        event.init();
    }

    private static boolean isNull(Object object) {
        return object == null;
    }

    private static void killIfNull(Object object) {
        if(object == null) throw new NullPointerException();
    }
}
