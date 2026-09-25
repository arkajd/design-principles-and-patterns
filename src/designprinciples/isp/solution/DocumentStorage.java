package designprinciples.isp.solution;

public interface DocumentStorage {
    void uploadDocument(String path);
    void downloadDocument(String documentId);
}
