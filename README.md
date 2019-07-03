# test
test repository
this is a new line
https://d1nnmphtabvt1n.cloudfront.net/#/


public class BasePage1 {
	WebDriver driver;
	BasePage1(WebDriver driver){
		this.driver=driver;
	}
	
	public void clickLoginDialogue() {
		
		driver.findElement(By.className("users")).click();
		
		WebElement element = new WebDriverWait(driver,10).until(ExpectedConditions.invisibilityOfElementLocated(By.id("#loginDialog")));
		
	}
  
  public void clickLoginButton(){
		driver.findElement(By.cssSelector(".v-card__actions [aria-label='login']"));
	}

protected static WebDriver driver;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@BeforeEach
	void setUp() throws Exception {
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	
		driver.get("https://d1nnmphtabvt1n.cloudfront.net/" );
	}
