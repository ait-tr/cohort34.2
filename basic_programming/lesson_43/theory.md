<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>



</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

Конечно, вот обновленное техническое задание с учетом добавления поля для общего счета игры:

**Техническое задание для консольной игры "21" на Java:**

**Общее описание игры:**

Игра "21" - карточная игра на одного игрока, где цель состоит в том, чтобы собрать карты на сумму 21 как можно большее
количество раз.

**Классы и функциональность:**

1. **Класс `Card`:** - карта
    - Поля:
        - `value` (int) - значение карты от 1 до 10.
        - `suit` (String) - масть карты.
    - Конструктор для инициализации карты с указанными значениями.
    - Геттеры для доступа к полям класса.

2. **Класс `Deck`:** - колода
    - Поля:
        - `cards` (Card[]) - колода карт.
    - Конструктор для создания колоды всех карт. Всего ровно 40 карт
        - 4 масти "Пики", "Червы", "Бубны", "Трефы"
        - значения от 1 до 10
    - Метод `shuffle()` для перемешивания колоды.
    - Реализация интерфейса Iterator/Iterable для перебора карт в колоде.

3. **Класс `Player`:** - игрок
    - Поля:
        - `name` (String) - имя игрока.
        - `hand` (Card[]) - текущие карты игрока (карты игрока текущего раунда).
        - `score` (int) - счет за текущий раунд.
        - `totalScore` (int) - общий счет игры.
    - Конструктор для инициализации имени игрока и начального состояния.
    - Метод `drawCard(Card card)` для добавления карты в руку и обновления счета `score`.
    - Метод `resetRound()` для сброса руки и счета за раунд.
    - Метод `addPointToTotalScore()` для добавления балла к общему счету.

4. **Игровой процесс:**
    - При старте игры игроку предлагается ввести имя.
    - Создается объект игрока и перемешанная колода карт.
        - Размер массива карт игрока при инициализации игрока и перезапуске игры равен **0** new `Card[0]`;
        - Каждый раз когда игрок получает новую карту, необходимо увеличить размер массива на **1** (смотри
          метод `drawCard(Card card)`)
        - Массив карт игрока должен быть всегда сортирован по полю `suit` - в алфавитном порядке и `value` - по
          возрастанию.
    - Игроку предлагается продолжить раунд или завершить его (ввод в консоль "y" для продолжения раунда):
        - При продолжении раунда (если игрок ввел "y") игрок берет карту из колоды. (используйте Iterator в
          классе `Deck` что бы получить следующую карту из колоды)
        - При завершении раунда (если игрок ввел "e") проверяется счет и, если достигнута сумма 21, к общему счету
          добавляется балл (метод `addPointToTotalScore()`).
        - После завершения раунда текущие карты и счет сбрасываются (метод `resetRound()`).
    - Игра заканчивается, когда колода карт иссякнет, с выводом общего счета игрока.
5. Ввод и вывод
   - для ввода используйте Scanner
   - результаты выводите в консоль

</details>