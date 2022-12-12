package bookstore.Test;
import bookstore.metier.*;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestLivre {
    public static void main(String[] args)
    {
        Livre first = new Livre("first", "moi", 105, 12.121311312132);
        Livre second = new Livre("second", "moi", 10, 12.121311312132);
        Livre third = new Livre("third", "moi", 10500, 12.121311312132);
        Livre fourth = new Livre("fourth", "moi", 1, 12.121311312132);
    }
}
