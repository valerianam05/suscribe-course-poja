package com.hei.demo.repository;

import com.hei.demo.PojaGenerated;
import com.hei.demo.repository.entity.Dummy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@PojaGenerated
public interface DummyRepository extends CrudRepository<Dummy, String> {
    @Override
    List<Dummy> findAll();
}
