package ch.cyberduck.core;

import java.io.IOException;

/**
 * @version $Id$
 */
public class NullSession extends Session {

    public NullSession(Host h) {
        super(h);
    }

    @Override
    public boolean isConnected() {
        return true;
    }

    @Override
    protected <C> C getClient() throws ConnectionCanceledException {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void connect() throws IOException {
        //
    }

    @Override
    protected void login(final LoginController controller, final Credentials credentials) throws IOException {
        //
    }

    @Override
    public void close() {
        //
    }
}
