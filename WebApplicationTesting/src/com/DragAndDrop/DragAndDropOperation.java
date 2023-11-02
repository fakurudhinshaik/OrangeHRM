package com.DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOperation {

	WebDriver driver;
	public void ApplicationLaunch()
	{
		System.setProperty("webdriver.edge.driver", "./Libaray/msedgedriver.exe");
		driver = new EdgeDriver();
		
		String ApplicationUrlAddress="https://jqueryui.com/droppable/";
		driver.get(ApplicationUrlAddress);
		
		driver.manage().window().maximize();
	}
	
	public void ApplicationClose()
	{
		driver.quit();
	}
	
	public void dragAndDrop_getText() throws InterruptedException
	{
		By webPageFrameProperty=By.className("demo-frame");
		WebElement webPageFrame=driver.findElement(webPageFrameProperty);
		
		driver.switchTo().frame(webPageFrame);
		
		By dragMeToMyTargetProperty=By.id("draggable");
		WebElement dragMeToMyTarget=driver.findElement(dragMeToMyTargetProperty);
		
		String dragMeToMyTargetText=dragMeToMyTarget.getText();
		System.out.println("The Text Of An Element Drag Me To My Target is:-"+dragMeToMyTargetText);
		
		By droppableProperty=By.id("droppable");
		WebElement droppable=driver.findElement(droppableProperty);
	
		String droppableText=droppable.getText();
		System.out.println("The Text Of An Element Droppable is :-"+droppableText);
		
		Actions action =new Actions(driver);
		action.dragAndDrop(dragMeToMyTarget, droppable).build().perform();
		
		driver.switchTo().defaultContent();
		
		//<iframe src="/resources/demos/resizable/default.html" class="demo-frame"></iframe>
		
		By ResizableProperty=By.linkText("Resizable");
		WebElement Resizable=driver.findElement(ResizableProperty);
		Resizable.click();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		
		By SortableProperty=By.linkText("Sortable");
		WebElement Sortable=driver.findElement(SortableProperty);
		Sortable.click();
		
		System.out.println(driver.getTitle());
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		DragAndDropOperation drag = new DragAndDropOperation();
		
		drag.ApplicationLaunch();
		drag.dragAndDrop_getText();
		drag.ApplicationClose();
		
	}
}
