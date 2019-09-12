package com.hci.test.hciapp.entity;

import javax.persistence.*;

@Entity(name = "tbl_section_order")
public class SectionOrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    @Column(name = "user_group_id")
    private Integer userGroupId;

    @Column(name = "order_1")
    private Integer order1;

    @Column(name = "order_2")
    private Integer order2;

    @Column(name = "order_3")
    private Integer order3;

    @Column(name = "order_4")
    private Integer order4;

    @Column(name = "order_5")
    private Integer order5;

    @ManyToOne(targetEntity = SectionEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "order_1", referencedColumnName = "id", insertable = false, updatable = false)
    private SectionEntity section1;

    @ManyToOne(targetEntity = SectionEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "order_2", referencedColumnName = "id", insertable = false, updatable = false)
    private SectionEntity section2;

    @ManyToOne(targetEntity = SectionEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "order_3", referencedColumnName = "id", insertable = false, updatable = false)
    private SectionEntity section3;

    @ManyToOne(targetEntity = SectionEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "order_4", referencedColumnName = "id", insertable = false, updatable = false)
    private SectionEntity section4;

    @ManyToOne(targetEntity = SectionEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "order_5", referencedColumnName = "id", insertable = false, updatable = false)
    private SectionEntity section5;

    public SectionOrderEntity() {
    }

    public SectionOrderEntity(Integer id, Integer userGroupId, SectionEntity section1, SectionEntity section2,
                              SectionEntity section3, SectionEntity section4, SectionEntity section5) {
        this.id = id;
        this.userGroupId = userGroupId;
        this.section1 = section1;
        this.section2 = section2;
        this.section3 = section3;
        this.section4 = section4;
        this.section5 = section5;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
    }

    public Integer getOrder1() {
        return order1;
    }

    public void setOrder1(Integer order1) {
        this.order1 = order1;
    }

    public Integer getOrder2() {
        return order2;
    }

    public void setOrder2(Integer order2) {
        this.order2 = order2;
    }

    public Integer getOrder3() {
        return order3;
    }

    public void setOrder3(Integer order3) {
        this.order3 = order3;
    }

    public Integer getOrder4() {
        return order4;
    }

    public void setOrder4(Integer order4) {
        this.order4 = order4;
    }

    public Integer getOrder5() {
        return order5;
    }

    public void setOrder5(Integer order5) {
        this.order5 = order5;
    }

    public SectionEntity getSection1() {
        return section1;
    }

    public void setSection1(SectionEntity section1) {
        this.section1 = section1;
    }

    public SectionEntity getSection2() {
        return section2;
    }

    public void setSection2(SectionEntity section2) {
        this.section2 = section2;
    }

    public SectionEntity getSection3() {
        return section3;
    }

    public void setSection3(SectionEntity section3) {
        this.section3 = section3;
    }

    public SectionEntity getSection4() {
        return section4;
    }

    public void setSection4(SectionEntity section4) {
        this.section4 = section4;
    }

    public SectionEntity getSection5() {
        return section5;
    }

    public void setSection5(SectionEntity section5) {
        this.section5 = section5;
    }
}
