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
import com.github.devnied.emvnfccard.enums.SwEnum;
import com.github.devnied.emvnfccard.exception.CommunicationException;
import com.github.devnied.emvnfccard.parser.IProvider;
import com.github.devnied.emvnfccard.utils.CommandApdu;
import com.github.devnied.emvnfccard.utils.ResponseUtils;

/**
 * Wrapper for IProvider
 * @author MILLAU Julien
 */
public class ProviderWrapper implements IProvider {

    /**
     * Provider
     */
    private final IProvider provider;

    /**
     * Constructor
     * @param pProvider provider
     */
    public ProviderWrapper(IProvider pProvider) {
        provider = pProvider;
    }

    @Override
    public byte[] transceive(byte[] pCommand) throws CommunicationException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public byte[] getAt() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
