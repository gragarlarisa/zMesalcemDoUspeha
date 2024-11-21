package com.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Recept_Sestavine")
public class ReceptSestavine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Recept_Sestavine")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "TK_Recept", nullable = false)
    private Recept recept;

    @ManyToOne
    @JoinColumn(name = "TK_Sestavine", nullable = false)
    private Sestavine sestavine;

    // Getterji in setterji
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recept getRecept() {
        return recept;
    }

    public void setRecept(Recept recept) {
        this.recept = recept;
    }

    public Sestavine getSestavine() {
        return sestavine;
    }

    public void setSestavine(Sestavine sestavine) {
        this.sestavine = sestavine;
    }
}