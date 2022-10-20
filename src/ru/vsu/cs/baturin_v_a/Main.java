package ru.vsu.cs.baturin_v_a;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        String filePath = "src/ru/vsu/cs/baturin_v_a/employees";

        List<Employee> employees = Parser.ParseCsv(filePath);

        for (int i = 0; i < 5; i++) {
            System.out.println(employees.get(i));
        }
    }
}
