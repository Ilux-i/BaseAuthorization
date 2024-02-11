package com.example.BaseAuthorization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.PackagePrivate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@PackagePrivate
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user", schema = "test_app")
public class UserEntity {
    @Id
    String login;
    @Column
    String password;
}
