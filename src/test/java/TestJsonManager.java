import edu.dp.sau.danmishchenko.lab4.controller.TypicalUniversityCreator;
import edu.dp.sau.danmishchenko.lab4.model.University;
import edu.dp.sau.danmishchenko.lab4.controller.JsonUniversity;
import edu.dp.sau.danmishchenko.lab4.controller.JsonManager;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJsonManager {
    @Test
    public void testUniversity() {
        TypicalUniversityCreator typicalUniversityCreator = new TypicalUniversityCreator();
        University oldUniversity = typicalUniversityCreator.createInstance();
        JsonUniversity jsonManager = new JsonManager();
        jsonManager.serializeUniversity(oldUniversity);
        University newUniversity = jsonManager.deserializeUniversity("university.json");
        assertEquals(oldUniversity.getListOfContent().size(), newUniversity.getListOfContent().size());
        jsonManager.removeUniversityJson();
    }
}