package interfaces;

interface ReportExporter {
    void exportToCSV();
    void exportToPDF();

    default void exportToJSON() {
        System.out.println("Exported to JSON (default).");
    }
}

class Report implements ReportExporter {
    public void exportToCSV() { System.out.println("Exported to CSV."); }
    public void exportToPDF() { System.out.println("Exported to PDF."); }
}

public class DataExport {
    public static void main(String[] args) {
        Report report = new Report();
        report.exportToCSV();
        report.exportToPDF();
        report.exportToJSON();
    }
}

