package pages;

import org.codacy.BasePage;
import org.codacy.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.lang.management.GarbageCollectorMXBean;

public class CommitsPage extends BasePage {
    private static final String COMMIT_TABLE23 = "//*[@class=\"pull-left col-xs-12 files-wrapper4\"]";
    private static final String COMMIT_TABLE22 = "//*[@class=\"pull-left col-xs-12 files-wrapper4\"]";
    private static final String COMMIT_TABLE21 = "//*[@class=\"pull-left col-xs-12 files-wrapper4\"]";
    private static final String COMMIT_TABLE20 = "//*[@class=\"pull-left col-xs-12 files-wrapper4\"]";
    private static final String COMMIT_TABLE19 = "//*[@class=\"pull-left col-xs-12 files-wrapper4\"]";
    private static final String COMMIT_TABLE18 = "//*[@class=\"pull-left col-xs-12 files-wrapper4\"]";
    private static final String COMMIT_TABLE17 = "//*[@class=\"pull-left col-xs-12 files-wrapper4\"]";
    private static final String COMMIT_TABLE16 = "//*[@class=\"pull-left col-xs-12 files-wrapper4\"]";
    private static final String COMMIT_TABLE15 = "//*[@class=\"pull-left col-xs-12 files-wrapper4\"]";
    private static final String COMMIT_TABLE14 = "//*[@class=\"pull-left col-xs-12 files-wrapper4\"]";
    private static final String COMMIT_TABLE13 = "//*[@class=\"pull-left col-xs-12 files-wrapper4\"]";
    private static final String COMMIT_TABLE12 = "//*[@class=\"pull-left col-xs-12 files-wrapper4\"]";
    private static final String COMMIT_TABLE11 = "//*[@class=\"pull-left col-xs-12 files-wrapper4\"]";
    private static final String COMMIT_TABLE10 = "//*[@class=\"pull-left col-xs-12 files-wrapper4\"]";
    private static final String COMMIT_TABLE9 = "//*[@class=\"pull-left col-xs-12 files-wrapper4\"]";
    private static final String COMMIT_TABLE8 = "//*[@class=\"pull-left col-xs-12 files-wrapper4\"]";
    private static final String COMMIT_TABLE7 = "//*[@class=\"pull-left col-xs-12 files-wrapper4\"]";
    private static final String COMMIT_TABLE6 = "//*[@class=\"pull-left col-xs-12 files-wrapper4\"]";
    private static final String COMMIT_TABLE5 = "//*[@class=\"pull-left col-xs-12 files-wrapper4\"]";
    private static final String COMMIT_TABLE4 = "//*[@class=\"pull-left col-xs-12 files-wrapper4\"]";
    private static final String COMMIT_TABLE3 = "//*[@class=\"pull-left col-xs-12 files-wrapper3\"]";
    private static final String COMMIT_TABLE2 = "//*[@class=\"pull-left col-xs-12 files-wrapper2\"]";
    private static final String COMMIT_TABLE = "//*[@class=\"pull-left col-xs-12 files-wrapper\"]";
    private static final String COLUMN_STATUS = "status_column";
    private static final String COLUMN_AUTHOR = "status_author";
    private static final String COLUMN_COMMIT = "status_commit";
    private static final String COLUMN_MESSAGE = "status_message";
    private static final String COLUMN_CREATED = "status_created";
    private static final String COLUMN_ISSUES = "status_issues";
    private static final String SELECT_COMMIT = "//*[@href=\"/app/qateste/landing-page-2018/commit?bid=28252&cid=8665066\"]";
    private static final String COMMIT_DETAIL_STATUS_BANNER = "commit_status_banner_invite_container";
    private static final String COMMIT_DETAIL_CONTAINER = "commit_detail_container";
    private static final String COMMIT_DETAIL_TIME = "//*[@class=\"commit-time\"]";
    private static final String COMMIT_DETAIL_DESCRIPTION = "commit_description";
    private static final String COMMIT_DETAIL_STATUS = "commit_status_container";
    private static final String COMMIT_METRICS_DETAIL_CONTAINER = "commit_metrics";
    private static final String METRICS_ISSUES_TOOLTIP = "issues_tooltip";
    private static final String METRICS_DUPLICATION_TOOLTIP = "duplication_tooltip";
    private static final String METRICS_COMPLEXITY_TOOLTIP = "complexity-tooltip";
    private static final String METRICS_COVERAGE_TOOLTIP = "coverage_tooltip";
    private static final String COMMIT_DETAIL_TAB_CONTAINER = "commit_detail_tabs";
    private static final String DETAIL_NEW_ISSUE_TAB = "new_issues_tab";
    private static final String DETAIL_NEW_ISSUE_PANEL = "newIssuesView";
    private static final String DETAIL_FIXED_ISSUE_TAB = "fixed_issues_tab" ;
    private static final String DETAIL_FIXED_ISSUE_PANEL = "fixedIssuesView";
    private static final String DETAIL_NEW_DUPLICATION_TAB = "new_duplication_tab";
    private static final String DETAIL_NEW_DUPLICATION_PANEL = "newClonesView";
    private static final String DETAIL_FIXED_DUPLICATION_TAB = "fixed_duplication_tab";
    private static final String DETAIL_FIXED_DUPLICATION_PANEL = "fixedClonesView";
    private static final String DETAIL_FILES_TAB = "files_tab";
    private static final String DETAIL_FILES_PANEL = "filesView";
    private static final String DETAIL_DIFF_TAB = "diffToggle";
    private static final String DETAIL_DIFF_PANEL = "diffView";
    private static final String COMMIT_VIEW_LOGS = "logs_open";

