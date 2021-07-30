package org.comm.web;


import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;
import com.opensymphony.xwork2.ActionSupport;

public class ReportAction extends ActionSupport implements ServletRequestAware, ServletResponseAware {
	private static final long serialVersionUID = -1517087746057956540L;
	private HttpServletRequest request;
	private HttpServletResponse response;

	@Override
	public String execute() throws Exception {
		try {

			// Creating document and set the page size
			Document document = new Document(PageSize.A4, 20, 20, 20, 20);
			String imagePath = ServletActionContext.getServletContext().getRealPath("\\assets");
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(imagePath + "/temp1" + ".pdf"));
			document.open();
//
//			// Add image on the document
//			Image image = Image.getInstance(imagePath + "\\RayBan.png");
//			image.scaleToFit(90f, 90f);
//			image.setAlignment(Image.MIDDLE);
//			image.setAbsolutePosition(70, 770);
//			image.scaleAbsolute(100, 40);
//			document.add(image);

			// Creating the paragraph and add it to document
			Paragraph p1 = new Paragraph(" WebSparrow Technologies ",
					FontFactory.getFont(FontFactory.HELVETICA, 14, Font.BOLD, new BaseColor(0, 0, 0)));

			Paragraph p2 = new Paragraph("Employee Attendance Report",
					FontFactory.getFont(FontFactory.HELVETICA, 10, Font.UNDERLINE, new BaseColor(0, 0, 0)));
			Paragraph p3 = new Paragraph("\n\n\n");
			p1.setAlignment(Element.ALIGN_CENTER);
			p2.setAlignment(Element.ALIGN_CENTER);
			document.add(p1);
			document.add(p2);
			document.add(p3);

			// Create table and set the width of columns
			PdfPTable t = new PdfPTable(9);
			float widths[] = { 3, 6, 3, 3, 4, 3, 3, 3, 3 };
			t.setWidths(widths);
			t.setHeaderRows(1);
			t.setTotalWidth(100f);

			// Add table header row
			PdfPCell c1 = new PdfPCell(new Phrase("Emp Id", FontFactory.getFont(FontFactory.HELVETICA, 8)));
			c1.setBorderWidth((float) 0.25);
			c1.setBackgroundColor(new BaseColor(232, 232, 232));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			c1.setVerticalAlignment(Element.ALIGN_MIDDLE);
			t.addCell(c1);

			c1 = new PdfPCell(new Phrase("Emp Name", FontFactory.getFont(FontFactory.HELVETICA, 8)));
			c1.setBorderWidth(0.25f);
			c1.setBackgroundColor(new BaseColor(232, 232, 232));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			c1.setVerticalAlignment(Element.ALIGN_MIDDLE);
			t.addCell(c1);

			c1 = new PdfPCell(new Phrase("Monday", FontFactory.getFont(FontFactory.HELVETICA, 8)));
			c1.setBorderWidth(0.25f);
			c1.setBackgroundColor(new BaseColor(232, 232, 232));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			c1.setVerticalAlignment(Element.ALIGN_MIDDLE);
			t.addCell(c1);

			c1 = new PdfPCell(new Phrase("Tuesday", FontFactory.getFont(FontFactory.HELVETICA, 8)));
			c1.setBorderWidth(0.25f);
			c1.setBackgroundColor(new BaseColor(232, 232, 232));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			c1.setVerticalAlignment(Element.ALIGN_MIDDLE);
			t.addCell(c1);

			c1 = new PdfPCell(new Phrase("Wednesday", FontFactory.getFont(FontFactory.HELVETICA, 8)));
			c1.setBorderWidth((float) 0.25);
			c1.setBackgroundColor(new BaseColor(232, 232, 232));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			c1.setVerticalAlignment(Element.ALIGN_MIDDLE);
			t.addCell(c1);

			c1 = new PdfPCell(new Phrase("Thursday", FontFactory.getFont(FontFactory.HELVETICA, 8)));
			c1.setBorderWidth(0.25f);
			c1.setBackgroundColor(new BaseColor(232, 232, 232));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			c1.setVerticalAlignment(Element.ALIGN_MIDDLE);
			t.addCell(c1);

			c1 = new PdfPCell(new Phrase("Friday", FontFactory.getFont(FontFactory.HELVETICA, 8)));
			c1.setBorderWidth(0.25f);
			c1.setBackgroundColor(new BaseColor(232, 232, 232));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			c1.setVerticalAlignment(Element.ALIGN_MIDDLE);
			t.addCell(c1);

			c1 = new PdfPCell(new Phrase("Saturday", FontFactory.getFont(FontFactory.HELVETICA, 8)));
			c1.setBorderWidth(0.25f);
			c1.setBackgroundColor(new BaseColor(232, 232, 232));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			c1.setVerticalAlignment(Element.ALIGN_MIDDLE);
			t.addCell(c1);

			c1 = new PdfPCell(new Phrase("Sunday", FontFactory.getFont(FontFactory.HELVETICA, 8)));
			c1.setBorderWidth(0.25f);
			c1.setBackgroundColor(new BaseColor(232, 232, 232));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			c1.setVerticalAlignment(Element.ALIGN_MIDDLE);
			t.addCell(c1);

			// Add the table details row
			Phrase ph;
			c1 = new PdfPCell();
			c1.setBorderWidth((float) 0.25);
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			ph = new Phrase("1", FontFactory.getFont(FontFactory.HELVETICA, 8));
			c1.addElement(ph);
			t.addCell(c1);

			c1 = new PdfPCell();
			c1.setBorderWidth((float) 0.25);
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			ph = new Phrase("Sandeep Sharma", FontFactory.getFont(FontFactory.HELVETICA, 8));
			c1.addElement(ph);
			t.addCell(c1);

			c1 = new PdfPCell();
			c1.setBorderWidth((float) 0.25);
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			ph = new Phrase("P", FontFactory.getFont(FontFactory.HELVETICA, 8));
			c1.addElement(ph);
			t.addCell(c1);

			c1 = new PdfPCell();
			c1.setBorderWidth((float) 0.25);
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			ph = new Phrase("P", FontFactory.getFont(FontFactory.HELVETICA, 8));
			c1.addElement(ph);
			t.addCell(c1);

			c1 = new PdfPCell();
			c1.setBorderWidth((float) 0.25);
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			ph = new Phrase("A", FontFactory.getFont(FontFactory.HELVETICA, 8));
			c1.addElement(ph);
			t.addCell(c1);

			c1 = new PdfPCell();
			c1.setBorderWidth((float) 0.25);
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			ph = new Phrase("P", FontFactory.getFont(FontFactory.HELVETICA, 8));
			c1.addElement(ph);
			t.addCell(c1);

			c1 = new PdfPCell();
			c1.setBorderWidth((float) 0.25);
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			ph = new Phrase("P", FontFactory.getFont(FontFactory.HELVETICA, 8));
			c1.addElement(ph);
			t.addCell(c1);

			c1 = new PdfPCell();
			c1.setBorderWidth((float) 0.25);
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			ph = new Phrase("OFF", FontFactory.getFont(FontFactory.HELVETICA, 8));
			c1.addElement(ph);
			t.addCell(c1);

			c1 = new PdfPCell();
			c1.setBorderWidth((float) 0.25);
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			ph = new Phrase("OFF", FontFactory.getFont(FontFactory.HELVETICA, 8));
			c1.addElement(ph);
			t.addCell(c1);

			// Finally add all into the document
			response.setHeader("Content-disposition", "inline; filename=\"Employee Attendance.pdf\"");
			document.add(t);
			document.close();
			addPageNumber("temp1.pdf", "newName.pdf", response, request);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	// Method for adding page number on the document
	public static void addPageNumber(String oldFileName, String newFileName, HttpServletResponse response,
			HttpServletRequest request) {
		try {
			String realPath = ServletActionContext.getServletContext().getRealPath("/assets");
			FileInputStream fis = new FileInputStream(realPath + "/" + "temp1.pdf");
			PdfReader reader = new PdfReader(fis);
			int totalPages = reader.getNumberOfPages();
			PdfStamper stamper = new PdfStamper(reader, response.getOutputStream());
			for (int i = 1; i <= totalPages; i++) {
				getHeaderTable(i, totalPages).writeSelectedRows(0, -1, 34, 30, stamper.getOverContent(i));
			}
			stamper.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static PdfPTable getHeaderTable(int x, int y) {
		PdfPTable table = new PdfPTable(2);
		try {
			table.setTotalWidth(490);
			table.setLockedWidth(true);
			table.getDefaultCell().setFixedHeight(20);
			table.getDefaultCell().setBorder(Rectangle.NO_BORDER);

			PdfPCell cell = new PdfPCell(new com.itextpdf.text.Phrase((""),
					new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 5)));
			cell.setBorder(Rectangle.NO_BORDER);
			table.addCell(cell);

			table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			table.getDefaultCell().setBorder(Rectangle.NO_BORDER);

			cell = new PdfPCell(new com.itextpdf.text.Phrase(String.format("Page %d of %d", x, y),
					new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 5)));
			cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_RIGHT);

			table.addCell(cell);

		} catch (Exception e) {
			System.out.println("getHeaderTable exception" + e.getMessage());
			e.printStackTrace();
		}
		return table;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletRequest getServletRequest() {
		return request;
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	public HttpServletResponse getServletResponse() {
		return response;
	}
}
