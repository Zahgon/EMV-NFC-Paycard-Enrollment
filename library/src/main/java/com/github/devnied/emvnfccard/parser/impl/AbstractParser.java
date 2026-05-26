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
package com.github.devnied.emvnfccard.parser.impl;

import com.github.devnied.emvnfccard.enums.CommandEnum;
import com.github.devnied.emvnfccard.exception.CommunicationException;
import com.github.devnied.emvnfccard.iso7816emv.EmvTags;
import com.github.devnied.emvnfccard.iso7816emv.TagAndLength;
import com.github.devnied.emvnfccard.model.EmvTransactionRecord;
import com.github.devnied.emvnfccard.model.enums.CurrencyEnum;
import com.github.devnied.emvnfccard.parser.EmvTemplate;
import com.github.devnied.emvnfccard.parser.IParser;
import com.github.devnied.emvnfccard.utils.CommandApdu;
import com.github.devnied.emvnfccard.utils.ResponseUtils;
import com.github.devnied.emvnfccard.utils.TlvUtil;
import com.github.devnied.emvnfccard.utils.TrackUtils;
import fr.devnied.bitlib.BytesUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/**
 * Abstract Parser with provider attribute
 *
 * @author MILLAU Julien
 */
public abstract class AbstractParser implements IParser {

    /**
     * Class Logger
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractParser.class);

    /**
     * Unknown response
     */
    public static final int UNKNOW = -1;

    /**
     * Card provider used
     */
    protected final WeakReference<EmvTemplate> template;

    /**
     * Default protected constructor
     *
     * @param pTemplate
     *            Emv template
     */
    protected AbstractParser(EmvTemplate pTemplate) {
        template = new WeakReference<EmvTemplate>(pTemplate);
    }

    /**
     * Select application with AID or RID
     *
     * @param pAid
     *            byte array containing AID or RID
     * @return response byte array
     * @throws CommunicationException communication error
     */
    protected byte[] selectAID(final byte[] pAid) throws CommunicationException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to extract application label
     *
     * @param pData
     * 			raw response data
     *
     * @return decoded application label or null
     */
    protected String extractApplicationLabel(final byte[] pData) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Extract bank data (BIC and IBAN)
     *
     * @param pData
     *            card data
     */
    protected void extractBankData(final byte[] pData) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Extract card holder lastname and firstname
     *
     * @param pData
     *            card data
     */
    protected void extractCardHolderName(final byte[] pData) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to extract Log Entry from Select response
     *
     * @param pSelectResponse
     *            select response
     * @return byte array
     */
    protected byte[] getLogEntry(final byte[] pSelectResponse) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to get Transaction counter
     *
     * @return the number of card transaction
     * @throws CommunicationException communication error
     */
    protected int getTransactionCounter() throws CommunicationException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to get the number of pin try left
     *
     * @return the number of pin try left
     * @throws CommunicationException communication error
     */
    protected int getLeftPinTry() throws CommunicationException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to get log format
     *
     * @return list of tag and length for the log format
     * @throws CommunicationException communication error
     */
    protected List<TagAndLength> getLogFormat() throws CommunicationException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to extract log entry from card
     *
     * @param pLogEntry
     *            log entry position
     * @return list of transaction records
     * @throws CommunicationException communication error
     */
    protected List<EmvTransactionRecord> extractLogEntry(final byte[] pLogEntry) throws CommunicationException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