    public CommitsPage(RemoteWebDriver driver, Environment env) {
        super(driver, env);
    }

    public void validateCommitTable() {
        getElementWhenVisible(By.xpath(COMMIT_TABLE)).isDisplayed();
        getElementWhenVisible(By.id(COLUMN_STATUS)).isDisplayed();
        getElementWhenVisible(By.id(COLUMN_AUTHOR)).isDisplayed();
        getElementWhenVisible(By.id(COLUMN_COMMIT)).isDisplayed();
        getElementWhenVisible(By.id(COLUMN_MESSAGE)).isDisplayed();
        getElementWhenVisible(By.id(COLUMN_CREATED)).isDisplayed();
        getElementWhenVisible(By.id(COLUMN_ISSUES)).isDisplayed();
    }


    public void selectCommit() {

        getElementWhenVisible(By.xpath(SELECT_COMMIT)).click();

    }

    public void validateCommitDetailStatusBanner () {

        getElementWhenVisible(By.id(COMMIT_DETAIL_STATUS_BANNER)).isDisplayed();
    }

    public void validateCommitDetailContainer() {

        getElementWhenVisible(By.id(COMMIT_DETAIL_CONTAINER)).isDisplayed();
        getElementWhenVisible(By.xpath(COMMIT_DETAIL_TIME)).isDisplayed();
        getElementWhenVisible(By.id(COMMIT_DETAIL_STATUS)).isDisplayed();
        getElementWhenVisible(By.id(COMMIT_DETAIL_DESCRIPTION)).isDisplayed();
        getElementWhenVisible(By.id(COMMIT_VIEW_LOGS)).isDisplayed();

    }

    public void validateCommitDetailMetrics() {

        getElementWhenVisible(By.id(COMMIT_METRICS_DETAIL_CONTAINER)).isDisplayed();
        getElementWhenVisible(By.id(METRICS_ISSUES_TOOLTIP)).isDisplayed();
        getElementWhenVisible(By.id(METRICS_DUPLICATION_TOOLTIP)).isDisplayed();
        getElementWhenVisible(By.id(METRICS_COMPLEXITY_TOOLTIP)).isDisplayed();
        getElementWhenVisible(By.id(METRICS_COVERAGE_TOOLTIP)).isDisplayed();

    }

    public void validateCommitDetailMetrics() {

        getElementWhenVisible(By.id(COMMIT_METRICS_DETAIL_CONTAINER)).isDisplayed();
        getElementWhenVisible(By.id(METRICS_ISSUES_TOOLTIP)).isDisplayed();
        getElementWhenVisible(By.id(METRICS_DUPLICATION_TOOLTIP)).isDisplayed();
        getElementWhenVisible(By.id(METRICS_COMPLEXITY_TOOLTIP)).isDisplayed();
        getElementWhenVisible(By.id(METRICS_COVERAGE_TOOLTIP)).isDisplayed();

    }

    public void validateCommitDetailMetrics() {

        getElementWhenVisible(By.id(COMMIT_METRICS_DETAIL_CONTAINER)).isDisplayed();
        getElementWhenVisible(By.id(METRICS_ISSUES_TOOLTIP)).isDisplayed();
        getElementWhenVisible(By.id(METRICS_DUPLICATION_TOOLTIP)).isDisplayed();
        getElementWhenVisible(By.id(METRICS_COMPLEXITY_TOOLTIP)).isDisplayed();
        getElementWhenVisible(By.id(METRICS_COVERAGE_TOOLTIP)).isDisplayed();

    }

    select * from tables where cenas = 1

    public void validateCommitDetailTabs() {

        getElementWhenVisible(By.id(COMMIT_DETAIL_TAB_CONTAINER)).isDisplayed();
        getElementWhenVisible(By.id(DETAIL_NEW_ISSUE_TAB)).click();
        getElementWhenVisible(By.id(DETAIL_NEW_ISSUE_PANEL)).isDisplayed();
        getElementWhenVisible(By.id(DETAIL_FIXED_ISSUE_TAB)).click();
        getElementWhenVisible(By.id(DETAIL_FIXED_ISSUE_PANEL)).isDisplayed();
        getElementWhenVisible(By.id(DETAIL_NEW_DUPLICATION_TAB)).click();
        getElementWhenVisible(By.id(DETAIL_NEW_DUPLICATION_PANEL)).isDisplayed();
        getElementWhenVisible(By.id(DETAIL_FIXED_DUPLICATION_TAB)).click();
        getElementWhenVisible(By.id(DETAIL_FIXED_DUPLICATION_PANEL)).isDisplayed();
        getElementWhenVisible(By.id(DETAIL_FILES_TAB)).click();
        getElementWhenVisible(By.id(DETAIL_FILES_PANEL)).isDisplayed();
        getElementWhenVisible(By.id(DETAIL_DIFF_TAB)).click();
        getElementWhenVisible(By.id(DETAIL_DIFF_PANEL)).isDisplayed();

    }

}
