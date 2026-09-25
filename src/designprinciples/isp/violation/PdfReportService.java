package designprinciples.isp.violation;

public class PdfReportService implements DocumentService {


    @Override
    public void uploadDocument(String path) {
        System.out.println("Uploading PDF to cloud storage: " + path);
    }

    @Override
    public void downloadDocument(String documentId) {
        System.out.println("Downloading PDF: " + documentId);
    }

    @Override
    public void printToPhysicalPrinter(String documentId) {
        // PDF service doesn't have an office physical printer attached!
        throw new UnsupportedOperationException("Physical printing not supported for cloud PDFs.");
    }

    @Override
    public void faxDocument(String documentId, String phoneNumber) {
        // PDF service doesn't have an office physical printer attached!
        throw new UnsupportedOperationException("Physical printing not supported for cloud PDFs.");
    }

    @Override
    public void extractTextWithOcr(String documentId) {
        System.out.println("Running OCR scanner on PDF text layers: " + documentId);
    }
}
