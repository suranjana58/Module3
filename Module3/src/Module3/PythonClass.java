package Module3;

public class PythonClass implements PythonLanguage {
    private JavaLanguage javaLanguage;
    
    public PythonClass(JavaLanguage javaLanguage) {
        this.javaLanguage = javaLanguage;
    }
    
    @Override
    public String learningPython() {
        return "I am learning Python and " + javaLanguage.learningJava();
    }
}