package com.greptilian;

import org.swordapp.server.AuthCredentials;
import org.swordapp.server.ServiceDocument;
import org.swordapp.server.ServiceDocumentManager;
import org.swordapp.server.SwordAuthException;
import org.swordapp.server.SwordCollection;
import org.swordapp.server.SwordConfiguration;
import org.swordapp.server.SwordError;
import org.swordapp.server.SwordServerException;
import org.swordapp.server.SwordWorkspace;

public class ServiceDocumentManagerImpl implements ServiceDocumentManager {

    @Override
    public ServiceDocument getServiceDocument(String string, AuthCredentials ac, SwordConfiguration sc) throws SwordError, SwordServerException, SwordAuthException {
        ServiceDocument service = new ServiceDocument();
        SwordWorkspace workspace = new SwordWorkspace();
        workspace.setTitle("myTitle");
        SwordCollection collection = new SwordCollection();
        collection.setTitle("myCollection");
        workspace.addCollection(collection);
        service.addWorkspace(workspace);
        return service;
    }

}
