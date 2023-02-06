import service.TranslationService;

public class Main {
    public static void main(String[] args) {

        TranslationService service = new TranslationService();

        service.menuChoices(service.entryAndMenu());
    }
}