/*
 * Copyright (c) 2018. Liam Cole
 * This class is part of a public project, HeadStart
 */

/*
 * Copyright (c) 2018. Liam Cole
 * This class is part of a public project, HeadStart
 */

package com.liamiam.simonsgame;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private FileWriter mFileWriter;

    public Logger(FileWriter fileWriter) {
        this.mFileWriter = fileWriter;
    }

    public void info(String i) {
        System.out.println("\u001b[32;1m[INFO]\u001b[32m " + i + "\u001b[0m");
        try {
            mFileWriter.write("[INFO] " + i);
            mFileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void warn(String w) {
        System.out.println("\u001b[33;1m[WARN] " + w);
        try {
            mFileWriter.write("[WARN] " + w);
            mFileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void error(String e) {
        System.out.println("\u001b[31;1m[ERR] " + e);
        try {
            mFileWriter.write("[ERR] " + e);
            mFileWriter.flush();
        } catch (IOException e0) {
            e0.printStackTrace();
        }
    }

    public void fatal(String f) {
        System.out.println("\u001b[31;4;1m[FATAL] " + f);
        try {
            mFileWriter.write("[FATAL] " + f);
            mFileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fatal(String f, Throwable e) {
        System.out.println("\u001b[31;4;1m[FATAL] " + f + "\u001b[0m");
        e.printStackTrace();
        try {
            mFileWriter.write("[FATAL] " + f);
            mFileWriter.flush();
        } catch (IOException e0) {
            e0.printStackTrace();
        }
    }
}
