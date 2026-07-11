package com.hei.demo.repository;

import com.hei.demo.PojaGenerated;
import com.hei.demo.repository.entity.DummyUuid;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@PojaGenerated
@Repository
public interface DummyUuidRepository extends CrudRepository<DummyUuid, String> {
    @Override
    List<DummyUuid> findAllById(Iterable<String> ids);
}
