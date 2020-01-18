package com.fanniemae.automation.listeners;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Path;
import java.util.Date;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.fanniemae.automation.registry.Registry;
import com.fanniemae.automation.registry.RegistryKey;
import com.fanniemae.automation.util.CommonUtils;
import com.fanniemae.automation.util.PathProvider;
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfAction;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class JyperionListener implements ITestListener {

	private static final Logger LOG = Logger.getLogger(JyperionListener.class.getName());

	private PdfPTable successTable = null;
	private PdfPTable failTable = null;
	private PdfPTable infoTable = null;
	private PdfPTable skipTable = null;

	private static final String TIMESTAMP;
	
	private Document document = null;

	private long testRunStartTime = 0L;
	private Path path;
	
	static{
		/*
		 * TIMESTAMP = "_"+CommonUtils.getTimestamp(FanniemaeConstants.DDMMYYHHMMSSSSS);
		 * Registry.setAttribute(RegistryKey.DIR_TIMESTAMP_SUFFIX, TIMESTAMP);
		 */
		
		TIMESTAMP = "_"+CommonUtils.getCurExeDirTimestamp();
		Registry.setAttribute(RegistryKey.DIR_TIMESTAMP_SUFFIX, TIMESTAMP);
	}
	
	public JyperionListener() {
		Object obj = Registry.getAttribute(RegistryKey.PDF_REPORT_FILE_PATH);
		path = (Objects.nonNull(obj)) ? ((Path)obj) : PathProvider.getGenPDFReportFilePath(TIMESTAMP);
	}

	public void onTestSuccess(ITestResult result) {
		LOG.info("On Test Success Result is: " + result);
		try {
			if (successTable == null) {

				successTable = new PdfPTable(new float[] { .5f, .1f, .5f });
				successTable.setTotalWidth(500f);
				successTable.setLockedWidth(true);
				Paragraph p = new Paragraph(DocumentContent.PASSED_TESTS, new Font(Font.TIMES_ROMAN, 11f, Font.BOLD));
				PdfPCell cell = new PdfPCell(p);
				cell.setColspan(4);
				cell.setBackgroundColor(Color.GREEN);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				successTable.addCell(cell);

				cell = new PdfPCell(new Paragraph(DocumentContent.TESTCASE_CLASS, new Font(Font.TIMES_ROMAN, 10)));
				cell.setBackgroundColor(Color.LIGHT_GRAY);
				successTable.addCell(cell);
				cell = new PdfPCell(new Paragraph(DocumentContent.TIMES, new Font(Font.TIMES_ROMAN, 10)));
				cell.setBackgroundColor(Color.LIGHT_GRAY);
				successTable.addCell(cell);
				cell = new PdfPCell(new Paragraph(DocumentContent.EXCEPTION, new Font(Font.TIMES_ROMAN, 10)));
				cell.setBackgroundColor(Color.LIGHT_GRAY);
				successTable.addCell(cell);
			}

			/*PdfPCell cell = new PdfPCell(
					new Paragraph(result.getTestClass().getName().split("\\.")[1], new Font(Font.TIMES_ROMAN, 8)));*/
			String name=result.getTestClass().getName();
			int subName=name.lastIndexOf('.');
			String subString=name.substring(++subName, name.length());
			PdfPCell cell = new PdfPCell(
					new Paragraph(subString, new Font(Font.TIMES_ROMAN, 8)));
			successTable.addCell(cell);
			double time = (result.getEndMillis() - result.getStartMillis());
			cell = new PdfPCell(new Paragraph(StringUtils.EMPTY + time / 1000, new Font(Font.TIMES_ROMAN, 8)));
			successTable.addCell(cell);

			Throwable throwable = result.getThrowable();
			if (throwable != null) {
				Paragraph excep = new Paragraph(
						new Chunk(throwable.toString(), new Font(Font.TIMES_ROMAN, Font.UNDERLINE, 8))
								.setLocalGoto(StringUtils.EMPTY + throwable.hashCode()));
				cell = new PdfPCell(excep);
				successTable.addCell(cell);
			} else {
				successTable.addCell(new PdfPCell(new Paragraph(StringUtils.EMPTY)));
			}
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
	}

	public void onTestFailure(ITestResult result) {
		LOG.info("On Test Failure Result is: " + result);
		if(Objects.isNull(result))
			return;
		Path screenshotsDirPath = PathProvider.getForScreenshotsDir();
		if (failTable == null) {
			failTable = new PdfPTable(new float[] { .5f, .1f, .5f });
			failTable.setTotalWidth(500f);
			failTable.setLockedWidth(true);
			Paragraph p = new Paragraph(DocumentContent.FAILED_TESTS, new Font(Font.TIMES_ROMAN, 11f, Font.BOLD));
			PdfPCell cell = new PdfPCell(p);
			cell.setColspan(4);
			cell.setBackgroundColor(Color.RED);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			failTable.addCell(cell);

			cell = new PdfPCell(new Paragraph(DocumentContent.TESTCASE_CLASS, new Font(Font.TIMES_ROMAN, 10)));
			cell.setBackgroundColor(Color.LIGHT_GRAY);
			failTable.addCell(cell);
			cell = new PdfPCell(new Paragraph(DocumentContent.TIMES, new Font(Font.TIMES_ROMAN, 10)));
			cell.setBackgroundColor(Color.LIGHT_GRAY);
			failTable.addCell(cell);
			cell = new PdfPCell(new Paragraph(DocumentContent.EXCEPTION, new Font(Font.TIMES_ROMAN, 10)));
			cell.setBackgroundColor(Color.LIGHT_GRAY);
			failTable.addCell(cell);
		}

		PdfPCell cell = new PdfPCell(
				new Paragraph(result.getTestClass().getName().split("\\.")[1], new Font(Font.TIMES_ROMAN, 8)));
		failTable.addCell(cell);
		double time = (result.getEndMillis() - result.getStartMillis());
		cell = new PdfPCell(new Paragraph(StringUtils.EMPTY + time / 1000, new Font(Font.TIMES_ROMAN, 8)));
		failTable.addCell(cell);

		Throwable throwable = result.getThrowable();
		if (throwable != null) {
			Chunk chunk = new Chunk(DocumentContent.LINKED_SCREENSHOT, new Font(Font.TIMES_ROMAN, 8, Font.UNDERLINE));
			chunk.setAction(new PdfAction(DocumentContent.FILE_PROTOCOL + screenshotsDirPath.toString()));
			Paragraph excep = new Paragraph(throwable.toString(), new Font(Font.TIMES_ROMAN, 8));
			excep.add(chunk);

			cell = new PdfPCell(excep);
			cell.setBackgroundColor(Color.LIGHT_GRAY);
			failTable.addCell(cell);
		} else {
			failTable.addCell(new PdfPCell(new Paragraph(StringUtils.EMPTY)));
		}
	}

	public void onTestSkipped(ITestResult result) {
		try {
			if (Objects.isNull(skipTable)) {
				skipTable = new PdfPTable(new float[] { .5f, .1f, .5f });
				skipTable.setTotalWidth(500f);
				skipTable.setLockedWidth(true);
				Paragraph p = new Paragraph(DocumentContent.SKIPPED_TESTS, new Font(Font.TIMES_ROMAN, 11f, Font.BOLD));
				PdfPCell cell = new PdfPCell(p);
				cell.setColspan(4);
				cell.setBackgroundColor(Color.ORANGE);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				skipTable.addCell(cell);

				cell = new PdfPCell(new Paragraph(DocumentContent.TESTCASE_CLASS, new Font(Font.TIMES_ROMAN, 10)));
				cell.setBackgroundColor(Color.LIGHT_GRAY);
				skipTable.addCell(cell);
				cell = new PdfPCell(new Paragraph(DocumentContent.TIMES, new Font(Font.TIMES_ROMAN, 10)));
				cell.setBackgroundColor(Color.LIGHT_GRAY);
				skipTable.addCell(cell);
				cell = new PdfPCell(new Paragraph(DocumentContent.EXCEPTION, new Font(Font.TIMES_ROMAN, 10)));
				cell.setBackgroundColor(Color.LIGHT_GRAY);
				skipTable.addCell(cell);
			}

			PdfPCell cell = new PdfPCell(
					new Paragraph(result.getTestClass().getName().split("\\.")[1], new Font(Font.TIMES_ROMAN, 8)));
			skipTable.addCell(cell);
			double time = (result.getEndMillis() - result.getStartMillis());
			cell = new PdfPCell(new Paragraph(StringUtils.EMPTY + time / 1000, new Font(Font.TIMES_ROMAN, 8)));
			skipTable.addCell(cell);
			Throwable throwable = result.getThrowable();
			if (throwable != null) {
				Paragraph excep = new Paragraph(
						new Chunk(throwable.toString(), new Font(Font.TIMES_ROMAN, Font.UNDERLINE, 8))
								.setLocalGoto(StringUtils.EMPTY + throwable.hashCode()));
				cell = new PdfPCell(excep);
				skipTable.addCell(cell);
			} else {
				skipTable.addCell(new PdfPCell(new Paragraph(StringUtils.EMPTY)));
			}

		} catch (Exception e) {
			LOG.error(e.getMessage());
		}

	}

	public void onStart(ITestContext context) {
		LOG.debug("onStart() context is: " + context);
		testRunStartTime = context.getStartDate().getTime();
		document = new Document();
		try {
			FileOutputStream outputStream = new FileOutputStream(path.toFile());
			Registry.setAttribute(RegistryKey.PDF_REPORT_OUTPUT_STREAM, outputStream);
			LOG.debug("PDF_REPORT_OUTPUT_STREAM is inserted into Registry.");
			PdfWriter.getInstance(document, outputStream);
			document.open();

			Paragraph paragraph = new Paragraph(context.getName().toUpperCase() + DocumentContent.TESTNG_RESULTS,
					FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD, new Color(0, 0, 255)));
			paragraph.setAlignment(Element.ALIGN_CENTER);
			document.add(paragraph);
			paragraph = new Paragraph(DocumentContent.EXECUTION_SUMMARY,
					FontFactory.getFont(FontFactory.HELVETICA, 10, Font.BOLD, new Color(0, 0, 150)));
			paragraph.setAlignment(Element.ALIGN_CENTER);
			paragraph.setSpacingBefore(20f);
			document.add(paragraph);
			infoTable = new PdfPTable(new float[] { .4f, .5f });
			infoTable.setTotalWidth(200f);
			infoTable.setLockedWidth(true);
			PdfPCell cell = new PdfPCell(new Paragraph(DocumentContent.EXECUTION_DATETIME, new Font(Font.TIMES_ROMAN, 7)));
			cell.setBackgroundColor(Color.LIGHT_GRAY);
			infoTable.addCell(cell);
			infoTable.addCell(new Paragraph(new Date().toString(), new Font(Font.TIMES_ROMAN, 7)));
		} catch (FileNotFoundException e) {
			LOG.error("Unable to locate Path["+ path +"]", e);
		} catch (DocumentException e) {
			LOG.error("error occurred while preparing PDF Document", e);
		} catch (Exception e) {
			LOG.error("Unknown error occurred while preparing PDF Documnet.");
		}
	}

	public void onFinish(ITestContext context) {
		long testRunEndTime = context.getEndDate().getTime();
		long testRunTime = testRunEndTime - testRunStartTime;
		try {
			PdfPCell cell = new PdfPCell(new Paragraph(DocumentContent.TOTAL_TEST_RUNTIME, new Font(Font.TIMES_ROMAN, 7)));
			cell.setBackgroundColor(Color.LIGHT_GRAY);
			infoTable.addCell(cell);
			infoTable.addCell(new Paragraph(WebElementOperations.covertMillis(testRunTime), new Font(Font.TIMES_ROMAN, 7)));

			cell = new PdfPCell(new Paragraph(DocumentContent.TESTING_URL, new Font(Font.TIMES_ROMAN, 7)));
			cell.setBackgroundColor(Color.LIGHT_GRAY);
			infoTable.addCell(cell);
			infoTable.addCell(new Paragraph(PathProvider.getFannieMaeBaseURL(), new Font(Font.TIMES_ROMAN, 7)));

			cell = new PdfPCell(new Paragraph(DocumentContent.TOTAL_TESTS, new Font(Font.TIMES_ROMAN, 7)));
			cell.setBackgroundColor(Color.LIGHT_GRAY);
			infoTable.addCell(cell);
			infoTable.addCell(new Paragraph(StringUtils.EMPTY + context.getAllTestMethods().length, new Font(Font.TIMES_ROMAN, 7)));

			cell = new PdfPCell(new Paragraph(DocumentContent.TEST_PASSED, new Font(Font.TIMES_ROMAN, 7)));
			cell.setBackgroundColor(Color.LIGHT_GRAY);
			infoTable.addCell(cell);
			infoTable.addCell(new Paragraph(StringUtils.EMPTY + context.getPassedTests().size(), new Font(Font.TIMES_ROMAN, 7)));

			cell = new PdfPCell(new Paragraph(DocumentContent.TEST_FAILED, new Font(Font.TIMES_ROMAN, 7)));
			cell.setBackgroundColor(Color.LIGHT_GRAY);
			infoTable.addCell(cell);
			infoTable.addCell(new Paragraph(StringUtils.EMPTY + context.getFailedTests().size(), new Font(Font.TIMES_ROMAN, 7)));

			cell = new PdfPCell(new Paragraph(DocumentContent.TEST_SKIPPED, new Font(Font.TIMES_ROMAN, 7)));
			cell.setBackgroundColor(Color.LIGHT_GRAY);
			infoTable.addCell(cell);
			infoTable.addCell(new Paragraph(StringUtils.EMPTY + context.getSkippedTests().size(), new Font(Font.TIMES_ROMAN, 7)));

			infoTable.setHorizontalAlignment(Element.ALIGN_CENTER);
			infoTable.setSpacingBefore(10f);
			document.add(infoTable);
			infoTable.setSpacingAfter(20f);
			Paragraph p = new Paragraph(DocumentContent.DETAILED_TEST_REPORT,FontFactory.getFont(FontFactory.HELVETICA, 10, Font.BOLD, new Color(0, 0, 150)));
			p.setAlignment(Element.ALIGN_CENTER);
			p.setSpacingBefore(20f);
			document.add(p);

			if (Objects.nonNull(failTable)) {
				failTable.setSpacingBefore(15f);
				document.add(failTable);
				failTable.setSpacingAfter(15f);
				failTable.setHorizontalAlignment(Element.ALIGN_CENTER);
			}
			if (Objects.nonNull(skipTable)) {
				skipTable.setSpacingBefore(15f);
				document.add(skipTable);
				skipTable.setSpacingAfter(15f);
				skipTable.setHorizontalAlignment(Element.ALIGN_CENTER);
			}
			if (Objects.nonNull(successTable)) {
				successTable.setSpacingBefore(15f);
				document.add(successTable);
				successTable.setSpacingAfter(15f);
				successTable.setHorizontalAlignment(Element.ALIGN_CENTER);
			}
			failTable = null;
			successTable = null;
			skipTable = null;
			
		} catch (DocumentException e) {
			LOG.error("unknown error occurred while preparing PDF document", e);
		}
		document.close();
	}

	public void onTestStart(ITestResult arg0) {
		LOG.info("New Test " + arg0.getMethod().toString().split("\\.")[0] + " started.");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		throw new UnsupportedOperationException("This operation is not allowed.");
	}

	static final class DocumentContent {
		public static final String EXECUTION_DATETIME = "Execution DateTime";
		public static final String FILE_PROTOCOL = "file:///";
		public static final String PASSED_TESTS = "PASSED TESTS";
		public static final String FAILED_TESTS = "FAILED TESTS";
		public static final String LINKED_SCREENSHOT = "  [ Linked SCREEN SHOT ]";
		private DocumentContent() {}
		public static final String TESTNG_RESULTS = " TESTNG RESULTS";
		public static final String TOTAL_TEST_RUNTIME = "Total Test Run Time";
		public static final String SKIPPED_TESTS = "SKIPPED TESTS";
		public static final String DETAILED_TEST_REPORT = "DETAILED TEST REPORT";
		public static final String TESTING_URL = "Testing URL";
		private static final String EXECUTION_SUMMARY = "EXECUTION SUMMARY";
		private static final String TEST_SKIPPED = "Test Skipped";
		private static final String TEST_FAILED = "Test Failed";
		private static final String TEST_PASSED = "Test Passed";
		private static final String TOTAL_TESTS = "Total Tests";
		private static final String TIMES = "Time(s)";
		private static final String TESTCASE_CLASS = "TestCase Class";
		private static final String EXCEPTION = "Exception";
	}
}
