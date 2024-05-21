package org.xiaoya.util;

import org.xiaoya.util.constant.enums.ID3V1TagEnum;

import java.io.UnsupportedEncodingException;

public class StringUtils {
    private static String readString(byte[] bytes, ID3V1TagEnum id3V1TagEnum,String charsetName) throws UnsupportedEncodingException {
        return new String(bytes,id3V1TagEnum.getStart(),id3V1TagEnum.getLength(),charsetName);
    }
}
