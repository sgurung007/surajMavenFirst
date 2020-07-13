package org.testNgSuraj.extentsReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;

public class TestCaseOne {
    public ExtentSparkReporter htmlReporter;
    public ExtentReports extent;
    public ExtentTest test;

    @BeforeTest
    public void setReport() {
        htmlReporter = new ExtentSparkReporter("./reports.extent.html");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setDocumentTitle("w2 tital");
        htmlReporter.config().setReportName("Report suraj");
        htmlReporter.config().setTheme(Theme.STANDARD);

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        extent.setSystemInfo("Automation Tester", "Suraj gurung");
        extent.setSystemInfo("Organization", "way2Automation");
        extent.setSystemInfo("Build-No ", "W2A-1234");
    }

    @AfterTest
    public void endReport() {
        extent.flush();
    }

    @Test
    public void doUserReg() {
        test = extent.createTest("User Reg Test");
        Assert.fail("failing user reg test");

    }

    @Test
    public void validateTitle() {
        test = extent.createTest("Validate Tital Test");
        throw new SkipException("skipping validata tital");


    }

    @Test
    public void doLogin() {
        test = extent.createTest("Do login Test");
        test.info("suraj is in doLogin");
        test.log(Status.INFO, "Info status from the doLogin");
    }

    @AfterMethod
    public void teraDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            String failedMessage = Arrays.toString(result.getThrowable().getStackTrace());
            test.fail(failedMessage);
            String screenshot = "A:\\SurajIntellijProject\\surajMavenFirst\\src\\main\\resources\\women_swim_suit.jpg.jpg";
            try {
                test.fail("<b><font color=red>Screenshot of failure</font></b><br>", MediaEntityBuilder.createScreenCaptureFromPath(screenshot).build());
            } catch (IOException e) {
                e.printStackTrace();
            }
            Markup m = MarkupHelper.createLabel("Test Case Failed", ExtentColor.RED);

            test.log(Status.FAIL, m);

        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.log(Status.PASS, "Passed Test Gurung");
        } else if (result.getStatus() == ITestResult.SKIP) {
            test.log(Status.SKIP, "Skipped Test Gurung");
        }

    }

}
