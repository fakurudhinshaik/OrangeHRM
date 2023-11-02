package com.TestingLoginFuntionalityOforangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_HeaderBlock {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./Libaray/geckodriver.exe");
		
		WebDriver driver;
		driver = new FirefoxDriver();
		
		String tsrtcApplicationUrlAdress="https://www.tsrtconline.in/oprs-web/guest/home.do?h=1";
		driver.get(tsrtcApplicationUrlAdress);
		
		/*<div class="menu-wrap">
		<div class="menu">
		<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
				Home</a>
<a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>			<a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Cancelled Services">Cancelled Services</a>
<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>
<a class="tabcopy blinking" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">Tourism</a>
<a class="tabcopy" href="/oprs-web/services/driverInfo.do" target="_top" title="Driver Info">Driver Info</a>
<!-- <a class="tabcopy" href="https://forms.gle/BVVhmKJ8gnd7rWvr8" target="_blank" title="Customer Survey Form" style="float: right !important;">Customer Survey Form</a> -->
</div>
</div>
		*/
		
	By tsrtc_HeaderBlockProperty=By.className("menu-wrap");
	WebElement tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);
	
	By tsrtc_HeaderBlockLinksProperty=By.tagName("a");
	List <WebElement>tsrtc_HeaderLinks=tsrtc_HeaderBlock.findElements(tsrtc_HeaderBlockLinksProperty);
	
	int tsrtc_HeaderBlockLinksCount=tsrtc_HeaderLinks.size();
	System.out.println("The number of links in the tsrtc Application are:-"+tsrtc_HeaderBlockLinksCount);
	
	for(int index=0;index<tsrtc_HeaderBlockLinksCount;index++)
	{
		String tsrtc_HeaderBlockLinksName =tsrtc_HeaderLinks.get(index).getText();
		System.out.println(index+""+tsrtc_HeaderBlockLinksName);
	
		tsrtc_HeaderLinks.get(tsrtc_HeaderBlockLinksCount).click();
	
	
	
	
	
	}	
	}

}
