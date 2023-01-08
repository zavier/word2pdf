package com.github.zavier.word2pdf;

import com.aspose.words.Document;
import com.aspose.words.License;
import com.aspose.words.SaveFormat;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public class PdfUtils {

    public static void word2pdf(String wordPath, String pdfPath) {
        try {
            // 无license会有水印
            getLicense();

            final File file = new File(pdfPath);
            try (final FileOutputStream os = new FileOutputStream(file);) {
                final Document doc = new Document(wordPath);
                doc.save(os, SaveFormat.PDF);
            }
        } catch (Exception e) {
            throw new RuntimeException("转换异常", e);
        }
    }

    private static void getLicense() throws Exception {
        final InputStream resourceAsStream = PdfUtils.class.getClassLoader().getResourceAsStream("aspose/license.xml");
        final License license = new License();
        license.setLicense(resourceAsStream);
    }

}
