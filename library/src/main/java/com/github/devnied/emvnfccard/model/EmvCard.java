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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import com.github.devnied.emvnfccard.enums.EmvCardScheme;
import com.github.devnied.emvnfccard.model.enums.CardStateEnum;

/**
 * Bean used to describe data in EMV card
 *
 * @author MILLAU Julien
 */
public class EmvCard extends AbstractData {

    /**
     * Generated serial UID
     */
    private static final long serialVersionUID = 736740432469989941L;

    /**
     * CPLC data
     */
    private CPLC cplc;

    /**
     * Holder Lastname
     */
    private String holderLastname;

    /**
     * Holder Firstname
     */
    private String holderFirstname;

    /**
     * Card type
     */
    private EmvCardScheme type;

    /**
     * Card ATS (contact less) or ATR
     */
    private String at;

    /**
     * List of Atr description
     */
    private Collection<String> atrDescription;

    /**
     * Track 2 data
     */
    private EmvTrack2 track2;

    /**
     * Track 1 data
     */
    private EmvTrack1 track1;

    /**
     * BIC - Bank Identifier Code
     */
    private String bic;

    /**
     * IBAN - International Bank Account Number
     */
    private String iban;

    /**
     * Application list
     */
    private final List<Application> applications = new ArrayList<Application>();

    /**
     * Card state
     */
    private CardStateEnum state = CardStateEnum.UNKNOWN;

    /**
     * Method used to get the field holderLastname
     *
     * @return the holderLastname
     */
    public String getHolderLastname() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Setter for the field holderLastname
     *
     * @param holderLastname
     *            the holderLastname to set
     */
    public void setHolderLastname(final String holderLastname) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to get the field holderFirstname
     *
     * @return the holderFirstname
     */
    public String getHolderFirstname() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Setter for the field holderFirstname
     *
     * @param holderFirstname
     *            the holderFirstname to set
     */
    public void setHolderFirstname(final String holderFirstname) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to get the field cardNumber
     *
     * @return the cardNumber
     */
    public String getCardNumber() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to get the field expireDate
     *
     * @return the expireDate
     */
    public Date getExpireDate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to get the field type
     *
     * @return the type
     */
    public EmvCardScheme getType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Setter for the field type
     *
     * @param type
     *            the type to set
     */
    public void setType(final EmvCardScheme type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(final Object arg0) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to get the field atrDescription
     *
     * @return the atrDescription
     */
    public Collection<String> getAtrDescription() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Setter for the field atrDescription
     *
     * @param atrDescription
     *            the atrDescription to set
     */
    public void setAtrDescription(final Collection<String> atrDescription) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to get the field at
     *
     * @return the at value
     */
    public String getAt() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Setter for the field at
     *
     * @param atr
     *            the at value to set
     */
    public void setAt(final String at) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to get the field state
     *
     * @return the state
     */
    public CardStateEnum getState() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Setter for the field state
     *
     * @param state
     *            the state to set
     */
    public void setState(final CardStateEnum state) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to get the field track2
     *
     * @return the track2
     */
    public EmvTrack2 getTrack2() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Setter for the field track2
     *
     * @param track2
     *            the track2 to set
     */
    public void setTrack2(final EmvTrack2 track2) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to get the field track1
     *
     * @return the track1
     */
    public EmvTrack1 getTrack1() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Setter for the field track1
     *
     * @param track1
     *            the track1 to set
     */
    public void setTrack1(final EmvTrack1 track1) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to get the field bic
     *
     * @return the bic
     */
    public String getBic() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Setter for the field bic
     *
     * @param bic
     *            the bic to set
     */
    public void setBic(final String bic) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to get the field iban
     *
     * @return the iban
     */
    public String getIban() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Setter for the field iban
     *
     * @param iban
     *            the iban to set
     */
    public void setIban(final String iban) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Method used to get the field applications
     *
     * @return the applications
     */
    public List<Application> getApplications() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get the field cplc
     * @return the cplc
     */
    public CPLC getCplc() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Setter for the field cplc
     *
     * @param cplc the cplc to set
     */
    public void setCplc(CPLC cplc) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
