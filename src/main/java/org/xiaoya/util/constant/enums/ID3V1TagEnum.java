package org.xiaoya.util.constant.enums;

import static org.xiaoya.util.constant.consist.ID3Consist.ID3V1_HEADER_LENGTH;

public enum ID3V1TagEnum {
    TAG(0,3),
    TITLE(3, ID3V1_HEADER_LENGTH),
    ARTIST(33,ID3V1_HEADER_LENGTH),
    ALBUM(63,ID3V1_HEADER_LENGTH),
    YEAR(93,4),
    COMMENT(97,ID3V1_HEADER_LENGTH),
    GENRE(127,1);
    private final int start;
    private final int length;

    ID3V1TagEnum(int start, int length) {
        this.start = start;
        this.length = length;
    }

    public int getStart() {
        return start;
    }

    public int getLength() {
        return length;
    }
}
