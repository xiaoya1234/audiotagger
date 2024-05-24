package org.xiaoya.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class AudioHeader {
    private File file;
    private ByteBuffer byteBuffer;
    private RandomAccessFile rand;
    private FileChannel fChannel;
    public AudioHeader(File file) throws FileNotFoundException {
        this.file=file;
        init();
    }
    private void init() throws FileNotFoundException {
        rand=new RandomAccessFile(file,"rw");
        fChannel=rand.getChannel();
    }
    public AudioFile read(){
        return null;
    }

    public File getFile() {
        return file;
    }

    public ByteBuffer getByteBuffer() {
        return byteBuffer;
    }

    public RandomAccessFile getRand() {
        return rand;
    }

    public FileChannel getfChannel() {
        return fChannel;
    }

    public void setByteBuffer(ByteBuffer byteBuffer) {
        this.byteBuffer = byteBuffer;
    }
    public void close() throws IOException {
        if (rand!=null){
            rand.close();
        }
        if (fChannel!=null){
            fChannel.close();
        }
    }
}
