import org.xiaoya.audio.mp3.MP3AudioHeader;
import org.xiaoya.util.constant.enums.ID3V1TagEnum;

import java.io.File;

public class Text {
    public static void main(String[] args) {

        /*Comment1(97,28){
            //Reserved(125,1)
            //Track(126,1)
            class CommentEnum{
                private int start;
                private int length;

                public CommentEnum(int start, int length) {
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
            public CommentEnum getReserved() {
                return new CommentEnum(125,1);
            }
            public CommentEnum getTrack() {
                return new CommentEnum(126,1);
            }
        },*/
        File file=new File("C:\\Users\\xiaoya\\Desktop\\fanbianyi\\格子兮 - 西塘有雨 [mqms2].mp3");
        MP3AudioHeader mp3AudioHeader = new MP3AudioHeader(file);
    }
}
