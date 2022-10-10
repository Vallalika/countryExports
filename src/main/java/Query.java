import edu.duke.FileResource;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class Query {

    public String countryInfo(CSVParser parser, String country) {
        for (CSVRecord record: parser) {
            String countryRecord = record.get("Country");
            String exportRecord = record.get("Exports");
            String valueRecord = record.get("Value (dollars)");
            if (countryRecord.contains(country)) {
                System.out.print(countryRecord + " : " + exportRecord + " : " + valueRecord);
                return countryRecord + " : " + exportRecord + " : " + valueRecord;
            }
        }
        System.out.println("NOT FOUND");
        return "NOT FOUND";
    }

    public Void listExportersTwoProducts(CSVParser parser, String exportItem1, String exportItem2) {
        for (CSVRecord record: parser) {
            String exports = record.get("Exports");
            if (exports.contains(exportItem1) && exports.contains(exportItem2)) {
                String country = record.get("Country");
                System.out.println(country);
            }
        }
        return null;
    }

    public int numberOfExporters(CSVParser parser, String exportItem) {
        int exporterNumber = 0;
        for (CSVRecord record: parser) {
            String exports = record.get("Exports");
            if (exports.contains(exportItem)) {
                exporterNumber += 1;
            }
        }
        System.out.println(exporterNumber);
        return exporterNumber;
    }

}
