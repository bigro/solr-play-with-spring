package com.example.solrplaywithspring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(collection = "mycore")
public class UserDoc {

    public UserDoc(String id, String username, String email, String phoneNumber) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Id
    @Indexed
    private String id;

    @Indexed(name = "username", type = "string")
    private String username;

    @Indexed(name = "email", type = "string")
    private String email;

    @Indexed(name = "phone_number", type = "string")
    private String phoneNumber;

}
