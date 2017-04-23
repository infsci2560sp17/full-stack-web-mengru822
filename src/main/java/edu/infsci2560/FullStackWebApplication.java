package edu.infsci2560;

import edu.infsci2560.models.Dance;
import edu.infsci2560.models.Dance.DanceType;
import edu.infsci2560.repositories.DanceRepository;
import edu.infsci2560.models.Music;
import edu.infsci2560.models.Music.category;
import edu.infsci2560.repositories.MusicRepository;
import edu.infsci2560.models.Good;
import edu.infsci2560.repositories.GoodRepository;
import edu.infsci2560.models.Video;
import edu.infsci2560.repositories.VideoRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
    

@SpringBootApplication
@ComponentScan({"edu.infsci2560"})
public class FullStackWebApplication {

    private static final Logger log = LoggerFactory.getLogger(FullStackWebApplication.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(FullStackWebApplication.class, args);

        DanceRepository repository = ctx.getBean(DanceRepository.class);
        repository.save(new Dance(1L, "Chinese Folk", DanceType.Folk,"easy","14 min"));
        repository.save(new Dance(2L, "Popping", DanceType.Street,"medium", "20 min"));
        repository.save(new Dance(3L, "France Ballet", DanceType.Ballet, "hard", "15 min"));
        repository.save(new Dance(4L, "Samba", DanceType.Ballroom, "easy", "18 min"));

        MusicRepository musicRepository = ctx.getBean(MusicRepository.class);
        musicRepository.save(new Music(1L, category.Pleasant, "Party Rock Anthem -LMFAO"));
        musicRepository.save(new Music(2L, category.Lyrical, "Just One Last Dance -Sarah Connor"));
        musicRepository.save(new Music(3L, category.Soft, "Song From a Secret Garden -Secret Garden"));

        GoodRepository goodRepository = ctx.getBean(GoodRepository.class);
        goodRepository.save(new Good(1L, "Dancing Clothes", "Jazz", "https://www.amazon.com"));
        goodRepository.save(new Good(2L, "Dancing Shoes", "Classic", "https://www.walmart.com"));
        goodRepository.save(new Good(3L, "Dancing Hat", "Ballet", "https://ebay.com"));
        

        VideoRepository videoRepository = ctx.getBean(VideoRepository.class);
        
        videoRepository.save(new Video(1L, "Easy kids dance", "https://www.youtube.com/watch?v=t6PmB6tMBOc"));
        videoRepository.save(new Video(2L, "Popping Final 2017","https://www.youtube.com/watch?v=Dhmgr8-tagE"));
        
    }


//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//
//        };
//    }
//    @Bean
//    public CommandLineRunner databaseDemo(CustomerRepository repository) {
//        return (args) -> {
//            // save a couple of customers
//            repository.save(new Customer("Jack", "Bauer"));
//            repository.save(new Customer("Chloe", "O'Brian"));
//            repository.save(new Customer("Kim", "Bauer"));
//            repository.save(new Customer("David", "Palmer"));
//            repository.save(new Customer("Michelle", "Dessler"));
//            repository.save(new Customer("Billy", "Bean"));
//
//            // fetch all customers
//            log.info("[Database Demo] Customers found with findAll():");
//            log.info("[Database Demo] -------------------------------");
//            for (Customer customer : repository.findAll()) {
//                log.info("[Database Demo] " + customer.toString());
//            }
//            log.info("");
//
//            // fetch an individual customer by ID
//            Customer customer = repository.findOne(1L);
//            log.info("[Database Demo] Customer found with findOne(1L):");
//            log.info("[Database Demo] --------------------------------");
//            log.info("[Database Demo] " + customer.toString());
//
//            // fetch customers by last name
//            log.info("[Database Demo] Customer found with findByLastName('Bauer'):");
//            log.info("[Database Demo] --------------------------------------------");
//            for (Customer bauer : repository.findByLastName("Bauer")) {
//                log.info("[Database Demo] " + bauer.toString());
//            }
//        };
//    }
}