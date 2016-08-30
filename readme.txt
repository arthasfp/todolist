Test Task for JavaRush
To do list
Приложение работает на SpringBoot.
Добавлен .gitignore, чтоб невыкладывать Файлы проекта .idea, target и *.iml
Использовал технологии: •	Maven
                        •	Spring
                        •	Hibernate
                        •	Tomcat 7
                        •	Mysql
                        •   Lombok
                        •	Frontend: angular, html, css (bootstrap)

Билдить используя Maven - clean install.
Запуск java -jar com.todolist-1.0.jar

Танцы с бубном:
Для упрощения POJO классов воспользовался библиотекой Lombok.
Помимо депенденси для IDEA нужно установить плагин, а также поставить галочку для
Settings - Annotation Processors - Enable annotation processing.
Как альтернатива - Alt + Insert для каждого геттера и сеттера в POJO классах (TODO, USER)

Для создания таблиц(+ инфа) JavaRushSqlScript.sql (экспортировал через workbench)
Можно и без скрипта но тогда надо дропнуть таблицы. Сервак сам создаст таблицы, но без данных.

На главной странице ввести логин для теста test(Пустой тоже считается).
Логин можно любой (будет добавлен в БД автоматически).
Можно добавить, удалить TO DO или заменить статус.