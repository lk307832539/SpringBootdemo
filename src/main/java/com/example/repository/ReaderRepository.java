package com.example.repository;

import com.example.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by LK on 2018/3/10.
 */
public interface ReaderRepository extends JpaRepository<Reader, String> {
}
