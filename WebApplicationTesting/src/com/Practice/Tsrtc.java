package com.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsrtc {
	public static void main(String[] args) {
		
		WebDriver driver;
		

		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();

		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		driver.get(applicationUrlAddress);

		// Identifying the Header Block of the WebPage
		// class="menu-wrap" - property of the header Block

		By tsrtc_HeaderBlockProperty=By.className("menu-wrap");
		WebElement tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);

		// <a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home"> Home</a>
		// <a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
		// <a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
		// <a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Cancelled Services">Cancelled Services</a>

		By tsrtc_HeaderBlockLinksProperty=By.tagName("a");
		List<WebElement>tsrtc_HeaderBlockLinks=tsrtc_HeaderBlock.findElements(tsrtc_HeaderBlockLinksProperty);

		int tsrtc_HeaderBlockLinksCount=tsrtc_HeaderBlockLinks.size();
		System.out.println(" The number of links in the Header Block of TSRTC Applicatin HomePage are :- "+tsrtc_HeaderBlockLinksCount);

		// to goto the arrayList and get the names of the links assigned and stored
		for(int index=0;index<tsrtc_HeaderBlockLinksCount;index++)
		{
		String tsrtc_HeaderBlockLinkName=tsrtc_HeaderBlockLinks.get(index).getText();
		System.out.println(index+" "+tsrtc_HeaderBlockLinkName);

		// Performing an Operation on the links of the Hedear Block
		tsrtc_HeaderBlockLinks.get(index).click();

		// Thread.sleep(5000);

		String webPageTitle=driver.getTitle();
		System.out.println(webPageTitle);

		String webPageCurrentUrlAddress=driver.getCurrentUrl();
		System.out.println(webPageCurrentUrlAddress);

		System.out.println();

		driver.navigate().back();

		// Identifying the Header Block for another Time
		
		tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);
		
		
		// of the header Block - finding all the elements and storing back to the ArrayList
		// we are creating the arrayList for another time - because when the driver focus shits to
		// the next page the information stored in the arrayList of the driver will be cleared off
		// - so create the arrayList to identify the elements of the Header Block for another time
		// after coming back to WebPage
		
		
		tsrtc_HeaderBlockLinks=tsrtc_HeaderBlock.findElements(tsrtc_HeaderBlockLinksProperty);
		}

		driver.close();


		}

		

	}

