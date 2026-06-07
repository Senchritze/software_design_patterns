public class Main {
    public static void main(String[] args) {
        FileReader reader = new FileReader("lab19_Observer/task_3_1/resources/input01.txt");

        LongestLineObserver lineObserver = new LongestLineObserver();
        LongestWordObserver wordObserver = new LongestWordObserver();
        WordCountObserver countObserver = new WordCountObserver();
        LongestWordLineObserver lineWithWordObserver = new LongestWordLineObserver();

        reader.addObserver(lineObserver);
        reader.addObserver(wordObserver);
        reader.addObserver(countObserver);
        reader.addObserver(lineWithWordObserver);

        reader.startReading();
        reader.waitUntilFinished();

        System.out.println("Результати аналізу:");
        System.out.println("Найдовший рядок: " + lineObserver.getLongestLine());
        System.out.println("Найдовше слово: " + wordObserver.getLongestWord());
        System.out.println("Кількість слів: " + countObserver.getWordCount());
        System.out.println("Рядок із найдовшим словом: " + lineWithWordObserver.getLineWithLongestWord());
    }
}
