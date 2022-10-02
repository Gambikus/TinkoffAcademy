# Домашнее задание 4

### Процесс выполнения ДЗ
- Развернул приложение с помощью SpringBoot Initializer
- Следуя гайду, изменил файл [application.properties](./homework-4/src/main/resources/application.properties) 
и собрал проект с помощью Мавена, чтобы выполнить задание.

### Проверка ДЗ

- Чтобы запустить приложение, нужно запустить метод main класса [Homework4Application](./homework-4/src/main/java/com/example/homework4/Homework4Application.java)
- Чтобы проверить правильность выполнения задания нужно сделать GET-запрос на адрес **localhost:8080/actuator/info**,
он вернет JSON-файл:
```
{
    "build": {
        "artifact": "homework-4",
        "name": "homework-4",
        "time": "2022-10-02T12:22:03.089Z",
        "version": "0.0.1-SNAPSHOT",
        "group": "com.example"
    }
}
```