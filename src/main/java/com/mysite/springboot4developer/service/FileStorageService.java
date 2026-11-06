package com.mysite.springboot4developer.service;

import com.mysite.springboot4developer.dto.UploadResponse;

public interface FileStorageService {
    UploadResponse store(byte[] bytes, String filename);
}
