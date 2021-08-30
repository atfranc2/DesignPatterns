package com.DesignPatterns.BehaviouralPatterns.visitor;

public class VisitorUsage {
    public static void Usage(){
        var highlight = new HighlightOperation();
        var plainText = new PlainTextOperation();
        var underline = new UnderlineOperation();

        var doc = new HtmlDocument();

        doc.add(new HeadingNode("card card--dark"));
        doc.add(new LinkNode("https://google.com"));

        doc.execute(underline);
    }
}
