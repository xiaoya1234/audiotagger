package org.xiaoya.constant.enums.mp3;

import static org.xiaoya.constant.consist.ID3Consist.ID3V1_HEADER_LENGTH_30;

public enum ID3V1TagHeaderEnum {
    TAG(0,3),
    TITLE(3, ID3V1_HEADER_LENGTH_30),
    ARTIST(33,ID3V1_HEADER_LENGTH_30),
    ALBUM(63,ID3V1_HEADER_LENGTH_30),
    YEAR(93,4),
    COMMENT(97,28),
    RESERVED(125,1),
    TRACK(126,1),
    GENRE(127,1);
    private final int start;
    private final int length;
    private final int end;

    ID3V1TagHeaderEnum(int start, int length) {
        this.start = start;
        this.length = length;
        end=start+length;
    }

    public int getStart() {
        return start;
    }
    public int getEnd(){
        return end;
    }
    public int getLength() {
        return length;
    }
}
