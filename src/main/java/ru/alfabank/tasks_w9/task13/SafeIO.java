package ru.alfabank.tasks_w9.task13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.UncheckedIOException;

public class SafeIO {
    static String readFirstLineUnchecked(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
            throw new UncheckedIOException("read failed", e);
        }
    }

    static int parseIntFromFileUnchecked(String path) {
        String firstline = "";
        try {
            firstline = SafeIO.readFirstLineUnchecked(path);
            return Integer.parseInt(firstline);
        } catch (IOException e) {
            throw new UncheckedIOException("io failed", e);
        } catch (NumberFormatException e) {
            throw new IllegalStateException("parse failed: " + firstline, e);
        }
    }
}
