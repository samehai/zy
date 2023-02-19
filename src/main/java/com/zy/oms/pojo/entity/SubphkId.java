package com.zy.oms.pojo.entity;

import org.hibernate.Hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SubphkId implements Serializable {
    private static final long serialVersionUID = -7659233551401390698L;
    @Column(name = "SUBBH", nullable = false, length = 30)
    private String subbh;
    @Column(name = "DH", nullable = false, length = 50)
    private String dh;

    public String getDh() {
        return dh;
    }

    public void setDh(String dh) {
        this.dh = dh;
    }

    public String getSubbh() {
        return subbh;
    }

    public void setSubbh(String subbh) {
        this.subbh = subbh;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dh, subbh);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
            return false;
        }
        SubphkId entity = (SubphkId) o;
        return Objects.equals(this.dh, entity.dh) &&
                Objects.equals(this.subbh, entity.subbh);
    }
}