package designprinciples.isp.solution;

public class PdfReportService implements DocumentStorage, TextExtractable{

    @Override
    public void uploadDocument(String path) {
        System.out.println("Uploading PDF to cloud storage: " + path);
    }

    @Override
    public void downloadDocument(String documentId) {
        System.out.println("Downloading PDF: " + documentId);
    }

    @Override
    public void extractTextWithOcr(String documentId) {
        System.out.println("Running OCR scanner on PDF text layers: " + documentId);
    }
}
