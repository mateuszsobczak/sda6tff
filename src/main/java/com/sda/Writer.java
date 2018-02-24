package com.sda;

import org.apache.commons.lang3.StringUtils;

import java.util.stream.Stream;

public class Writer {
    public String sayHello(String name) {
        String[] names = name != null ? name.split(",") : new String[1];
        String nameSection = names.length == 1 ? name : convertToMessage(names);

        String greeting = "Hello, ";
        //String output = greeting + nameSection + "!";
        /*if (StringUtils.isAllUpperCase(nameSection)) {
            greeting = StringUtils.upperCase(greeting);

        }*/
        if (/*nameSection == null || "".equals(nameSection)|| */StringUtils.isBlank(nameSection)) { //nameSection.equals("") w tym przypadku nullPointerExeption moze poleciec
            nameSection = "my friend";
        }

        String output = greeting + nameSection + "!";
        return isAllUppercase(names) ? StringUtils.upperCase(output) : output;
    }

    private String convertToMessage(String[] names) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < names.length; i++) {
            sb.append(names[i]);
            if (i < names.length - 2) {
                sb.append(", ");
            } else if (i == names.length - 2) {
                sb.append(" and ");
            }
        }
        return sb.toString();
    }
    private boolean isAllUppercase(String [] names){
        return Stream.of(names)
                .allMatch(e -> StringUtils.isAllUpperCase(e));
    }
}
