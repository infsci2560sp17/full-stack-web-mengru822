package edu.infsci2560.repositories;

import edu.infsci2560.models.Good;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author Mengru
 */
public interface GoodRepository extends PagingAndSortingRepository<Good, Long> {}