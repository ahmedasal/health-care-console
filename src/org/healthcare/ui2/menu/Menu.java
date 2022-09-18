package org.healthcare.ui2.menu;

import java.io.BufferedReader;
import java.io.IOException;

public interface Menu<T> {

    default void print() { };


    default T read(BufferedReader reader) throws IOException { return null;};

    static void ClearMenu() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
