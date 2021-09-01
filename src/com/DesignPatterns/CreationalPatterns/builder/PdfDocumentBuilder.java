package com.DesignPatterns.CreationalPatterns.builder;

import java.util.List;

public class PdfDocumentBuilder implements PresentationBuilder {

    private PdfDocument pdf = new PdfDocument();

    @Override
    public void addSlide(Slide slide) {
        pdf.addPage(slide.getText());
    }

    public PdfDocument getPdf() {
        return pdf;
    }
}
