Проект для демонстрации api и implementation зависимостей gradle

libs - содержит подмодули

public-module - публичный модуль для api
internal-module - внутренний модуль без явного подключения в виде зависимости использование приведет к ошибке компиляции
library-module - модуль библиотеки, которую можно будет использовать только черзе интерфейс 
interface-only-access - модуль, зависимость на который приводит к тому что использовать можно будет только его и публичный модуль

предполагается установка в локальный мавен репозиторий с помощью

gradle publishToMavenLocal

модуль libs-client
в демонстрационных целях добавляет подмодулям зависимость на gson
содержит подмодули
hidden-dependency-client - демонстрирует зависимость на library-module
hidden-dependency-client-interface-only - демонстрирует зависимость на interface-only-access

для упрощения чтоб показать как будут работаь зависимости код запускается через public static void main (String... arg) методы 

Примечание: в целях упрощения демонстрации локальный мавен репозиторий используется как есть
без каких то дополнительных условий (что не правильно, и не рекомендовано согласно документации gradle)