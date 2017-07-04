package io.jetbrains.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	private List<Topic> topics= new ArrayList<>(Arrays.asList(
			new Topic("spring","SpringFramework","Its an awesome huge framework"),
			new Topic("springBoot","Ultimate SpringFramework","Makes life easy"),
			new Topic("angular","GoodFramework","Two way binding is good")
			));
	
	public List<Topic> getAllTopics(){
		//return topics;
		List<Topic>topics=new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id){
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return topicRepository.findOne(id);
	}
	public void addTopic( Topic topic){
		//topics.add(topic);
		topicRepository.save(topic);
		
	}
	
	public void updateTopic(String id,Topic topic){
		/*for(int i=0;i<topics.size();i++){
			Topic t=topics.get(i);
			if(t.getId().equals(id)){
				topics.set(i, topic);
				return;
			}
		}*/
		topicRepository.save(topic);
		
	}

	public void deleteTopic(String id) {
		//topics.removeIf(t->t.getId().equals(id));
		topicRepository.delete(id);
	}
	
}
