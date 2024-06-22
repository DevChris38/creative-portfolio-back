package com.creativeportfolio.back.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name = "customer")
public class Customer {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String firstName;

        private String lastName;

        private String expone;

        private String exptwo;

        private String expthree;

        public Customer(){
        }

        public Customer(String firstName, String lastName, String expone, String exptwo, String expthree){
                this.firstName = firstName;
                this.lastName = lastName;
                this.expone = expone;
                this.exptwo = exptwo;
                this.expthree = expthree;
        }

}

