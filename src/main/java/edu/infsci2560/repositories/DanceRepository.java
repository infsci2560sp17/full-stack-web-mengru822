/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.repositories;

import edu.infsci2560.models.Dance;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DanceRepository extends PagingAndSortingRepository<Dance,Long> {


  /*@Override
  @RestResource(exported = false)
  void delete(Long long);
  @Override
  @RestResource(exported = false)
  void delete(Dance dance);
  @Override
  @RestResource(exported = false)
  void delete(Iterable<? extends Dance> iterable);
  @Override
  @RestResource(exported = false)
  void deleteAll(); */
}