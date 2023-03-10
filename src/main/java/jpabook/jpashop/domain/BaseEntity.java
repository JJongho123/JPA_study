package jpabook.jpashop.domain;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseEntity {
    private String createBy;
    private LocalDateTime lastModifiedBy;
    private String createdDate;
    private LocalDateTime lastModifiedDate;

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public LocalDateTime getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(LocalDateTime lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}
