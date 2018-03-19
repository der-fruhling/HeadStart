/*
 * Copyright (c) 2018. Liam Cole
 * This class is part of a public project, HeadStart
 */

package com.headstart.stream;

public class InvalidDataExecption extends Exception {
    public InvalidDataExecption() {
        super();
    }

    public InvalidDataExecption(String message) {
        super(message);
    }

    public InvalidDataExecption(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidDataExecption(Throwable cause) {
        super(cause);
    }

    protected InvalidDataExecption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
