package com.br.creditcard.common.utils;

import java.io.File;
import java.io.IOException;

/**
 * Created by jjs on 2018/5/17.
 */
public class FileUtils {


    public static File createFile(File file) throws IOException {
        if (!file.exists()) {
            makeDir(file.getParentFile());
        }
        file.createNewFile();
        return file;
    }

    public static void makeDir(File dir) {
        if (!dir.getParentFile().exists()) {
            makeDir(dir.getParentFile());
        }
        dir.mkdir();
    }
}
