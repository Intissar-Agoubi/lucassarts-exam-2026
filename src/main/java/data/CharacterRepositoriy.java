package data;

import java.util.ArrayList;
import java.util.List;

public class CharacterRepositoriy {
    private List<Character> characters = new ArrayList<>();

    public void addCaracter(Character c) {
        characters.add(c);
    }

    public void deleteCharacter(int id) {
        characters.remove(id);
    }
}