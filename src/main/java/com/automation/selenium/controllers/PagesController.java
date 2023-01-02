package com.automation.selenium.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/interview-questions-on-selenium-cucumber-java-appium-jenkins-testng")
	public String interviewQuestions() {
		return "interview-questions-on-selenium-cucumber-java-appium-jenkins-testng";
	}

	@GetMapping("/java-programs-string-reverse-array-searching-sorting-merge-sort")
	public String java() {
		return "java-programs-string-reverse-array-searching-sorting-merge-sort";
	}

	@GetMapping("/git-tutorial-git-add-git-commit-git-push-git-rebase-git-stash")
	public String git() {
		return "git-tutorial-git-add-git-commit-git-push-git-rebase-git-stash";
	}

	@GetMapping("/xpath-write-xpath-using-or-and-startswith-endswith-and-dynamic-xpath")
	public String xpath() {
		return "xpath-write-xpath-using-or-and-startswith-endswith-and-dynamic-xpath";
	}

	@GetMapping("/testng-learn-testng-annotations-listeners-suite-xml")
	public String testng() {
		return "testng-learn-testng-annotations-listeners-suite-xml";
	}

	@GetMapping("/appium-mobile-automation-testing-for-both-ios-and-android")
	public String appium() {
		return "appium-mobile-automation-testing-for-both-ios-and-android";
	}
}