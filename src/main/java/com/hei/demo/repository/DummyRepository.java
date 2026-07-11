package com.hei.demo.repository;

import com.hei.demo.PojaGenerated;
import com.hei.demo.repository.entity.Dummy;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@PojaGenerated
public interface DummyRepository extends CrudRepository<Dummy, String> {
  @Override
  List<Dummy> findAll();
}
