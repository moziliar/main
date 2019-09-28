package seedu.address.model;

import javafx.collections.ObservableList;
import seedu.address.model.person.Meme;

/**
 * Unmodifiable view of an address book
 */
public interface ReadOnlyAddressBook {

    /**
     * Returns an unmodifiable view of the memes list.
     * This list will not contain any duplicate memes.
     */
    ObservableList<Meme> getMemeList();

}
