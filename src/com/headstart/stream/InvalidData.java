/*
 * Copyright (c) 2018. Liam Cole
 * This class is part of a public project, HeadStart
 */

package com.headstart.stream;

import com.liamiam.simonsgame.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class InvalidData extends Data<InvalidData> {
    @Override
    public Data getNewInstance() {
        try {
            Logger logger = new Logger(new FileWriter(new File("~/Downloads/headstartlog.mew")));
            logger.warn("Passing InvalidData to a method wanting valid data will throw an InvalidDataExeption. Fix: use ESystem.validata() and pass it your InvalidData and it will return ValidData");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.getNewInstance();
    }
}
