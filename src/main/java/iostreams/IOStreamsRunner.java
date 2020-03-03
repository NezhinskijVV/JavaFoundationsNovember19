package iostreams;

import oop.Dog;

import java.io.*;

public class IOStreamsRunner {
    public static void main(String[] args) {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            String input = bufferedReader.readLine();
//            System.out.println("Наша строка: " + input);
////            bufferedReader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                bufferedReader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

//        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
//            String input = bufferedReader.readLine();
//            System.out.println("Наша строка: " + input);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
//            String input;
//            while (!(input = bufferedReader.readLine()).equals("Exit")) {
//                System.out.println(input);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try (PrintWriter writer = new PrintWriter(new File("file.txt"))) {
//            writer.print("Привет, я PrintWriter");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

//        try (BufferedReader bufferedReader = new BufferedReader(
//                new FileReader("src\\main\\resources\\file.txt"))) {
//            System.out.println(bufferedReader.readLine());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //сериализация
//        try (ObjectOutputStream outputStream = new ObjectOutputStream(
//                new FileOutputStream("dog.out"))) {
//            outputStream.writeObject(new Dog("Жучка"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//десериализация
        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("dog.out"))) {
            Dog dog = (Dog) inputStream.readObject();
            System.out.println("dog.getName() = " + dog.getName());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

//HW: 1. Объект класса User (login, password) Проставить transient на password.
// Сериализоавть объект. После десериализовать объект и вывести поля login и password.
//    2. Даны 2 файла. В каждом файле содержится текст.
//    Необходимо поменять их местами.
//   3. Рассказать 3 способа создания объекта.
//   4. Написать свою запоминалку текста. Пользователь вводит имя файла и путь к нему.
//   Затем вводит макимум 10 предложений и все сохраняются в файле по выбранному пути.