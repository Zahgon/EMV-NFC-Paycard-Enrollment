package com.github.devnied.emvnfccard.iso7816emv.impl;

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
import java.util.Arrays;
import com.github.devnied.emvnfccard.enums.TagTypeEnum;
import com.github.devnied.emvnfccard.enums.TagValueTypeEnum;
import com.github.devnied.emvnfccard.iso7816emv.ITag;
import fr.devnied.bitlib.BytesUtils;

/**
 * @author sasc
 */
public final class TagImpl implements ITag {

    private final byte[] idBytes;

    public final String name;

    private final String description;

    private final TagValueTypeEnum tagValueType;

    private final Class tagClass;

    private final TagTypeEnum type;

    public TagImpl(final String id, final TagValueTypeEnum tagValueType, final String name, final String description) {
        this(BytesUtils.fromString(id), tagValueType, name, description);
    }

    public TagImpl(final byte[] idBytes, final TagValueTypeEnum tagValueType, final String name, final String description) {
        if (idBytes == null) {
            throw new IllegalArgumentException("Param id cannot be null");
        }
        if (idBytes.length == 0) {
            throw new IllegalArgumentException("Param id cannot be empty");
        }
        if (tagValueType == null) {
            throw new IllegalArgumentException("Param tagValueType cannot be null");
        }
        this.idBytes = idBytes;
        this.name = name;
        this.description = description;
        this.tagValueType = tagValueType;
        if (BytesUtils.matchBitByBitIndex(this.idBytes[0], 5)) {
            type = TagTypeEnum.CONSTRUCTED;
        } else {
            type = TagTypeEnum.PRIMITIVE;
        }
        // Bits 8 and 7 of the first byte of the tag field indicate a class.
        // The value 00 indicates a data object of the universal class.
        // The value 01 indicates a data object of the application class.
        // The value 10 indicates a data object of the context-specific class.
        // The value 11 indicates a data object of the private class.
        byte classValue = (byte) (this.idBytes[0] >>> 6 & 0x03);
        switch(classValue) {
            case (byte) 0x01:
                tagClass = Class.APPLICATION;
                break;
            case (byte) 0x02:
                tagClass = Class.CONTEXT_SPECIFIC;
                break;
            case (byte) 0x03:
                tagClass = Class.PRIVATE;
                break;
            default:
                tagClass = Class.UNIVERSAL;
                break;
        }
    }

    @Override
    public boolean isConstructed() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public byte[] getTagBytes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getDescription() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public TagValueTypeEnum getTagValueType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public TagTypeEnum getType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Class getTagClass() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(final Object other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int getNumTagBytes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
