# ticket-core
Микросервисное приложение позволяющее осуществлять поддержку пользователей.

Основные сервисы:
* user-service - Управление пользователями и аутентификацией.
Профиль пользователя, просмотр своих заявок.
* ticket-service - Управление заявками.
Создание новых заявок, отсылка в routing-service
* routing-service - Маршрутизация заявок с помощью ИИ
ИИ будет решать на какой отдел назначить заявку и какими тэгами описать заявку,
* department-service - Управление отделами
Решает, кому из отдела назначить заявку, управляет уведомлениями(?), SLA.

## Инструкция по запуску
Запуск - ``build_and_deploy.bat``
Остановка - ``stop_k8s.bat``
Открыть порты для дебага - ``open_ports.bat``
В файл ``С:\Windows\System32\drivers\etc\hosts`` нужно добавить следующие записи:
```
27.0.0.1 ticket-core.localhost
```

## Используемые технологии
Java 21, Lombok, Docker, K8s, Swagger (Spring Doc)

user-service: 
ticket-service: Spring Web, Jooq, Liquibase, Kafka
routing-service:
department-service:

## Используемые порты
user-service: 8080
user-service: 8080
ticket-service:8081
routing-service: 8082
department-service: 8083

user-servce-db(POSTGRE): 5433

## ToDo

## Баги, с которыми столкнулся
* Liquibase. Видимо с 5 версии изменили логику переменных (<property name="tableName" value="content"/>)
Теперь, когда переменной задаётся значение в первом исполняемом ченчлоге, то её значение невозможно переопределить без указания доп параметра global="false".

