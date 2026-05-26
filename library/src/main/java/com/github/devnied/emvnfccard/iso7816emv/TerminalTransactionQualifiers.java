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
package com.github.devnied.emvnfccard.iso7816emv;

import java.util.Arrays;
import fr.devnied.bitlib.BytesUtils;

/**
 * This implementation is a mix of EMV & VISA TTQ
 *
 * VISA: Terminal Transaction Qualifiers (Tag '9F66') is a reader data element indicating capabilities (e.g., MSD or qVSDC) and
 * transaction-specific requirements (e.g., online) of the reader. It is requested by the card in the PDOL and used by the card to
 * determine how to process the transaction (for example, process using MSD or qVSDC, process offline or online).
 */
public class TerminalTransactionQualifiers {

    private byte[] data = new byte[4];

    public TerminalTransactionQualifiers() {
    }

    public boolean contactlessMagneticStripeSupported() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean contactlessVSDCsupported() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean contactlessEMVmodeSupported() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean contactEMVsupported() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean readerIsOfflineOnly() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean onlinePINsupported() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean signatureSupported() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean onlineCryptogramRequired() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean cvmRequired() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean contactChipOfflinePINsupported() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean issuerUpdateProcessingSupported() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean consumerDeviceCVMsupported() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setMagneticStripeSupported(final boolean value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setContactlessVSDCsupported(final boolean value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setContactlessEMVmodeSupported(final boolean value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setContactEMVsupported(final boolean value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setReaderIsOfflineOnly(final boolean value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setOnlinePINsupported(final boolean value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setSignatureSupported(final boolean value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setOnlineCryptogramRequired(final boolean value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setCvmRequired(final boolean value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setContactChipOfflinePINsupported(final boolean value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setIssuerUpdateProcessingSupported(final boolean value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setConsumerDeviceCVMsupported(final boolean value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // The rest of the bits in the second byte are RFU (Reserved for Future Use)
    public byte[] getBytes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
