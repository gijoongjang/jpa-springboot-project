package com.jpa.spingboot.domain.post;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Posts, Long> {
    List<Posts> findAllByOrderByIdDesc();
}
