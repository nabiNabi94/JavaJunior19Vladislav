package Lesson19;

import Lesson18.CopyFile;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CopyWithCommanI0 implements CopyFile {
    @Override
    public void copy(String from, String to) throws IOException {
        File source = new File(from);
        File dest = new File(to);
        FileUtils.copyFile(source, dest);
    }
}
