package designprinciples.isp.solution;

public class OfficePrinterService implements DocumentStorage, Printable, Faxable{

    @Override
    public void uploadDocument(String path) {
        System.out.println("Buffering document to local printer spool: " + path);
    }

    @Override
    public void downloadDocument(String documentId) {
        System.out.println("Fetching document from spool queue: " + documentId);
    }

    @Override
    public void faxDocument(String documentId, String phoneNumber) {
        System.out.println("Dialing " + phoneNumber + " and transmitting fax: " + documentId);
    }

    @Override
    public void printToPhysicalPrinter(String documentId) {
        System.out.println("Sending rasterized job to office printer: " + documentId);
    }
}
