package com.hei.demo.repository;

import com.hei.demo.entity.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
}
