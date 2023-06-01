package com.example.md5_ss11_baitap_restful_blog.repository;

import com.example.md5_ss11_baitap_restful_blog.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends PagingAndSortingRepository<Category, Long> {
}
