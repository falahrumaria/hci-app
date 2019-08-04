package com.hci.test.hciapp.entity;

import javax.persistence.*;

@Entity(name = "tbl_user_group")
public class UserGroupEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    private String name;

    @OneToOne(targetEntity = SectionOrderEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "user_group_id", insertable = false, updatable = false)
    private SectionOrderEntity sectionOrder;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SectionOrderEntity getSectionOrder() {
        return sectionOrder;
    }

    public void setSectionOrder(SectionOrderEntity sectionOrder) {
        this.sectionOrder = sectionOrder;
    }
}
