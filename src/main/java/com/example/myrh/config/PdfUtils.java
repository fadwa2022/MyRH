package com.example.myrh.config;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class PdfUtils {

    public static byte[] convertPdfToByteArray(String filePath) throws IOException {
        File file = new File(filePath);
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            return IOUtils.toByteArray(fileInputStream);
        }
    }
}

