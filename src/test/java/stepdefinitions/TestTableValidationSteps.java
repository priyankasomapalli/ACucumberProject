package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import managers.DriverManager;
import pageclasses.TableTestPage;

public class TestTableValidationSteps {
	

	TableTestPage tablePage;

	    @Given("User is on the Test Table page")
	    public void user_is_on_the_test_table_page() {
	        DriverManager.getDriver().get("https://practicetestautomation.com/practice-test-table/");
	        
	    }

	    @Then("the table should contain the following courses")
	    public void the_table_should_contain_the_following_courses(DataTable expectedTable) {
	    	tablePage = new TableTestPage();
	        List<Map<String, String>> expectedRows = expectedTable.asMaps();
	        List<Map<String, String>> actualRows   = tablePage.getAllRowsData();

	        // 1. Row count check
	        Assert.assertEquals(
	            actualRows.size(),
	            expectedRows.size(),
	            "Row count mismatch. Expected " + expectedRows.size()
	                + " but found " + actualRows.size()
	        );

	        // 2. Row-by-row, cell-by-cell check
	        for (int i = 0; i < expectedRows.size(); i++) {
	            Map<String, String> expected = expectedRows.get(i);
	            Map<String, String> actual   = actualRows.get(i);

	            for (String column : expected.keySet()) {
	                Assert.assertEquals(
	                    actual.get(column),
	                    expected.get(column),
	                    "Mismatch at row " + (i + 1) + ", column '" + column + "'"
	                );
	            }
	        }
	    }
	}


