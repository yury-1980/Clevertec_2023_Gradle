### Выполнена эта часть задания + Часть с модулями + Плагин
Проект совместим с java 17.
Создаётся файл.jar «utils-1.3.5.jar».
Манифест содержит имя и версию .jar файла. 
В .jar файле находится class StringUtils с методом boolean isPositiveNumber(String str).
Написан один unit test для проверки этого метода ( с использованием JUnit 5).

#### Дополнения
Часть действий происходит в scriptPlugin.gradle.
Создать мульти-модульный проект с двумя модулями: core, api.
В модуле core должен быть class Utils с методом boolean isAllPositiveNumbers(String… str).
Использовать utils-1.3.5.jar сделанный на предыдущих этапах, для возможности переиспользовать
метод boolean isPositiveNumber(String str) в модуле core.
В модуле api должен быть class App с методом main. 
Из модуля api в методе main вызвать Utils.isAllPositiveNumbers("12", "79").
Написать один unit test для проверки этого метода boolean isAllPositiveNumbers(String… str)(использовать JUnit 5).

