package com.FileShare.FileSharingApp.service;


import com.FileShare.FileSharingApp.model.FileModel;
import com.FileShare.FileSharingApp.model.FileModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


public interface FileService {
        public ResponseEntity<?> uploadFile(MultipartFile file, String uploadedBy) throws IOException;
        public ResponseEntity<?> getFile(int id);
        public ResponseEntity<?> deleteFile(int id) ;
        public void deleteExpiredFiles();
       public List<FileModel> getAllFiles();
        public ResponseEntity<?> shareFile(int id);
}