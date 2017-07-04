package org.sos.sixbox.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Lodour on 17/7/4 10:37.
 * 自动生成的Entity类
 */
@Entity
@Table(name = "foo", schema = "SixBox", catalog = "")
public class FooEntity {
    private int id;
    private String bar;
    private Timestamp createTime;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "bar", nullable = false, length = 255)
    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    @Basic
    @Column(name = "createTime", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FooEntity fooEntity = (FooEntity) o;

        if (id != fooEntity.id) return false;
        if (bar != null ? !bar.equals(fooEntity.bar) : fooEntity.bar != null) return false;
        return createTime != null ? createTime.equals(fooEntity.createTime) : fooEntity.createTime == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (bar != null ? bar.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
