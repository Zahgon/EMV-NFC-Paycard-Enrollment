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
package com.github.devnied.emvnfccard.model;

import java.util.Date;

/**
 * Track 2 data
 *
 * @author MILLAU julien
 */
public class EmvTrack2 extends AbstractData {

    /**
     * Generated serial UID
     */
    private static final long serialVersionUID = -2906133619803198319L;

    /**
     * Raw track 2 data
     */
    private byte[] raw;

    /**
     * Card number
     */
    private String cardNumber;

    /**
     * Expiration date
     */
    private Date expireDate;

    /**
     * Card services
     */
    private Service service;

    /**
     * @return the raw
     */
    public byte[] getRaw() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param raw
     *            the raw to set
     */
    public void setRaw(final byte[] raw) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return the cardNumber
     */
    public String getCardNumber() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param cardNumber
     *            the cardNumber to set
     */
    public void setCardNumber(final String cardNumber) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return the expireDate
     */
    public Date getExpireDate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param expireDate
     *            the expireDate to set
     */
    public void setExpireDate(final Date expireDate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return the service
     */
    public Service getService() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param service
     *            the service to set
     */
    public void setService(final Service service) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
