package com.dicom.job.service;

import java.io.IOException;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dicom.job.documento.Laudo;
import com.dicom.job.exception.InvalidFileException;
import com.dicom.job.repository.LaudoRepository;

@Service
public class LaudoService {
    private final LaudoRepository documentRepository;
public LaudoService(LaudoRepository documentRepository) {
        this.documentRepository = documentRepository;
    }
    public Laudo upload(MultipartFile file) throws InvalidFileException, IOException {
        if (!file.getContentType().equals("application/pdf")) {
            throw new InvalidFileException("Invalid file type. Only PDF files are allowed.");
        }
        Laudo document = new Laudo();
        document.setName(file.getOriginalFilename());
        document.setData(file.getBytes());
        document.setCreatedAt(LocalDateTime.now());
        return documentRepository.save(document);
        
    }
}