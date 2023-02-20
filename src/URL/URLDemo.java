package URL;

import java.io.IOException;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.autopartners.net/gmentsso/UI/Login?goto=https%3A%2F%2Fdealer.autopartners.net%3A443%2Fportal%2Fru%2FPages%2Fdefault.aspx");

            System.out.println("URL: " + url.toString());
            System.out.println("протокол: " + url.getProtocol());
            System.out.println("полномочия: " + url.getAuthority());
            System.out.println("имя файла: " + url.getFile());
            System.out.println("хост: " + url.getHost());
            System.out.println("путь: " + url.getPath());
            System.out.println("порт: " + url.getPort());
            System.out.println("порт по умолчанию: " + url.getDefaultPort());
            System.out.println("запрос: " + url.getQuery());
            System.out.println("ссылка: " + url.getRef());
            System.out.println("ссылка: " + url.openConnection());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


