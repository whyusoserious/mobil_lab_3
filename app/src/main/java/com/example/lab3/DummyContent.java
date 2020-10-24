package com.example.lab3;
import java.util.ArrayList;
import java.util.List;

public class DummyContent {
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();
    private static final int COUNT = 25;

    static {
        // Добавление элементов в список.
        for (int k = 1; k <= COUNT; k++) {
            StringBuilder builder = new StringBuilder();
            builder.append("Информация об элементе:   ").append(k);
            for (int j = 0; j < k; j++) { builder.append("\n Детальная информация. "); }
            ITEMS.add(new DummyItem(String.valueOf(k), "Элемент " + k, builder.toString()));
        }
    }

    /** Создание класса элементов для списка. */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }
        @Override
        public String toString() { return content; }
    }
}
