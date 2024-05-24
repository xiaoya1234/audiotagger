package org.xiaoya.util;

import java.io.File;

public class AudioFile {
    private File file;
    private AudioTag tag;
    private AudioHeader header;

    public AudioFile(File file, AudioTag tag, AudioHeader header) {
        this.file = file;
        this.tag = tag;
        this.header = header;
    }
}
