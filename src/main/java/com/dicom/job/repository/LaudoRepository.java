package com.dicom.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dicom.job.documento.Laudo;


public interface LaudoRepository extends JpaRepository<Laudo, Long> {}