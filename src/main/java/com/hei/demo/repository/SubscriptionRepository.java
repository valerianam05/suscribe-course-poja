package com.hei.demo.repository;

import com.hei.demo.entity.Subscription;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionRepository extends CrudRepository<Subscription, String> {
  Optional<Subscription> findByUserIdAndCourseId(String userId, String courseId);

  List<Subscription> findByUserId(String userId);
}
