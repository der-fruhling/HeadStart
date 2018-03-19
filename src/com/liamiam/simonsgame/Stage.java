/*
 * Copyright (c) 2018. Liam Cole
 * This class is part of a public project, HeadStart
 */

/*
 * Copyright (c) 2018. Liam Cole
 * This class is part of a public project, HeadStart
 */

package com.liamiam.simonsgame;

public class Stage {
    private static long value;

    private Stage() {

    }

    public long getValue() {
        return value;
    }

    private void setValue(long value) {
        Stage.value = value;
    }

    public static Stage getStage() {
        Stage s = new Stage();
        s.setValue((long) (Math.random() * 5));
        return s;
    }

    public static Stage getStage(long a) {
        Stage s = new Stage();
        s.setValue(a);
        return s;
    }
}
