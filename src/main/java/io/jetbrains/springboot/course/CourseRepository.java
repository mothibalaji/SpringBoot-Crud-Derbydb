package io.jetbrains.springboot.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

//First Entity Class and secong type of ID
public interface CourseRepository extends CrudRepository<Course,String>{
	
	//Name if the method matters a lot- It automatically implements
	public List<Course> findByTopicId(String topicId);
}
