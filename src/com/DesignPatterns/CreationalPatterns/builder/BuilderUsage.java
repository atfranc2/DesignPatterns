package com.DesignPatterns.CreationalPatterns.builder;

public class BuilderUsage {
    public static void Usage(){
        var presentation = new Presentation();
        var pdfDocumentBuilder = new PdfDocumentBuilder();
        var movieBuilder = new MovieBuilder();

        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));
        presentation.addSlide(new Slide("Slide 3"));

        presentation.export(pdfDocumentBuilder);
        presentation.export(movieBuilder);

        var pdf = pdfDocumentBuilder.getPdf();
        var movie = movieBuilder.getMovie();
    }
}
