package com.example.office2pdf.controller;


import com.example.util.PdfUtil;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @GetMapping("imgToPdf")
  public String imgToPdf(String path, HttpServletRequest request){

    return PdfUtil.imgOfPdf(path, request);
  }
  @GetMapping("excToPdf")
  public String excToPdf(String path, HttpServletRequest request){

    return PdfUtil.exceOfPdf(path);
  }
  @GetMapping("docToPdf")
  public String docToPdf(String path, HttpServletRequest request){

    return PdfUtil.docOfPdf(path);
  }

  @GetMapping("pptToPdf")
  public String pptToPdf(String path, HttpServletRequest request) {

    return PdfUtil.pptOfpdf(path, request);
  }
}
