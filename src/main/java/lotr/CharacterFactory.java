package lotr;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import org.reflections.Reflections;

public class CharacterFactory {
    /*
     * methods: Character createCharacter() {
     * returns random instance of any existing character
     * }
     */
    public Character createCharacter() {
        Random rand = new Random();
        int choice = rand.nextInt(4);
        Reflections reflections = new Reflections("lotr");
        Set<Class<? extends Character>> subTypes = reflections.getSubTypesOf(Character.class);
        List<Class<? extends Character>> subTypesList = new ArrayList<>(subTypes);

        Class<? extends Character> characterClass = subTypesList.get(choice);
        try {
            return characterClass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException
                | InvocationTargetException e) {
            e.printStackTrace();
            return null; // catch an error
        }
    }
}
/*
 * What type of pattern is used in CharacterFactory?
 * Is a factory
 * Factory is a design pattern in which you create your own method
 * for creating an instance of a class
 */