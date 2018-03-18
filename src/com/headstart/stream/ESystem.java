package com.headstart.stream;

import java.io.PrintStream;

public class ESystem {
    private ESystem(PrintStream stream, Runnable init, Runnable loop) {
        init.run();
        Thread thread = new Thread(loop);

    }

    public static ESystem getInstance(PrintStream stream, Runnable init, Runnable loop) {
        return new ESystem(stream, init, loop);
    }

    public static ESystem getInstance(Runnable init, Runnable loop) {
        return new ESystem(System.out, init, loop);
    }
}
