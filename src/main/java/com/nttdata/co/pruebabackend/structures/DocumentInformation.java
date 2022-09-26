package com.nttdata.co.pruebabackend.structures;

public class DocumentInformation {
    public DocumentInformation(String documentType, String description) {
        this.documentType = documentType;
        this.description = description;
    }

    String documentType;

    String description;

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
