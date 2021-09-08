package schedulersandbox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TriggerApplication {

    private ApplicationContext context;
    private MyService myService;

    @Autowired
    public TriggerApplication(ApplicationContext context, MyService myService){
        this.context = context;
        this.myService = myService;
    }
    
	public static void main(String[] args) {
		SpringApplication.run(TriggerApplication.class, args);
	}

    @PostMapping("/")
    public void trigger() throws InterruptedException {
        this.myService.exec();
    }

}