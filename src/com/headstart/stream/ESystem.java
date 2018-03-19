/*
 * Copyright (c) 2018. Liam Cole
 * This class is part of a public project, HeadStart
 */

package com.headstart.stream;

import java.io.PrintStream;

public class ESystem {
    private ESystem(PrintStream stream, Runnable init, Runnable loop) {
        stream.println("ESystem: Begin init");
        init.run();
        stream.println("ESys");
        Thread thread = new Thread(loop);
        thread.start();
    }

    public static ESystem getInstance(PrintStream stream, Runnable init, Runnable loop) {
        return new ESystem(stream, init, loop);
    }

    public static ESystem getInstance(Runnable init, Runnable loop) {
        return new ESystem(System.out, init, loop);
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

    public static ValidData validata(InvalidData invalidData) {
        return (ValidData) invalidData.getNewInstance();
    }
}
