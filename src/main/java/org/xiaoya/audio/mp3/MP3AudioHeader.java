package org.xiaoya.audio.mp3;

import org.xiaoya.util.AudioFile;
import org.xiaoya.util.AudioHeader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class MP3AudioHeader extends AudioHeader {
    private File file;
    private ByteBuffer byteBuffer;
    private RandomAccessFile rand;
    private FileChannel fChannel;

    public MP3AudioHeader(File file) throws FileNotFoundException {
        super(file);
    }
    @Override
    public AudioFile read() {

        return null;
    }

}
