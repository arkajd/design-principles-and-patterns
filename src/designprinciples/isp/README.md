# Interface Segregation Principle (ISP)

> **Core Rule:** Clients should not be forced to depend on methods they do not use.

* **In Everyday Terms:** Avoid "fat" or "polluted" interfaces. It is much better to have multiple small, focused interfaces than one giant interface that tries to do everything.
* **Code Smell:** The "Fat" Interface (classes forced to write empty overrides or throw exceptions for methods they do not support).

---

### The Anti-Pattern: Fat Interface
Notice the `DocumentService` interface in the `isp.violation` package:
- It bundles cloud storage, OCR scanning, physical printing, and faxing into a single interface.
- **The Problem:** Classes like `PdfReportService` are forced to implement methods they don't support (`printToPhysicalPrinter`, `faxDocument`), having to throw `UnsupportedOperationException`.

---

### The Solution: Role-Based Segregation
Notice the design in the `isp.solution` package:
1. **Role-Based Interfaces:** We split the monolith into small, targeted contracts: `DocumentStorage`, `TextExtractable`, `Printable`, and `Faxable`.
2. **Selective Implementation:** Classes implement only the contracts relevant to them (e.g., `PdfReportService` implements `DocumentStorage` and `TextExtractable`).
3. **Decoupled Callers:** Services needing to upload/download documents depend strictly on `DocumentStorage` without being exposed to unrelated printer or fax APIs.