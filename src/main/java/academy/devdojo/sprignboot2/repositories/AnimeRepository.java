package academy.devdojo.sprignboot2.repositories;

import academy.devdojo.sprignboot2.domain.Anime;

import java.util.List;

public interface AnimeRepository{
    List<Anime> listAll();
}
