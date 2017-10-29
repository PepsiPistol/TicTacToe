package is.ru.TicTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumTicTacToeTests extends SeleniumTestWrapper {
  
  @Test
  public void testResetGame() throws Exception{
   driver.get(baseUrl);
   WebElement input = driver.findElement(By.id("1"));
   input.click();
   Thread.sleep(200);
   WebElement reset = driver.findElement(By.id("replayButton"));
   reset.click();
   Thread.sleep(200);
   WebElement input2 = driver.findElement(By.id("1"));
   	assertEquals(baseUrl+ "images/blank.png", input2.getAttribute("src"));
  }  

  @Before
  public void reset() {
	  driver.get(baseUrl);
	  WebElement input = driver.findElement(By.id("replayButton"));
	  input.click();
  }
  
  @Test
  public void testClickField() throws Exception {
    driver.get(baseUrl);
    WebElement input = driver.findElement(By.id("0"));
    input.click();
	System.out.println(input.getAttribute("src"));
   Thread.sleep(500);
	assertEquals(baseUrl + "images/cat_regular.png", input.getAttribute("src"));
  }
  
  @Test
  public void testClickTwoFields() throws Exception {
    driver.get(baseUrl);
    WebElement input1 = driver.findElement(By.id("1"));
	WebElement input2 = driver.findElement(By.id("2"));
    input1.click();
    Thread.sleep(200);
	input2.click();
        Thread.sleep(500);
	assertEquals(baseUrl + "images/dog_regular.png", input2.getAttribute("src"));
  }

   @Test
   public void testCatWins() throws Exception{
   driver.get(baseUrl);
   WebElement cat1 = driver.findElement(By.id("0"));
   cat1.click();
   Thread.sleep(100); 
   WebElement dog1 = driver.findElement(By.id("1"));
   dog1.click();
   Thread.sleep(100);
   WebElement cat2 = driver.findElement(By.id("3"));
   cat2.click();
   Thread.sleep(100);
   WebElement dog2 = driver.findElement(By.id("5"));
   dog2.click();
   Thread.sleep(100);   
   WebElement cat3 = driver.findElement(By.id("6"));
   cat3.click();
   Thread.sleep(200);
   WebElement Winner = driver.findElement(By.className("winnerStatus"));
   assertEquals("status1", Winner.getAttribute("id"));
   }

   @Test
   public void testDogWins() throws Exception{
   driver.get(baseUrl);
   WebElement cat1 = driver.findElement(By.id("0"));
   cat1.click();
   Thread.sleep(200); 
   WebElement dog1 = driver.findElement(By.id("2"));
   dog1.click();
   Thread.sleep(200);
   WebElement cat2 = driver.findElement(By.id("4"));
   cat2.click();
   Thread.sleep(200);
   WebElement dog2 = driver.findElement(By.id("5"));
   dog2.click();
   Thread.sleep(200);   
   WebElement cat3 = driver.findElement(By.id("6"));
   cat3.click();
   Thread.sleep(200);
   WebElement dog3 = driver.findElement(By.id("8"));
   dog3.click();
   Thread.sleep(500);
   WebElement Winner = driver.findElement(By.className("winnerStatus"));
   assertEquals("status2", Winner.getAttribute("id"));
   }	

  @Test
  public void testDevMan() throws Exception {
  driver.get(baseUrl+"/developermanual");
   Thread.sleep(500);
  WebElement plugin = driver.findElement(By.id("plugin"));
  assertEquals("application/pdf", plugin.getAttribute("type"));
  }

  @Test
  public void testAdminMan() throws Exception {
  driver.get(baseUrl+"/administrationmanual");
   Thread.sleep(500);
  WebElement plugin = driver.findElement(By.id("plugin"));
  assertEquals("application/pdf", plugin.getAttribute("type"));
  }

  @Test
  public void testDesignReport() throws Exception {
  driver.get(baseUrl + "/designreport");
    Thread.sleep(500);
  WebElement plugin = driver.findElement(By.id("plugin"));
  assertEquals("application/pdf", plugin.getAttribute("type"));
 }
 
}
