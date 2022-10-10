import edu.duke.FileResource;
import org.apache.commons.csv.CSVParser;

public class Query {
    FileResource fr = new FileResource();
    CSVParser parser = fr.getCSVParser();
}
