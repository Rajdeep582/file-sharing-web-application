package com.FileShare.FileSharingApp.repository;

import com.FileShare.FileSharingApp.entity.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;


@Repository
public interface FileRepository extends JpaRepository<FileEntity, Integer> {
    List<FileEntity> findByExpiryTimeBefore(LocalDateTime now);

}
