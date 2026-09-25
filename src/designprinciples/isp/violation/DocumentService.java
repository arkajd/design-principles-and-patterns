package designprinciples.isp.violation;

public interface DocumentService {

    void uploadDocument(String path);
    void downloadDocument(String documentId);
    void printToPhysicalPrinter(String documentId);
    void faxDocument(String documentId, String phoneNumber);
    void extractTextWithOcr(String documentId);
}
