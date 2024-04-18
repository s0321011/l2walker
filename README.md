На данный момент бот умеет входить в игру и бегать. 
Есть очень примитивная реализация прокачки(автобой) только руками(или тем что одето) и вывод информации о скилах и инвентаре.

**Проекту нужна помощь в качестве программистов, для разработки таких функций как прокачка, рыбалка и прочее. Если кто то может помочь в любом плане - отписывайтесь, присылайте правки и прочее - все будет добавлено.**

**Основная задумка и отличия от существующих проектов**
  * Использование геодаты и поиска пути
  * Расширенные скрипты(JAVA)
  * Открытый исходный код
  * Multi-платформенность(Win,Lin,Mac) + работа в консольном режиме(на серверах без GUI)

[Список изменений](https://code.google.com/p/l2walker/source/list)

![http://s5.hostingkartinok.com/uploads/images/2014/01/528c7325687ac1882592f103cc339684.jpg](http://s5.hostingkartinok.com/uploads/images/2014/01/528c7325687ac1882592f103cc339684.jpg)
![http://s5.hostingkartinok.com/uploads/images/2014/01/28ab68a3338c2e74fd093ad32924367a.jpg](http://s5.hostingkartinok.com/uploads/images/2014/01/28ab68a3338c2e74fd093ad32924367a.jpg)


# Build & run
```bash
ant dist
cd build/distr
java -cp "libs/*:libs/slik2d/*" fw.gui.MainSwingForm
```
