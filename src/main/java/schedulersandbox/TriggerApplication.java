package schedulersandbox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TriggerApplication implements CommandLineRunner{

    private static Logger log = LoggerFactory
        .getLogger(TriggerApplication.class);

    @Autowired
    private ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(TriggerApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        log.info("test2");
        // SpringApplication.exit(this.context);
    }

}
