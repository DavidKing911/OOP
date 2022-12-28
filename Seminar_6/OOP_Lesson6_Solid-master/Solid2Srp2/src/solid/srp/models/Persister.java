package solid.srp.models;

import java.io.IOException;
import java.io.FileWriter;

public class Persister {
    String fileName;

    public Persister(String fileName) {
        this.fileName = fileName;
    }

    public void saveToJson(Order order) {
       
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClientName() + "\",\n");
            writer.write("\"product\":\""+order.getProduct()+"\",\n");
            writer.write("\"qnt\":"+order.getQnt()+",\n");
            writer.write("\"price\":"+order.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}