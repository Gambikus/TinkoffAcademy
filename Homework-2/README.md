# Домашня работа 2

## Программа
Код программы находится в классе [Main](./src/main/java/Main.java) в методе main,
я просто бесконечно добавлял элементы в ArrayList, чтобы вызвать OutOfMemoryError

## Дампы
Я установил приложение VisualVM, для создание ThreadDump и HeapDump.
Я запустил программу, выбрал нужный процесс и создал нужные дампы 

![Alt text](./resources/visualVM.png?raw=true)

## ThreadDump

![Alt text](./resources/threadsDump.png)

Честно говоря, не очень понял для чего это в данной ситуации.

## HeapDump

![Alt text](./resources/heapDump.png)

На скриншоте видно, что используется вся доступная память

Все ресурсы я прикрепил в эту [папку](./resources)