package com.ssgsakk.ssgdotcom.category.domain;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import java.util.ArrayList;
import java.util.List;


@ToString
@Getter
@Entity
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categorySeq;

    @Column(nullable = false,length = 10)
    private String categoryName;


    @Column(nullable = false, length = 1)
    private int level; //카테고리 depth

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parentCategorySeq")
    @JsonBackReference
    private Category parentCategorySeq;


    @OneToMany(mappedBy = "parentCategorySeq",fetch = FetchType.LAZY)
    private List<Category> child = new ArrayList<>(); //참조된 내역을 저장하는 리스트

    @Builder
    public Category(Long categorySeq, String categoryName, int level,Category parentCategorySeq){
        this.categorySeq = categorySeq;
        this.categoryName = categoryName;
        this.level = level;
        this.parentCategorySeq = parentCategorySeq;

    }

}


