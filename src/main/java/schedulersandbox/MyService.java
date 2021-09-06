package schedulersandbox;

import org.springframework.stereotype.Service;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class MyService {

    private static Logger log = LoggerFactory
        .getLogger(TriggerApplication.class);

    public void exec() throws InterruptedException {
        log.info("Execution starts");
        TimeUnit.SECONDS.sleep(10);
        log.info("Execution ends");
    }
}