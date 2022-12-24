package com.set.mountain;

import org.jetbrains.annotations.NotNull;
import java.util.Comparator;
import java.util.LinkedList;

public class SortMountains {
    LinkedList<Mountain> mtn = new LinkedList<>();

    static class NameCompare implements Comparator<Mountain> {
        @Override
        public int compare(@NotNull Mountain m1, @NotNull Mountain m2) {
            return m1.name.compareTo(m2.name);
        }
    }

    static class HeightCompare implements Comparator<Mountain> {

        @Override
        public int compare(@NotNull Mountain m1, @NotNull Mountain m2) {
            return m2.height.compareTo(m1.height);
        }
    }

    public static void main(String[] args) {
        new SortMountains().go();
    }

    private void go() {
        mtn.add(new Mountain("Longs", 14255));
        mtn.add(new Mountain("Elbert", 14433));
        mtn.add(new Mountain("Maroon", 14156));
        mtn.add(new Mountain("Castle", 14265));
        System.out.println("as entered:\n" + mtn);
        NameCompare nc = new NameCompare();
        mtn.sort(nc);
        System.out.println("by name:\n" + mtn);
        HeightCompare hc = new HeightCompare();
        mtn.sort(hc);
        System.out.println("by height\n" + mtn);
    }
}
