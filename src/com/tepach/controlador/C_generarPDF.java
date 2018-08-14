package com.tepach.controlador;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C_generarPDF
{
  public C_generarPDF() {}
  
  public void write(ResultSet rs)
  {
    System.out.println("Barcode Linha de Código ");
    Document document = new Document(new Rectangle(270.0F, 100.0F), 10.0F, 10.0F, 10.0F, 10.0F);
    try
    {
      while (rs.next())
      {
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(rs.getString(2) + ".pdf"));
        document.open();
        document.add(new Paragraph("CÓDIGOS DE BARRA"));
        PdfContentByte cb = writer.getDirectContent();
        document.add(new Paragraph("USUARIO"));
        Barcode128 code128 = new Barcode128();
        code128.setCode(rs.getString(2));
        Image image128 = code128.createImageWithBarcode(cb, null, null);
        document.add(image128);
        document.add(new Paragraph("CONTRASEÑA"));
        Barcode128 code128w = new Barcode128();
        code128w.setCode(rs.getString(3));
        Image image128w = code128w.createImageWithBarcode(cb, null, null);
        document.add(image128w);
        document.close();
        File path = new File(rs.getString(2) + ".pdf");
        Desktop.getDesktop().open(path);
      }
      
      if (rs != null) {
        rs.close();
      }
    } catch (DocumentException|java.io.FileNotFoundException|SQLException de) {
      de.printStackTrace();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
