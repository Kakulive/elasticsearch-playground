package com.kaku.elasticsearchplayground.repository;

import com.kaku.elasticsearchplayground.document.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PersonRepository extends ElasticsearchRepository<Person, String> {

}
