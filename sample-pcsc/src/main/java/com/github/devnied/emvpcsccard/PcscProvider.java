package com.github.devnied.emvpcsccard;

import java.nio.ByteBuffer;
import javax.smartcardio.CardChannel;
import javax.smartcardio.CardException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.github.devnied.emvnfccard.enums.SwEnum;
import com.github.devnied.emvnfccard.exception.CommunicationException;
import com.github.devnied.emvnfccard.parser.IProvider;
import com.github.devnied.emvnfccard.utils.TlvUtil;
import fr.devnied.bitlib.BytesUtils;

public class PcscProvider implements IProvider {

    /**
     * Class logger
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(PcscProvider.class);

    /**
     * CardChanel
     */
    private final CardChannel channel;

    /**
     * Buffer
     */
    private final ByteBuffer buffer = ByteBuffer.allocate(1024);

    /**
     * Constructor using field
     *
     * @param pChannel
     *            card channel
     */
    public PcscProvider(final CardChannel pChannel) {
        channel = pChannel;
    }

    @Override
    public byte[] transceive(final byte[] pCommand) throws CommunicationException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public byte[] getAt() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
