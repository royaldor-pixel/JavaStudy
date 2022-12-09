package com.objandcls.drumkittestdrive;

class DrumKitTestDrive {

    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        if (d.snare == true) {
            d.playSnare();
        }
        if (d.topHat == true) {
            d.playTopHat();
        }
        d.snare = false;
    }
}
