package com.DragAndDropOperation;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DragMeToMyTarget {
	WebDriver driver;
	
	public void ApplicationLaunch()
	{
		
		System.setProperty("webdriver.edge.driver", "./Libaray/msedgedriver.exe");
		driver = new EdgeDriver();
		
		String ApplicationUrlAddress="https://jqueryui.com/droppable/";
		driver.get(ApplicationUrlAddress);
	}

	public void ApplicationClose()
	{
		
	driver.quit();
	
	}
	
	public void DragAndDropGetText()
	{
	
		By DargMeToMyTargetProperty=By.className("demo-frame");
		WebElement DargMeToMyTarget=driver.findElement(DargMeToMyTargetProperty);
		
		driver.switchTo().frame(DargMeToMyTarget);
		
		By dragMeToTargetProperty=By.id("draggable");
		WebElement dragMeToTarget=driver.findElement(dragMeToTargetProperty);
	
		String dragMeToTargetText=dragMeToTarget.getText();
		System.out.println("The Text Of An Element Drag Me To My Target is:-"+dragMeToTargetText);
		
		By droppableProperty=By.id("droppable");
		WebElement droppable=driver.findElement(droppableProperty);
		
		String droppableText=droppable.getText();
		System.out.println("The Text Of An Element Droppable is:-"+droppableText);
		
	}
	
	
	
	public static void main(String[] args) {
		
		DragMeToMyTarget drag = new DragMeToMyTarget();
		drag.ApplicationLaunch();
		drag.DragAndDropGetText();
		drag.ApplicationClose();
		
	}
}
