import edu.duke.FileResource;
import org.apache.commons.csv.CSVParser;

public class Runner {
    public static void main(String[] args) {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        Query testQuery = new Query();
//        testQuery.countryInfo(parser,"Nauru");
//        testQuery.listExportersTwoProducts(parser, "gold", "diamonds");
//        testQuery.numberOfExporters(parser,"gold");
        testQuery.bigExporters(parser,"$999,999,999,999");
    }


}