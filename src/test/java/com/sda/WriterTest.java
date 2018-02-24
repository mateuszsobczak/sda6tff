package com.sda;

import com.sda.Writer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WriterTest {
    private Writer writer;

    @Before
    public void init() {
        writer = new Writer();
    }

    @Test
    public void sayHelloWithGivenNameTest() {
        //com.sda.Writer writer = new com.sda.Writer();
        String name = "Szymon";
        String result = writer.sayHello(name);

        Assert.assertEquals("Expected hello message is invalid", "Hello, Szymon!", result);
    }

    @Test
    public void sayHelloWithNoNameSpecified() {
        //com.sda.Writer writer = new com.sda.Writer();
        String name = "";
        String result = writer.sayHello("");

        Assert.assertEquals("Hello, my friend!", result);

    }

    @Test
    public void sayHelloWithNullName() {
        //com.sda.Writer writer = new com.sda.Writer();
        String name = null;

        String result = writer.sayHello(name);
        Assert.assertEquals("Hello, my friend!", result);
    }

    @Test
    public void sayHelloWithUpperCasedName() {
        //com.sda.Writer writer = new com.sda.Writer();
        String name = "SZYMON";

        String result = writer.sayHello(name);
        Assert.assertEquals("HELLO, SZYMON!", result);
    }

    @Test
    public void sayHelloWithOneWhiteSpace() {
        String name = " ";

        String result = writer.sayHello(name);
        Assert.assertEquals("Hello, my friend!", result);
    }

    @Test
    public void sayHelloWithMultipleWhiteSpaces() {
        String name = "  ";

        String result = writer.sayHello(name);
        Assert.assertEquals("Hello, my friend!", result);
    }

    @Test
    public void sayHelloWithMultipleNames() {
        String name = "Szymon,Jan,Anna";

        String result = writer.sayHello(name);
        Assert.assertEquals("Hello, Szymon, Jan and Anna!", result);
    }

    @Test
    public void sayHelloWithMultipleCapitalizedNames() {
        String name = "SZYMON,JAN,ANNA";

        String result = writer.sayHello(name);
        Assert.assertEquals("HELLO, SZYMON, JAN AND ANNA!", result);
    }
}
