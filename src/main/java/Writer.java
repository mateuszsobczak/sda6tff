import org.apache.commons.lang3.StringUtils;

public class Writer {
    public String sayHello(String name) {

        String nameInMessage = name;
        String greeting = "Hello, ";
        //String output = greeting + nameInMessage + "!";
        if (StringUtils.isAllUpperCase(nameInMessage)) {
            greeting = StringUtils.upperCase(greeting);

        }
        if (/*nameInMessage == null || "".equals(nameInMessage)|| */StringUtils.isBlank(nameInMessage)) { //nameInMessage.equals("") w tym przypadku nullPointerExeption moze poleciec
            nameInMessage = "my friend";
        }

        return greeting + nameInMessage + "!";
    }
}
