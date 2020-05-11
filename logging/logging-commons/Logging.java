import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Logging{
    public static void main(String[] args){
        Log log = LogFactory.getLog(Logging.class);
        log.info("start...");
        log.warn("end.");

    }
}