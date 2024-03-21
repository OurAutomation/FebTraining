package org.exceptions;

import java.io.File;

public class FileUtils {
    public void listOnlyFilesFromTheGivenFolder(String filePath) throws NotADirectoryException {
        File file = new File(filePath);
        if(!file.isDirectory()) {
            throw new NotADirectoryException("Given path doesn't exist or it is not a directory");
        } else {
            throw new CausedDuringRuntime("");
        }
    }
}
