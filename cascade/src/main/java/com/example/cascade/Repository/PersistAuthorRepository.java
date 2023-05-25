package com.example.cascade.Repository;

import com.example.cascade.Entities.PersistAuthor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersistAuthorRepository extends JpaRepository<PersistAuthor,Long> {
}
