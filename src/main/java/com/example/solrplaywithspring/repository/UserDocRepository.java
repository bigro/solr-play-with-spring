package com.example.solrplaywithspring.repository;

import com.example.solrplaywithspring.model.UserDoc;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDocRepository extends SolrCrudRepository<UserDoc, String> {
}
