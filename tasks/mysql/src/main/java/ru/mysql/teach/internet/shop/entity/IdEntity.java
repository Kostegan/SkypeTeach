package ru.mysql.teach.internet.shop.entity;

/**
 *
 */
public class IdEntity implements IIdEntity {
    private Long id;


    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    // todo implement equals and hashcode
}
