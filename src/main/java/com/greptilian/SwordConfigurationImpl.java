package com.greptilian;

import org.swordapp.server.SwordConfiguration;

public class SwordConfigurationImpl implements SwordConfiguration {

    @Override
    public boolean returnDepositReceipt() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean returnStackTraceInError() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean returnErrorBody() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String generator() {
        return "myGenerator";
    }

    @Override
    public String generatorVersion() {
        return "myGeneratorVersion";
    }

    @Override
    public String administratorEmail() {
        return "myAdministratorEmail";
    }

    @Override
    public String getAuthType() {
        return "Basic";
    }

    @Override
    public boolean storeAndCheckBinary() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getTempDirectory() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxUploadSize() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getAlternateUrl() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getAlternateUrlContentType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean allowUnauthenticatedMediaAccess() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
