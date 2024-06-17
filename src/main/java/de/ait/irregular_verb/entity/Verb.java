package de.ait.irregular_verb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Verb {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String infinitive;
    private String prateritumForm;
    private String perfectForm;
    private String translate;

    // Constructors, getters, setters, equals, hashCode, toString

    public Verb() {
    }

    public Verb(String infinitive, String prateritumForm, String perfectForm, String translate) {
        this.infinitive = infinitive;
        this.prateritumForm = prateritumForm;
        this.perfectForm = perfectForm;
        this.translate = translate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInfinitive() {
        return infinitive;
    }

    public void setInfinitive(String infinitive) {
        this.infinitive = infinitive;
    }

    public String getPrateritumForm() {
        return prateritumForm;
    }

    public void setPrateritumForm(String prateritumForm) {
        this.prateritumForm = prateritumForm;
    }

    public String getPerfectForm() {
        return perfectForm;
    }

    public void setPerfectForm(String perfectForm) {
        this.perfectForm = perfectForm;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Verb verb = (Verb) o;
        return Objects.equals(id, verb.id) && Objects.equals(infinitive, verb.infinitive) && Objects.equals(prateritumForm, verb.prateritumForm) && Objects.equals(perfectForm, verb.perfectForm) && Objects.equals(translate, verb.translate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, infinitive, prateritumForm, perfectForm, translate);
    }

    @Override
    public String toString() {
        return "Verb{" +
                "id=" + id +
                ", infinitive='" + infinitive + '\'' +
                ", prateritumForm='" + prateritumForm + '\'' +
                ", perfectForm='" + perfectForm + '\'' +
                ", translate='" + translate + '\'' +
                '}';
    }
}

