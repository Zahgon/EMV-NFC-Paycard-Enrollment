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
import com.github.devnied.emvnfccard.enums.EmvCardScheme;
import com.github.devnied.emvnfccard.enums.SwEnum;
import com.github.devnied.emvnfccard.exception.CommunicationException;
import com.github.devnied.emvnfccard.iso7816emv.EmvTags;
import com.github.devnied.emvnfccard.iso7816emv.TagAndLength;
import com.github.devnied.emvnfccard.model.Afl;
import com.github.devnied.emvnfccard.model.Application;
import com.github.devnied.emvnfccard.model.EmvCard;
import com.github.devnied.emvnfccard.model.enums.ApplicationStepEnum;
import com.github.devnied.emvnfccard.model.enums.CardStateEnum;
import com.github.devnied.emvnfccard.parser.EmvTemplate;
import com.github.devnied.emvnfccard.utils.CommandApdu;
import com.github.devnied.emvnfccard.utils.ResponseUtils;
import com.github.devnied.emvnfccard.utils.TlvUtil;
import com.github.devnied.emvnfccard.utils.TrackUtils;
import fr.devnied.bitlib.BytesUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Emv default Parser <br>
 *
 * Paypass: <br>
 * - https://www.paypass.com/pdf/public_documents/Terminal%20
 * Optimization%20v2-0.pdf
 *
 * @author julien
 */
public class EmvParser extends AbstractParser {

    /**
     * Class Logger
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(EmvParser.class);

    /**
     * Default EMV pattern
     */
    private static final Pattern PATTERN = Pattern.compile(".*");

    /**
     * Default constructor
     *
     * @param pTemplate
     *            parser template
     */
    public EmvParser(EmvTemplate pTemplate) {
        super(pTemplate);
    }

    @Override
    public Pattern getId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean parse(Application pApplication) throws CommunicationException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Read public card data from parameter AID
     *
     * @param pApplication
     *            application data
     * @return true if succeed false otherwise
     * @throws CommunicationException communication error
     */
    protected boolean extractPublicData(final Application pApplication) throws CommunicationException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to find the real card scheme
     *
     * @param pAid
     *            card complete AID
     * @param pCardNumber
     *            card number
     * @return card scheme
     */
    protected EmvCardScheme findCardScheme(final String pAid, final String pCardNumber) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to parse EMV card
     *
     * @param pSelectResponse
     *            select response data
     * @param pApplication
     *            application selected
     * @return true if the parsing succeed false otherwise
     * @throws CommunicationException communication error
     */
    protected boolean parse(final byte[] pSelectResponse, final Application pApplication) throws CommunicationException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to extract commons card data
     *
     * @param pGpo
     *            global processing options response
     * @return true if the extraction succeed
     * @throws CommunicationException communication error
     */
    protected boolean extractCommonsCardData(final byte[] pGpo) throws CommunicationException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Extract list of application file locator from Afl response
     *
     * @param pAfl
     *            AFL data
     * @return list of AFL
     */
    protected List<Afl> extractAfl(final byte[] pAfl) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to create GPO command and execute it
     *
     * @param pPdol
     *            PDOL raw data
     * @return return data
     * @throws CommunicationException communication error
     */
    protected byte[] getGetProcessingOptions(final byte[] pPdol) throws CommunicationException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to extract track data from response
     *
     * @param pEmvCard
     *            Card data
     * @param pData
     *            data send by card
     * @return true if track 1 or track 2 can be read
     */
    protected boolean extractTrackData(final EmvCard pEmvCard, final byte[] pData) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
