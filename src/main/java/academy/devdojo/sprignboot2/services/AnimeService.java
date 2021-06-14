package academy.devdojo.sprignboot2.services;

import academy.devdojo.sprignboot2.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {
//    private final AnimeRepository animeRepository;

    public List<Anime> listAll() {
        return List.of(new Anime(1L, "Boku no hero"), new Anime(2L, "Beserk"));
    }
}
