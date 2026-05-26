/*
 * Copyright (C) 2019 MILLAU Julien
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.devnied.emvnfccard.iso7816emv.impl;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;
import com.github.devnied.emvnfccard.iso7816emv.EmvTags;
import com.github.devnied.emvnfccard.iso7816emv.ITerminal;
import com.github.devnied.emvnfccard.iso7816emv.TagAndLength;
import com.github.devnied.emvnfccard.iso7816emv.TerminalTransactionQualifiers;
import com.github.devnied.emvnfccard.model.enums.CountryCodeEnum;
import com.github.devnied.emvnfccard.model.enums.CurrencyEnum;
import com.github.devnied.emvnfccard.model.enums.TransactionTypeEnum;
import fr.devnied.bitlib.BytesUtils;

/**
 * Factory to create default terminal implementation
 *
 * @author Millau Julien
 */
public final class DefaultTerminalImpl implements ITerminal {

    /**
     * Random
     */
    private static final SecureRandom random = new SecureRandom();

    /**
     * Country code
     */
    private CountryCodeEnum countryCode = CountryCodeEnum.FR;

    /**
     * Method used to construct value from tag and length
     *
     * @param pTagAndLength
     *            tag and length value
     * @return tag value in byte
     */
    @Override
    public byte[] constructValue(final TagAndLength pTagAndLength) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Setter for the field countryCode
     *
     * @param countryCode
     *            the countryCode to set
     */
    public void setCountryCode(final CountryCodeEnum countryCode) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
