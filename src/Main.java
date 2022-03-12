import java.io.File;
import java.util.Arrays;
import java.util.Random;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("Filejust.txt", true);
        Random random = new Random();
        File file = new File("Filejust");

        int countAdd = 10; //сколько строк добавить
        int randRange = 10; // верхний предел рандома


        for (int i = 0; i < countAdd; i++) {
            fw.write((random.nextInt(randRange)) + "\n");
        }
        fw.close();
        System.out.println("Длинна массива = "+(CountLinesInFile("Filejust.txt")));

    }


    public static int CountLinesInFile(String filename) throws IOException {
        // 1. Объявить внутренние переменные
        int count = 0; // количество строк в файле - результат
        FileReader fr = null;
        int symbol;

        // 2. Попытка открыть файл для чтения
        fr = new FileReader("Filejust.txt");

        // Цикл чтения символов из файла и подсчета их количества
        do {
            // Считать символ из файла
            symbol = fr.read();

            // Проверить, есть ли символ конца строки
            if ((char) symbol == '\n')
                count++; // Увеличить количество строк в файле на 1
        } while (fr.ready()); // Проверка на конец файла
        {

            // 4. Закрыть файл, если он был открыт

            if (fr != null) {
                fr.close();
            }

        }

        // 5. Вернуть результат
        return count;
    }

    public static void neww(String[] args) throws IOException{
        File f = new File("D:\\");
        f = new File("D:\\");
        long freeSpace;
        freeSpace = f.getFreeSpace();
        System.out.println("Drive C: - Free space = " + freeSpace);
    }

}
