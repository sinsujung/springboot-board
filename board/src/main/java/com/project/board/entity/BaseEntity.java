package com.project.board.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
public class BaseEntity {
    @CreationTimestamp // 생성되었을 때 시간을 만들어주는 어노테이션
    @Column(updatable = false) // 수정시에는 관여 x
    private LocalDateTime createdTime;

    @UpdateTimestamp // 업데이트 되었을 때 시간을 만들어주는 어노테이션
    @Column(insertable = false) // 인서트 시 관여 x
    private LocalDateTime updatedTime;
}
