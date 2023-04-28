package Module3;

public class Framework_1 {
    private JavaLanguage javaLanguage;
    private PythonLanguage pythonLanguage;
    
    public Framework_1(JavaLanguage javaLanguage, PythonLanguage pythonLanguage) {
        this.javaLanguage = javaLanguage;
        this.pythonLanguage = pythonLanguage;
    }
    
    public void learn() {
        System.out.println(javaLanguage.learningJava());
        System.out.println(pythonLanguage.learningPython());
    }
}
