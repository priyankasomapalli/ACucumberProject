package pageclasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import managers.DriverManager;

public class TableTestPage {
	
	 private By tableRows = By.xpath("//table//tbody/tr");
	 
	 public List<Map<String,String>> getAllRowsData()
	 {
		 List<Map<String, String>> rows = new ArrayList<>();
	        List<WebElement> rowElements = DriverManager.getDriver().findElements(tableRows);

	        for (WebElement row : rowElements) {
	            List<WebElement> cells = row.findElements(By.tagName("td"));
	            if (cells.size() < 5) continue;  

	            Map<String, String> rowData = new HashMap<>();
	            rowData.put("ID",          cells.get(0).getText());
	            rowData.put("Course Name", cells.get(1).getText());
	            rowData.put("Language",    cells.get(2).getText());
	            rowData.put("Level",       cells.get(3).getText());
	            rowData.put("Enrollments", cells.get(4).getText());
	            rows.add(rowData);
	        }
	        return rows;
	 }
	 

}
