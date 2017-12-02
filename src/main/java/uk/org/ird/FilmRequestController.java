package uk.org.ird;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class FilmRequestController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/film")
    public Film film(@RequestParam(value="name", defaultValue="Pulp Fiction") String name,
                     @RequestParam(value="year", defaultValue="1994") int year) {
        return new Film(counter.incrementAndGet(), name, year);
    }
}
