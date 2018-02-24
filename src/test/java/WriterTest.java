import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WriterTest {
    private Writer writer;
    @Before
    public void init(){
        writer = new Writer();
    }
    @Test
    public void sayHelloWithGivenNameTest() {
        //Writer writer = new Writer();
        String name = "Szymon";
        String result = writer.sayHello(name);

        Assert.assertEquals("Expected hello message is invalid", "Hello, Szymon!", result);
    }

    @Test
    public void sayHelloWithNoNameSpecified() {
        //Writer writer = new Writer();
        String name = "";
        String result = writer.sayHello("");

        Assert.assertEquals("Hello, my friend!", result);

    }

    @Test
    public void sayHelloWithNullName() {
        //Writer writer = new Writer();
        String name = null;

        String result = writer.sayHello(name);
        Assert.assertEquals("Hello, my friend!", result);
    }
    @Test
    public void sayHelloWithUpperCasedName(){
        //Writer writer = new Writer();
        String name = "SZYMON";

        String result = writer.sayHello(name);
        Assert.assertEquals("HELLO, SZYMON!", result);
    }
    @Test
    public void sayHelloWithOneWhiteSpace(){
        String name = " ";

        String result = writer.sayHello(name);
        Assert.assertEquals("Hello, my friend!", result);
    }
    @Test
    public void sayHelloWithMultipleWhiteSpaces(){
        String name = "  ";

        String result = writer.sayHello(name);
        Assert.assertEquals("Hello, my friend!", result);
    }
}
