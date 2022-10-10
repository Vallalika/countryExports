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
}
