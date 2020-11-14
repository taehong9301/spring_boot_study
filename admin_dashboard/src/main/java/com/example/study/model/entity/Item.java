package com.example.study.model.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString(exclude = {"orderDetailList", "partner"})
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "item")
public class Item {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String status;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private String title;

  private String content;

  @Column(nullable = false)
  private Integer price;

  private String brandName;

  private LocalDateTime registeredAt;

  private LocalDateTime unregisteredAt;

  @CreatedDate
  @Column(nullable = false)
  private LocalDateTime createdAt;

  @CreatedBy
  @Column(nullable = false)
  private String createdBy;

  @LastModifiedDate private LocalDateTime updatedAt;

  @LastModifiedBy private String updatedBy;

  // Item N : 1 Partner
  @ManyToOne
  @JoinColumn(name = "partner_id")
  private Partner partner;

  // Item 1 : N OrderDetail
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "item")
  private List<OrderDetail> orderDetailList;
}
