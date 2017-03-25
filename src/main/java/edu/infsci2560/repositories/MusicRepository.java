package edu.infsci2560.repositories;

import edu.infsci2560.models.Music;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author Mengru
 */
public interface MusicRepository extends PagingAndSortingRepository<Music, Long> {}