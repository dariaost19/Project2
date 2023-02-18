package project2;

public interface WebDriver {
    void open();
    void close();
    String getTitle();

}
interface RemoteWebDriver extends WebDriver{
    void navigate();
}
interface takesScreenshot extends WebDriver{
    void getScreenshot();
}
class ChromeDriver implements WebDriver{
    @Override
    public void open() {
        System.out.println("Open Chrome");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome");
    }

    @Override
    public String getTitle() {
        return null;
    }
}
class Firefox implements WebDriver{
    @Override
    public void open() {
        System.out.println("open FireFox");

    }

    @Override
    public void close() {
        System.out.println("Close Fire Fox");
    }

    @Override
    public String getTitle() {
        return null;
    }
}
class Safari implements WebDriver{

    @Override
    public void open() {
        System.out.println("Open Safari");
    }

    @Override
    public void close() {
        System.out.println("close Safari");
    }

    @Override
    public String getTitle() {
        return null;
    }
}
class WebDriverTester{
    public static void main(String[] args) {
        WebDriver[] webDriver={new ChromeDriver(),new Firefox(),new Safari()};
        for(WebDriver wd:webDriver){
           wd.close();
           wd.open();
           wd.getTitle();

        }
    }
}

