package com.example.repository;

import com.example.entity.Book;
import com.example.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by LK on 2018/3/9.
 * <p>
 * 通过扩展JpaRepository，BookRepository直接继承了18个执行常用持久化操作的方法。
 * JpaRepository是个泛型接口，有两个参数：仓库操作的领域对象类型，及其ID属性的类型。
 */
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByReader(Reader reader);
}
