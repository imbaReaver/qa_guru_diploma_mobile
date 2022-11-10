<h2 align="center"> Проект по автоматизации тестирования мобильного приложения <a target="_blank" href="https://github.com/wikimedia/apps-android-wikipedia/releases/tag/latest">Wikipedia</a> </h2>

<a target="_blank" href="https://github.com/wikimedia/apps-android-wikipedia/releases/tag/latest">
<p align="center">
  <img src="images/logo/wiki.png" width="800">
</p></a>

## :green_book:	Содержание


> ➠ [Стек технологий](#classical_building-стек-технологий)
>
> ➠ [Реализованные проверки](#earth_africa-реализованные-проверки)
>
> ➠ [Запуск тестов из терминала](#запуск-тестов-из-терминала)
>
> ➠ [Запуск тестов из Jenkins](#запуск-тестов-из-jenkins)
>
> ➠ [Отчет о результатах тестирования в Allure Report](#skier-главная-страница-allure-отчета)
>
> ➠ [Интеграция с Allure TestOps](#интеграция-с-allure-testops)
> 
> ➠ [Уведомления в Telegram с использованием бота](#-уведомления-в-telegram-с-использованием-бота)
>
> ➠ [Пример запуска теста в Selenoid](#-пример-запуска-теста-в-selenoid)


## :classical_building: Стек технологий

<p align="center">
<img width="40" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="40" title="Java" src="images/logo/Java.svg">
<img width="40" title="Selenide" src="images/logo/Selenide.svg">
<img width="40" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="40" title="Allure TestOps" src="images/logo/AllureTestOps.svg">
<img width="40" title="Gradle" src="images/logo/Gradle.svg">
<img width="40" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="40" title="GitHub" src="images/logo/GitHub.svg">
<img width="40" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="40" title="Telegram" src="images/logo/Telegram.svg">
<img width="40" title="Appium" src="images/logo/appium.png">
<img width="40" title="Appium2" src="images/logo/appium2.png">
<img width="40" title="Android Studio" src="https://cdn.worldvectorlogo.com/logos/android-studio-1.svg">


</p>

## :earth_africa: Реализованные проверки

- [x] Проверка текста на 4 экранах онбординга
- [x] Проверка функции поиска
- [x] Проверка открытия статьи

## Запуск тестов из терминала

### :robot: Локальный запуск тестов в эмуляторе с файлом local.properties

```
gradle clean test 
-DdeviceHost=emulation
```
### :robot: Локальный запуск тестов в эмуляторе без файла local.properties

```
gradle clean test 
-DdeviceHost=emulation
-DdeviceName=${DEVICE_NAME}
-DplatformVersion=${PLATFORM_VERSION}
```

### :robot: Локальный запуск тестов на реальном устройстве с файлом local.properties

```
gradle clean test 
-DdeviceHost=real
```
### :robot: Локальный запуск тестов на реальном устройстве без файла local.properties

```
gradle clean test 
-DdeviceHost=real
-DdeviceName=${DEVICE_NAME}
-DplatformVersion=${PLATFORM_VERSION}
```

### :robot: Удаленный запуск тестов с файлом remote.properties

```
gradle clean test
-DdeviceHost=browserstack
```
### :robot: Удаленный запуск тестов без файла remote.properties

```
gradle clean test
-DdeviceHost=browserstack
-Dpassword=${PASSWORD}
-Dapp=${APP}
-Ddevice=${DEVICE}
-DosVersion=${OS_VERSION}
-Dproject=${PROJECT}
-Dname=${NAME}
-Dbuild=${BUILD}
```
## Запуск тестов из Jenkins

<a target="_blank" href="https://jenkins.autotests.cloud/job/C13-imbaReaver-diploma-mobile/">**Сборка в Jenkins**</a>

<p align="center">
  <img src="images/screenshots/Jenkins2.png" width="800">
</p>

## Отчет в Allure Report
### :skier: Главная страница Allure-отчета

<p align="center">
<img title="Allure Overview" src="images/screenshots/allure_overview.png" width="800">
</p>

### :eye_speech_bubble: Тест-кейсы

<p align="center">
<img title="Allure Behaviors" src="images/screenshots/allure_behaviors.png" width="800">
</p>


### :frog: Основной дашборд

<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/allure_overview_dashboard.png" width="800">
</p>

## Интеграция с Allure TestOps
<a target="_blank" href="https://allure.autotests.cloud/launch/16606/tree?treeId=0">**Проект в TestOps**</a>
### :skier: Дашборд Allure TestOps

<p align="center">
<img title="Allure TestOps Overview" src="images/screenshots/alluretestops_overview.png" width="800">
</p>

### :eye_speech_bubble: Тест-кейсы

<p align="center">
<img title="Allure TestOps Behaviors" src="images/screenshots/alluretestops_behaviors.png" width="800">
</p>


## <img width="4%" title="Telegram" src="images/logo/Telegram.svg"> Уведомления в Telegram с использованием бота

> После завершения сборки специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом о прохождении тестов.

<p align="center">
<img title="Telegram Notifications" src="images/screenshots/telegram_notifications.png" width="400">
</p>


##  Пример запуска теста в Browserstack

> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
<p align="center">
  <img title="Selenoid Video" src="images/gif/selenoid_video.gif" width="800">
</p>
