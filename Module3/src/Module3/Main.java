package Module3;

public class Main {
    public static void main(String[] args) {
        JavaLanguage javaLanguage = new JavaWorld();
        PythonLanguage pythonLanguage = new PythonClass(javaLanguage);
        Framework_1 framework = new Framework_1(javaLanguage, pythonLanguage);
        framework.learn();
    }
}