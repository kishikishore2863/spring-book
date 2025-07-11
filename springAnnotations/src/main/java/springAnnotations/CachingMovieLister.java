package springAnnotations;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class CachingMovieLister {

    @PostConstruct
    public void populateMovieCache() {
        System.out.println("postConstruct");
    }

    @PreDestroy
    public void clearMovieCache() {
        System.out.println("PreDestroy");
    }
}
