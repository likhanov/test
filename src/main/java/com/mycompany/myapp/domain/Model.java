package com.mycompany.myapp.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A Model.
 */
@Entity
@Table(name = "model")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Model implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @NotNull
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "patronymic")
    private String patronymic;

    @NotNull
    @Column(name = "height", nullable = false)
    private String height;

    @NotNull
    @Column(name = "chest", nullable = false)
    private String chest;

    @NotNull
    @Column(name = "waist", nullable = false)
    private String waist;

    @NotNull
    @Column(name = "hips", nullable = false)
    private String hips;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public Model lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Model firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Model patronymic(String patronymic) {
        this.patronymic = patronymic;
        return this;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getHeight() {
        return height;
    }

    public Model height(String height) {
        this.height = height;
        return this;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getChest() {
        return chest;
    }

    public Model chest(String chest) {
        this.chest = chest;
        return this;
    }

    public void setChest(String chest) {
        this.chest = chest;
    }

    public String getWaist() {
        return waist;
    }

    public Model waist(String waist) {
        this.waist = waist;
        return this;
    }

    public void setWaist(String waist) {
        this.waist = waist;
    }

    public String getHips() {
        return hips;
    }

    public Model hips(String hips) {
        this.hips = hips;
        return this;
    }

    public void setHips(String hips) {
        this.hips = hips;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Model)) {
            return false;
        }
        return id != null && id.equals(((Model) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Model{" +
            "id=" + getId() +
            ", lastName='" + getLastName() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", patronymic='" + getPatronymic() + "'" +
            ", height='" + getHeight() + "'" +
            ", chest='" + getChest() + "'" +
            ", waist='" + getWaist() + "'" +
            ", hips='" + getHips() + "'" +
            "}";
    }
}
