import java.io.*;
// Permitem gravar tipos primitivos (int, double, boolean, etc.) e String de forma estruturada.
public class ExemploDataStream {
    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream("dados.bin"));
        out.writeInt(123);
        out.writeDouble(45.6);
        out.writeUTF("Olá, mundo!");
        out.close();

        DataInputStream in = new DataInputStream(new FileInputStream("dados.bin"));
        System.out.println(in.readInt());
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());
        in.close();
    }
}