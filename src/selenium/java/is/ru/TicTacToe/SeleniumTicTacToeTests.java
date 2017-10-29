package is.ru.TicTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumTicTacToeTests extends SeleniumTestWrapper {
  
  @Before
  public void reset() {
	  driver.get(baseUrl);
	  WebElement input = driver.findElement(By.id("replayButton"));
	  input.click();
  }
  
  @Test
  public void testTitleMatches() {
    driver.get(baseUrl);
    assertEquals("Tic-Cat-Dog", driver.getTitle());
  }

  @Test
  public void testClickField() throws Exception {
    driver.get(baseUrl);
    WebElement input = driver.findElement(By.id("0"));
    input.click();
	System.out.println(input.getAttribute("src"));
	assertEquals(baseUrl + "images/cat_regular.png", input.getAttribute("src"));
  }
  
  @Test
  public void testClickTwoFields() throws Exception {
    driver.get(baseUrl);
    WebElement input1 = driver.findElement(By.id("1"));
	WebElement input2 = driver.findElement(By.id("2"));
    input1.click();
	input2.click();
	assertEquals(baseUrl + "images/dog_regular.png", input2.getAttribute("src"));
  }
}