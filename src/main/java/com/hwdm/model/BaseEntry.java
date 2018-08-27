package com.hwdm.model;

//@MappedSuperclass
public class BaseEntry {
    //@id
    //@GeneratedValue(startegy = GenerationType.IDENTITY)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isNew() {
        return this.id == null;
    }
}
