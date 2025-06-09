package com.tiwarir.gitupload.repository;

import com.tiwarir.gitupload.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import java.lang.Integer;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
