package org.xiaoya.util.constant.enums.mp3;

public enum ID3V2TagHeaderEnum {
    FRAMEID(0,4),
    SIZE(4,4),
    FLAGS(8,2);
    private final int start;
    private final int length;
    private final int end;

    ID3V2TagHeaderEnum(int start, int length) {
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
