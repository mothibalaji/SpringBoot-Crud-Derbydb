package io.jetbrains.springboot.topic;

import org.springframework.data.repository.CrudRepository;

//First Entity Class and secong type of ID
public interface TopicRepository extends CrudRepository<Topic,String>{

}
