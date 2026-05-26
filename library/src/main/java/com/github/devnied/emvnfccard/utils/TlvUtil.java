package com.github.devnied.emvnfccard.utils;

/*
 * Copyright 2010 sasc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import com.github.devnied.emvnfccard.enums.SwEnum;
import com.github.devnied.emvnfccard.enums.TagValueTypeEnum;
import com.github.devnied.emvnfccard.exception.TlvException;
import com.github.devnied.emvnfccard.iso7816emv.EmvTags;
import com.github.devnied.emvnfccard.iso7816emv.ITag;
import com.github.devnied.emvnfccard.iso7816emv.TLV;
import com.github.devnied.emvnfccard.iso7816emv.TagAndLength;
import fr.devnied.bitlib.BytesUtils;
import net.sf.scuba.tlv.TLVInputStream;
import net.sf.scuba.tlv.TLVUtil;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * List of utils methods to manipulate TLV
 *
 * @author MILLAU Julien
 */
public final class TlvUtil {

    // Class logger
    private static final Logger LOGGER = LoggerFactory.getLogger(TlvUtil.class);

    /**
     * Method used to find Tag with ID
     *
     * @param tagIdBytes
     *            the tag to find
     * @return the tag found
     */
    private static ITag searchTagById(final int tagId) {
        return EmvTags.getNotNull(TLVUtil.getTagAsBytes(tagId));
    }

    // This is just a list of Tag And Lengths (eg DOLs)
    public static String getFormattedTagAndLength(final byte[] data, final int indentLength) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static TLV getNextTLV(final TLVInputStream stream) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used get Tag value as String
     *
     * @param tag
     *            tag type
     * @param value
     *            tag value
     * @return
     */
    private static String getTagValueAsString(final ITag tag, final byte[] value) {
        StringBuilder buf = new StringBuilder();
        switch(tag.getTagValueType()) {
            case TEXT:
                buf.append("=");
                buf.append(new String(value));
                break;
            case NUMERIC:
                buf.append("NUMERIC");
                break;
            case BINARY:
                buf.append("BINARY");
                break;
            case MIXED:
                buf.append("=");
                buf.append(getSafePrintChars(value));
                break;
            case DOL:
                break;
            default:
                break;
        }
        return buf.toString();
    }

    /**
     * Method used to parser Tag and length
     *
     * @param data
     *            data to parse
     * @return tag and length
     */
    public static List<TagAndLength> parseTagAndLength(final byte[] data) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static String prettyPrintAPDUResponse(final byte[] data) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to get the list of TLV inside the parameter tag specified in parameter
     *
     * @param pData
     *            data to parse
     * @param pTag
     *            tag to find
     * @param pAdd
     *           boolean to indicate if we nned to add the tlv to the return list
     * @return the list of TLV tag inside
     */
    public static List<TLV> getlistTLV(final byte[] pData, final ITag pTag, final boolean pAdd) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to get the list of TLV corresponding to tags specified in parameters
     *
     * @param pData
     *            data to parse
     * @param pTag
     *            tags to find
     * @return the list of TLV
     */
    public static List<TLV> getlistTLV(final byte[] pData, final ITag... pTag) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to get Tag value
     *
     * @param pData
     *            data
     * @param pTag
     *            tag to find
     * @return tag value or null
     */
    public static byte[] getValue(final byte[] pData, final ITag... pTag) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static String prettyPrintAPDUResponse(final byte[] data, final int indentLength) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static String getSpaces(final int length) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static String prettyPrintHex(final String in, final int indent) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static String prettyPrintHex(final byte[] data) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static String prettyPrintHex(final String in, final int indent, final boolean wrapLines) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static String getSafePrintChars(final byte[] byteArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static String getSafePrintChars(final byte[] byteArray, final int startPos, final int length) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to get length of all Tags
     *
     * @param pList
     *            tag length list
     * @return the sum of tag length
     */
    public static int getLength(final List<TagAndLength> pList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Private constructor
     */
    private TlvUtil() {
    }
}
