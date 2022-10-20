package ru.vsu.cs.baturin_v_a;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    public static List<Employee> ParseCsv(String filePath) throws IOException {
        ArrayList<Employee> employees = new ArrayList<>();
        List<String> fileLines = Files.readAllLines(Paths.get(filePath));

        for (String fileLine : fileLines) {
            String[] splitedText = fileLine.split(";");
            ArrayList<String> columnList = new ArrayList<>();

            for (String s : splitedText) {
                if (IsColumnPart(s)) {
                    String lastText = columnList.get(columnList.size() - 1);
                    columnList.set(columnList.size() - 1, lastText + ";" + s);
                } else {
                    columnList.add(s);
                }
            }

            Employee employee = new Employee();

            employee.surname = columnList.get(0);
            employee.name = columnList.get(1);
            employee.email = columnList.get(2);
            employee.phoneNumber = columnList.get(3);
            employee.city = columnList.get(4);
            employee.salary = columnList.get(5);

            employees.add(employee);
        }
        return employees;
    }

    private static boolean IsColumnPart(String text) {
        String trimText = text.trim();

        return trimText.indexOf("\"") == trimText.lastIndexOf("\"") && trimText.endsWith("\"");
    }
}
