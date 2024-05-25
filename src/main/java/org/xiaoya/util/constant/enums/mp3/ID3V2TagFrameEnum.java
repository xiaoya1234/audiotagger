package org.xiaoya.util.constant.enums.mp3;

public enum ID3V2TagFrameEnum {
    ID3(0,3),
    VER(3,1),
    REVISION(4,1),
    FLAG(5,1),
    SIZE(6,4);
    private final int start;
    private final int length;
    private final int end;

    ID3V2TagFrameEnum(int start, int length) {
        this.start = start;
        this.length = length;
        end=start+length;
    }

    public int getStart() {
        return start;
    }

    public int getLength() {
        return length;
    }

    public int getEnd() {
        return end;
    }
}
