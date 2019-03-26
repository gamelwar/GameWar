package com.medium;

import javax.persistence.*;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class AppModel implements Serializable {
    private static final long serialVersionUID = 876688928410084519L;

    @Id
    private long id;

    private String message;
}