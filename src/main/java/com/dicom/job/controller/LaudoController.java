package com.dicom.job.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dicom.job.documento.Laudo;
import com.dicom.job.exception.InvalidFileException;
import com.dicom.job.service.LaudoService;

@RestController
@RequestMapping("/c:/engenharia/pdf")
public class LaudoController {
    private final LaudoService documentService;
public LaudoController(LaudoService documentService) {
        this.documentService = documentService;
    }
    @PostMapping
    public Laudo upload(@RequestParam MultipartFile file) throws InvalidFileException, IOException {
        return documentService.upload(file);
    }
}