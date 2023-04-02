package com.project.repository;

import com.project.model.Locaton;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepo extends JpaRepository<Locaton,Long> {
}
