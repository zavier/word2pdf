package com.github.zavier.word2pdf;

import org.junit.Test;

import static org.junit.Assert.*;

public class PdfUtilsTest {

    @Test
    public void word2pdf() {
        String wordPath = "/Users/zhengwei/code/java/word2pdf/src/test/resources/测试文档01.docx";
        String pdfPath = "/Users/zhengwei/code/java/word2pdf/src/test/resources/测试文档01.pdf";
        PdfUtils.word2pdf(wordPath, pdfPath);
    }
}