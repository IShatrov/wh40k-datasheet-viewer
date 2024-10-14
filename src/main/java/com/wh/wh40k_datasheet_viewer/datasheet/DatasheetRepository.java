package com.wh.wh40k_datasheet_viewer.datasheet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatasheetRepository extends JpaRepository<Datasheet, String> { }
