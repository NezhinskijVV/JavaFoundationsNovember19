package exceptions;

public class Man {
    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) throws MyBeautifulException {
        if (age < 0) {
            throw new MyBeautifulException();
        }
        this.age = age;
    }
}

//HW: 1.Запомнить архитектуру Exception.
// И записать аудио, чем отличается проверяемые от непроверяемых
// 2. Создать свою ошибку и пробросить ее наверх.( Унасследовать от RuntimeException)
// Строки:
//1. Рассказать отличие String, StringBuilder и StringBuffer.
//2. Рассказать зачем нужен пул строк.
//3. Написать метод, является ли заданное слово полиндромом.