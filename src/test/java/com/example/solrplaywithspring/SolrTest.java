package com.example.solrplaywithspring;

import com.example.solrplaywithspring.model.UserDoc;
import com.example.solrplaywithspring.repository.UserDocRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.UUID;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SolrTest {

    @Autowired
    UserDocRepository userDocRepository;

    @Test
    void solrのRepositoryを使えること() {
        UserDoc userDoc = new UserDoc(UUID.randomUUID().toString(), "John Doe", "aaa@example.com", "012");
        userDocRepository.save(userDoc);
    }
}
