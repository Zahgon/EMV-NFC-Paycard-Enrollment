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
import com.github.devnied.emvnfccard.exception.CommunicationException;
import com.github.devnied.emvnfccard.iso7816emv.EmvTags;
import com.github.devnied.emvnfccard.model.Application;
import com.github.devnied.emvnfccard.model.EmvTrack2;
import com.github.devnied.emvnfccard.model.EmvTransactionRecord;
import com.github.devnied.emvnfccard.model.enums.ApplicationStepEnum;
import com.github.devnied.emvnfccard.model.enums.CardStateEnum;
import com.github.devnied.emvnfccard.model.enums.CurrencyEnum;
import com.github.devnied.emvnfccard.model.enums.TransactionTypeEnum;
import com.github.devnied.emvnfccard.parser.EmvTemplate;
import com.github.devnied.emvnfccard.utils.CommandApdu;
import com.github.devnied.emvnfccard.utils.ResponseUtils;
import com.github.devnied.emvnfccard.utils.TlvUtil;
import fr.devnied.bitlib.BytesUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/**
 * GeldKarte parser <br>
 * Documentation: <br>
 * - ftp://ftp.ccc.de/documentation/cards/geldkarte.pdf
 * - http://www.bensin.org/haxor/haxor_src/ic35/crap/stash/scinfo_khf%20-%20geldkarte%20ic35/doku/gk.log
 * - http://ftp.chaos-darmstadt.de/docs/cards/geldkarte.pdf
 * - https://code.google.com/p/android/issues/detail?id=62976
 * - http://www.openscdp.org/scripts/geldkarte/jsdoc/symbols/src/dump_girogo.js.html
 * - http://www.wrankl.de/UThings/Geldkarte.pdf
 *
 * @author MILLAU Julien
 */
public class GeldKarteParser extends AbstractParser {

    /**
     * Class Logger
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(GeldKarteParser.class);

    /**
     * Geldkarte pattern
     */
    private static final Pattern PATTERN = Pattern.compile(StringUtils.deleteWhitespace(EmvCardScheme.GELDKARTE.getAid()[2]) + ".*");

    public GeldKarteParser(EmvTemplate pTemplate) {
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
     * Read EF_BLOG
     *
     * @param pApplication emv application
     * @throws CommunicationException communication error
     */
    protected void readEF_BLOG(final Application pApplication) throws CommunicationException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to get the transaction type
     * @param logstate the log state
     * @return the transaction type or null
     */
    protected TransactionTypeEnum getType(byte logstate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * read EF_BETRAG
     *
     * @param pApplication EMV application
     * @throws CommunicationException communication error
     */
    protected void readEfBetrag(final Application pApplication) throws CommunicationException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to extract Ef_iD record
     *
     * @param pApplication EMV application
     *
     * @throws CommunicationException communication error
     */
    protected void extractEF_ID(final Application pApplication) throws CommunicationException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
