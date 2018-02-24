public class Writer {
    public String sayHello(String name) {
        String nameInMessage = name;
        if (nameInMessage == null || "".equals(nameInMessage)) { //nameInMessage.equals("") w tym przypadku nullPointerExeption moze poleciec
            nameInMessage = "my friend";
        }
        return "Hello, " + nameInMessage + "!";
    }
}
