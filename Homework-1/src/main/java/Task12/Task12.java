package Task12;

import Task12.resources.Name;

import java.io.FileWriter;
import java.io.IOException;

public class Task12 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("src/main/java/Task12/resources/output.txt", false)) {
            for (Name name: Name.values()) {
                writer.append(name.toString() + '\n');
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
