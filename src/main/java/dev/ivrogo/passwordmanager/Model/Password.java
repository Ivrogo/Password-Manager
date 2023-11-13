package dev.ivrogo.passwordmanager.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Password {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "USERNAME")
    private User username;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "WEBSITE")
    private String website;

}