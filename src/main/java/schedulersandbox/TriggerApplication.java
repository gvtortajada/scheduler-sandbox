package schedulersandbox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TriggerApplication implements CommandLineRunner{

    @Autowired
    private ApplicationContext context;

    @Autowired
    private MyService myService;

	public static void main(String[] args) {
		SpringApplication.run(TriggerApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        this.myService.exec();
        SpringApplication.exit(context);
    }


}