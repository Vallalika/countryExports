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

    public void listExportersTwoProducts(CSVParser parser, String exportItem1, String exportItem2) {
        for (CSVRecord record: parser) {
            String exports = record.get("Exports");
            if (exports.contains(exportItem1) && exports.contains(exportItem2)) {
                String country = record.get("Country");
                System.out.println(country);
            }
        }
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

    public void bigExporters(CSVParser parser, String amount) {   // amount is a String in the format of a dollar sign, followed by an integer number with a comma separator every three digits from the right
        for (CSVRecord record: parser) {
            String value = record.get("Value (dollars)");
            if (value.length() > amount.length()) {
                String country = record.get("Country");
                System.out.println(country);
            }
        }
    }

}
