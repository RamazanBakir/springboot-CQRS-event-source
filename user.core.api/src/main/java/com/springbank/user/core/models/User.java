package com.springbank.user.core.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

//lombok will generate getters & setters with Data annotation
// Data,AllArgsConstructor,NoArgsConstructor,Builder is lombok annotation
//Document MongoDb annotation
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "users")
public class User {

    @Id
    private String id;
    @NotEmpty(message = "first name is mandatory")
    private String firstName;
    @NotEmpty(message = "last name is mandatory")
    private String lastName;
    @Email(message = "Please Provide a valid email address")
    private String emailAddress;
    @NotNull(message = "please provide account credentials")
    private Account account;

}
